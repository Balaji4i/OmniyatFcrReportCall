/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omniyat.fcr;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author gautham.r
 */
public class DbPackageCall {

    static Connection connection;
    static Statement statement;
    static ResultSet resultSet;
    static PreparedStatement ps;

    
        
    public static Connection getConnectionDS(String datasource) throws SQLException,
            NamingException {
        Connection con = null;
        DataSource data = null;
        Context initialContext = new InitialContext();
        if (initialContext == null) {

        }
        data = (DataSource) initialContext.lookup(datasource);
        if (data != null) {
            con = data.getConnection();
        } else {
            System.out.println("Failed to Find JDBC DataSource.");
        }
        return con;
    }

    
    public static Connection getDBConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
//             connection = DriverManager.getConnection("jdbc:oracle:thin:@144.21.67.79:1533/omnipdb1.606532292.oraclecloud.internal", "XXPM_TEST", "omniyat123");
             //connection = DriverManager.getConnection("jdbc:oracle:thin:@144.21.67.79:1533/omnipdb1.606532292.oraclecloud.internal", "subcont_uat", "subcont123");
             connection = DriverManager.getConnection("jdbc:oracle:thin:@144.21.67.79:1533/omnipdb1.606532292.oraclecloud.internal", "XXSUBCONTST", "Omni_tst21");

        } catch (SQLException ex) {
            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    
    /*
    * DB Initializer
    */
    
        public static void dbInitialization() throws SQLException, NamingException, ClassNotFoundException {
        connection = getConnectionDS("subcont");
//        connection=getDBConnection();
        
    }

    
    
//    public static void dbInitialization() {
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
////            connection = DriverManager.getConnection("jdbc:oracle:thin:@144.21.67.79:1533/omnipdb1.606532292.oraclecloud.internal", "XXPM_TEST", "omniyat123");
//             connection = DriverManager.getConnection("jdbc:oracle:thin:@130.61.109.253:1521/omnipdb1.sub08081309100.omnivcn1.oraclevcn.com", "XXPRISM", "PrIsm##123");
//        } catch (SQLException ex) {
//            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }

    public void projectBudgetSync(long projectId, String xmlData) throws SQLException, NamingException, ClassNotFoundException {
        dbInitialization();
        ps = connection.prepareStatement("call xxrep_report_pkg.sync_budget(?,?)");
//        System.out.println(projectId);
        ps.setLong(1, projectId);
        ps.setString(2, xmlData);
        ps.execute();
        dbDestroy();
    }

    public void projectDetailSync(long projectId, String xmlData) throws SQLException, NamingException, ClassNotFoundException {
        dbInitialization();
        ps = connection.prepareStatement("call xxrep_report_pkg.sync_project(?,?)");
        ps.setLong(1, projectId);
        ps.setString(2, xmlData);
        ps.execute();
        dbDestroy();
    }

    public void taskDetailSync(long projectId, String xmlData) throws SQLException, NamingException, ClassNotFoundException {
        dbInitialization();
        ps = connection.prepareStatement("call xxrep_report_pkg.sync_task(?,?)");
        ps.setLong(1, projectId);
        ps.setString(2, xmlData);
        ps.execute();
        dbDestroy();
    }

    public static String fcrReport(long p_bu_id, long p_project_id, String p_date) {
        String xmlString = null;
        try {
            dbInitialization();
            System.out.println("Date issss"+p_date);
            String sql = "select xxrep_report_pkg.fcr_detail(" + p_project_id + ",'" + p_date + "')xml from dual";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                xmlString = resultSet.getString("xml");
                System.out.println(xmlString);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dbDestroy();
            } catch (SQLException ex) {
                Logger.getLogger(DbPackageCall.class.getName()).log(Level.SEVERE, null, ex);
            }
            return xmlString;
        }
    }

    public static void dbDestroy() throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (ps != null) {
            ps.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}

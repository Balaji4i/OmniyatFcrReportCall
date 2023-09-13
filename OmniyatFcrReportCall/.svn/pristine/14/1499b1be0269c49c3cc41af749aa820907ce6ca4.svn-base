/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omniyat.fcr;

/**
 *
 * @author gautham.r
 */
public class WsPayload {
        
    static String getProjectBudget(long p_project_id, long p_bu_id, String p_date) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String projectBudget =
"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v2=\"http://xmlns.oracle.com/oxp/service/v2\">\n" +
"   <soapenv:Header/>\n" +
"   <soapenv:Body>\n" +
"      <v2:runReport>\n" +
"         <v2:reportRequest>\n" +
"            <v2:parameterNameValues>\n" +
"               <v2:listOfParamNameValues>\n" +
"                  <!--Zero or more repetitions:-->\n" +
"                  <v2:item>\n" +
"                     <v2:name>p_org_id</v2:name>\n" +
"                     <v2:values>\n" +
"                        <!--Zero or more repetitions:-->\n" +
"                        <v2:item>"+p_bu_id+"</v2:item>\n" +
"                     </v2:values>\n" +
"                  </v2:item>\n" +
"                  <v2:item>\n" +
"                     <v2:name>p_project_id</v2:name>\n" +
"                     <v2:values>\n" +
"                        <!--Zero or more repetitions:-->\n" +
"                        <v2:item>"+p_project_id+"</v2:item>\n" +
"                     </v2:values>\n" +
"                  </v2:item>\n" +
"                  <v2:item>\n" +
"                     <v2:name>p_as_on_date</v2:name>\n" +
"                     <v2:values>\n" +
"                        <!--Zero or more repetitions:-->\n" +
"                        <v2:item>"+p_date+"</v2:item>\n" +
"                     </v2:values>\n" +
"                  </v2:item>\n" +
"               </v2:listOfParamNameValues>\n" +
"            </v2:parameterNameValues>\n" +
"            <v2:reportAbsolutePath>/Custom/Custom PasS/Report/Project - Budget Cost.xdo</v2:reportAbsolutePath>\n" +
"         </v2:reportRequest>\n" +
"         <v2:userID>PRISM@omniyat.com</v2:userID>\n" +
"         <v2:password>0mniy@t123</v2:password>\n" +
"      </v2:runReport>\n" +
"   </soapenv:Body>\n" +
"</soapenv:Envelope>";
       return projectBudget;
}

    static String getProjectDetail(long p_project_id, long p_bu_id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String projectBudget =
"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v2=\"http://xmlns.oracle.com/oxp/service/v2\">\n" +
"   <soapenv:Header/>\n" +
"   <soapenv:Body>\n" +
"      <v2:runReport>\n" +
"         <v2:reportRequest>\n" +
"            <v2:parameterNameValues>\n" +
"               <v2:listOfParamNameValues>\n" +
"                  <!--Zero or more repetitions:-->\n" +
"                  <v2:item>\n" +
"                     <v2:name>p_org_id</v2:name>\n" +
"                     <v2:values>\n" +
"                        <!--Zero or more repetitions:-->\n" +
"                        <v2:item>"+p_bu_id+"</v2:item>\n" +
"                     </v2:values>\n" +
"                  </v2:item>\n" +
"                  <v2:item>\n" +
"                     <v2:name>p_project_id</v2:name>\n" +
"                     <v2:values>\n" +
"                        <!--Zero or more repetitions:-->\n" +
"                        <v2:item>"+p_project_id+"</v2:item>\n" +
"                     </v2:values>\n" +
"                  </v2:item>\n" +
"               </v2:listOfParamNameValues>\n" +
"            </v2:parameterNameValues>\n" +
"            <v2:reportAbsolutePath>/Custom/Custom PasS/Report/Project - Detail.xdo</v2:reportAbsolutePath>\n" +
"         </v2:reportRequest>\n" +
"         <v2:userID>PRISM@omniyat.com</v2:userID>\n" +
"         <v2:password>0mniy@t123</v2:password>\n" +
"      </v2:runReport>\n" +
"   </soapenv:Body>\n" +
"</soapenv:Envelope>";
       return projectBudget;
}
    static String getTaskDetail(long p_project_id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String projectBudget =
"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v2=\"http://xmlns.oracle.com/oxp/service/v2\">\n" +
"   <soapenv:Header/>\n" +
"   <soapenv:Body>\n" +
"      <v2:runReport>\n" +
"         <v2:reportRequest>\n" +
"            <v2:parameterNameValues>\n" +
"               <v2:listOfParamNameValues>\n" +
"                  <!--Zero or more repetitions:-->\n" +
"                  <v2:item>\n" +
"                     <v2:name>p_project_id</v2:name>\n" +
"                     <v2:values>\n" +
"                        <!--Zero or more repetitions:-->\n" +
"                        <v2:item>"+p_project_id+"</v2:item>\n" +
"                     </v2:values>\n" +
"                  </v2:item>\n" +
"               </v2:listOfParamNameValues>\n" +
"            </v2:parameterNameValues>\n" +
"            <v2:reportAbsolutePath>/Custom/Custom PasS/Report/Task - Detail.xdo</v2:reportAbsolutePath>\n" +
"         </v2:reportRequest>\n" +
"         <v2:userID>PRISM@omniyat.com</v2:userID>\n" +
"         <v2:password>0mniy@t123</v2:password>\n" +
"      </v2:runReport>\n" +
"   </soapenv:Body>\n" +
"</soapenv:Envelope>";
       return projectBudget;
}
}

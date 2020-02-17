/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletest;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Rusiru-PC
 */
public class DummyServer {
    
    String serverName = "2.1";
    
//    String testConnection(){
//        System.out.println("DummyServer. Connection been tested......");
//        return "Connection Succeded";
//    }
//    
//    String testConnection(String id){
//        System.out.println("DummyServer. Connection been tested......");
//        return "Connection from " + id + " Succeded";
//    }
//    
//    String testConnection(String id){
//        System.out.println("DummyServer. Connection been tested......");
//        return "Server " +  serverName + ": Connection from " + id + " Succeded";
//    }
       
    String testConnection(String id){
        Date date= new Date();     
	long time = date.getTime();
	Timestamp ts = new Timestamp(time);

        System.out.println("DummyServer. Connection been tested......"); 
        return ts + " - Server " +  serverName + ": Connection from " + id + " Succeded";
    }
    
}

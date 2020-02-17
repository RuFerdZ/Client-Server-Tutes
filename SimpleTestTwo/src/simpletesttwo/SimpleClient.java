/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesttwo;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rusiru-PC
 */
public class SimpleClient {

    SimpleCalculatorServer server = new SimpleCalculatorServer();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleClient simpleClient = new SimpleClient();
        simpleClient.executeTest();
    }
    
    private void executeTest(){
        
        System.out.println("[CLIENT] - Testing if the server is conneceted...");
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - The Client is connected, the test can proceed...");
            
            //ADD METHOD
            int x = 2;
            int y = 3;
            System.out.println("[CLIENT] - Asking the server what is the sum of " + x + " and " + y);
            int z = server.addIntegerNumbers(x,y);
            System.out.println("[CLIENT] - The server has replied that the sum of " + x + " and " + y + " is " + z);
            if(z==x+y){
                System.out.println("[CLIENT] - The server has returned the correct answer");
            }else{
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
            
            //DIVIDE METHOD
            x = 4;
            y = 5;
            System.out.println("[CLIENT] - Asking the server what is the ratio of " + x + " and " + y);
            try {
                double r = server.divideIntegerNumbers(x,y);
                System.out.println("[CLIENT] - The server has replied that the ratio of " + x + " and " + y + " is " + r);
            if(r==x/y){
                System.out.println("[CLIENT] - The server has returned the correct answer");
            }else{
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //MULTIPLY METHOD
            x = 4;
            y = 5;
            System.out.println("[CLIENT] - Asking the server what is the product of " + x + " and " + y);
            try {
                z = server.multiplyIntegerNumbers(x,y);
                System.out.println("[CLIENT] - The server has replied that the product of " + x + " and " + y + " is " + z);
            if(z==x/y){
                System.out.println("[CLIENT] - The server has returned the correct answer");
            }else{
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //SUBSTRACT METHOD
            x = 4;
            y = 5;
            System.out.println("[CLIENT] - Asking the server what is the difference of " + x + " and " + y);
            try {
                z = server.substractIntegerNumbers(x,y);
                System.out.println("[CLIENT] - The server has replied that the difference of " + x + " and " + y + " is " + z);
            if(z==x/y){
                System.out.println("[CLIENT] - The server has returned the correct answer");
            }else{
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            //ADD METHOD
            int[] a = {2,3,4};
            int[] b = {5,6,7};
            System.out.println("[CLIENT] - Asking the server what is the sum of " + Arrays.toString(a) + " and " + Arrays.toString(b));
            int[] c;
            try {
                c = server.addArray(a,b);
                 System.out.println("[CLIENT] - The server has replied that the sum of " + Arrays.toString(a) + " and " + Arrays.toString(b) + " is " + Arrays.toString(c));
                if(z==x+y){
                    System.out.println("[CLIENT] - The server has returned the correct answer");
                }else{
                    System.out.println("[CLIENT] - The server has returned the WRONG answer");
                }
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
            //DIVIDE METHOD
//            a = 4;
//            b = 5;
//            System.out.println("[CLIENT] - Asking the server what is the ratio of " + 00x + " and " + y);
//            try {
//                double d = server.divideIntegerNumbers(x,y);
//                System.out.println("[CLIENT] - The server has replied that the ratio of " + x + " and " + y + " is " + d);
//            if(d==x/y){
//                System.out.println("[CLIENT] - The server has returned the correct answer");
//            }else{
//                System.out.println("[CLIENT] - The server has returned the WRONG answer");
//            }
//            } catch (Exception ex) {
//                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            //MULTIPLY METHOD
//            a = 4;
//            b = 5;
//            System.out.println("[CLIENT] - Asking the server what is the product of " + x + " and " + y);
//            try {
//                c = server.multiplyIntegerNumbers(x,y);
//                System.out.println("[CLIENT] - The server has replied that the product of " + x + " and " + y + " is " + z);
//            if(z==x/y){
//                System.out.println("[CLIENT] - The server has returned the correct answer");
//            }else{
//                System.out.println("[CLIENT] - The server has returned the WRONG answer");
//            }
//            } catch (Exception ex) {
//                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            //SUBSTRACT METHOD
//            a = 4;
//            b = 5;
//            System.out.println("[CLIENT] - Asking the server what is the difference of " + x + " and " + y);
//            try {
//                c = server.substractIntegerNumbers(x,y);
//                System.out.println("[CLIENT] - The server has replied that the difference of " + x + " and " + y + " is " + z);
//            if(z==x/y){
//                System.out.println("[CLIENT] - The server has returned the correct answer");
//            }else{
//                System.out.println("[CLIENT] - The server has returned the WRONG answer");
//            }
//            } catch (Exception ex) {
//                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
//            }
            
            System.out.println("[CLIENT] - Test Completed");
        }else{
            System.out.println("[CLIENT] - The Client is NOT connected, the test has failed...");
        }
    }
}

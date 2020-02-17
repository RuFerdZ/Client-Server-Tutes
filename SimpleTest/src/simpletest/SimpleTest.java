/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletest;

/**
 *
 * @author Rusiru-PC
 */
public class SimpleTest {

    DummyServer server = new DummyServer();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleTest test = new SimpleTest();
        //server.testConnection();
        test.server.testConnection("127.0.0.1");
        //execute();
    }
    
    private static void execute(){
        throw new UnsupportedOperationException("Not Supported yet.");
    }
    
}

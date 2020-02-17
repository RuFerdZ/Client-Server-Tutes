/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesttwo;

/**
 *
 * @author Rusiru-PC
 */
public class SimpleCalculatorServer {
    
    public boolean isServerConnected(){
        System.out.println("[SERVER] - Connection is been tested...");
        return true;
    }
    
    public int addIntegerNumbers(int a , int b){
        System.out.println("[SERVER] - Adding " + a + " and " + b + "...");
        return a+b;
    }
    
    public double divideIntegerNumbers(int a , int b) throws Exception{
        if((b==0)||((b==0)&&(a==0))){
            throw new Exception();
        }
        System.out.println("[SERVER] - Dividing " + a + " and " + b + "...");
        return (double)a/b;
    }
    
    public int substractIntegerNumbers(int a , int b){
        System.out.println("[SERVER] - Substracting " + a + " and " + b + "...");
        return a-b;
    }
    
    public int multiplyIntegerNumbers(int a , int b){    
        System.out.println("[SERVER] - Multiplying " + a + " and " + b + "...");
        return a*b;
    }
    
    //Array Operations
    
    public int[] multiplyArray(int a[] , int b[]) throws Exception{    
        System.out.println("[SERVER] - Multiplying " + a + " and " + b + "...");
        if(a.length!=b.length){
            throw new Exception();
        }       
        int[] c = new int[a.length];       
        for(int i = 0 ; i < a.length; i++){
            c[i] = a[i]*b[i];
        }      
        return c;
    }
    
    public double[] divideArray(int a[] , int b[]) throws Exception{    
        System.out.println("[SERVER] - Dividing " + a + " and " + b + "...");
        if(a.length!=b.length){
             throw new Exception();
        }
        double[] c = new double[a.length];

        for(int i = 0 ; i < a.length; i++){
            if((b[i]==0)||((b[i]==0)&&(a[i]==0))){
                throw new Exception();
            }   
             c[i] = (double)a[i]/b[i];
        }
        return c;
    }
    
    public int[] addArray(int[] a , int[] b) throws Exception{    
        System.out.println("[SERVER] - Adding " + a + " and " + b + "...");
        if(a.length!=b.length){
            throw new Exception();
        }
        int[] c = new int[a.length];        
        for(int i = 0 ; i < a.length; i++){
            c[i] = a[i]+b[i];
        }       
        return c;
    }
    
    public int[] substractArray(int[] a , int[] b) throws Exception{    
        System.out.println("[SERVER] - Substracting " + a + " and " + b + "...");
        if(a.length!=b.length){
            throw new Exception();
        }   
        int[] c = new int[a.length];
        
        for(int i = 0 ; i < a.length; i++){
            c[i] = a[i]-b[i];
        }     
        return c;
    }
}

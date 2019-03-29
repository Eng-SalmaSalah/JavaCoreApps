/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author salma
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static double div(int a,int b) throws ArithmeticException{
    return a/b;
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        div(5,0);
        }
        catch(ArithmeticException e)
        {
        System.out.print("error");
        }
    }
    
}

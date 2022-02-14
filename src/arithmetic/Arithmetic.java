/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import arithmetic.ArithmeticBase.X;
import arithmetic.ArithmeticBase.Y;
import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * date 14/02/22
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       ArithmeticBase r= new ArithmeticBase(X,Y);
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: ");
        String s= sc.next();
        switch (s.toUpperCase()) 
        {
            case "PLUS":
                return x + y;
           case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        double result = r.calculate(m,n);
        System.out.println("result :" +result); 
    
}


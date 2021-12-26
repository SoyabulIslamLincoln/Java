/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrank_code;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author islam
 */
public class biginteger {

    private static BigInteger a;
    private static BigInteger b;
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        
        a = input.nextBigInteger();
        b = input.nextBigInteger();
        
        BigInteger C = a.add(b);
        BigInteger D = a.multiply(b);
        
        System.out.printf("%d \n %d", C, D);
                
        
        
        
        
    }
    
}

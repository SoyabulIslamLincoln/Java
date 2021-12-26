/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_basic_programs;
import java.util.Scanner;
/**
 *
 * @author islam
 */
public class Fibonacci {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        n = input.nextInt();
        
        int first =0;
        int second =1;
        System.out.print(first+ " "+ second );
        int fibo;
        for(int i=2; i<=n; i++){
            fibo = first+ second;
            System.out.print(" "+fibo);
            first = second;
            second=fibo;
                    
            
        }
    }
}

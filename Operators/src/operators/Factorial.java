/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operators;
import java.util.Scanner;

/**
 *
 * @author islam
 */
public class Factorial {
    public static void main(String[] args){
        int n, i, fact=1;
        Scanner input = new Scanner(System.in);
        System.out.print("ENter a positive number: ");
        n= input.nextInt();
        
        for(i=1;i<=n;i++){
            fact = fact *i;
            
        }
        System.out.printf("Factorial of %d= %d", n, fact);
    }
    
}

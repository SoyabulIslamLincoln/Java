/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrank_code;
import java.util.Scanner;
/**
 *
 * @author islam
 */
public class Type_conversion {
    public static void main(String[] args){
        int n;
        
        Scanner input = new Scanner(System.in);
        
        n = input.nextInt();
        
        String s = String.valueOf(n);
        
        if (n>=-100 && n<=100 ){
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } 
            else {
                System.out.println("Wrong answer.");
            }
        }
        else{
            System.out.println("Wrong answer");
            
        }
        
    }
    
}

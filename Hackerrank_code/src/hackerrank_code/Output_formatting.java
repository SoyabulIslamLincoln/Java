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
public class Output_formatting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i, n;
        String s;
        for(i=1; i<=32; i++){
            System.out.print("=");
            
        }
        System.out.print("\n");
        for (i=0; i<3; i++){
            s= input.next();
            n = input.nextInt();
            System.out.printf("%-15s%03d\n", s, n);
            
        }
        for(i=1; i<=32; i++){
            System.out.print("=");
            
        }
        
    }
  
}

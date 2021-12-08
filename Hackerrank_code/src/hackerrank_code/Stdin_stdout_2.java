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
public class Stdin_stdout_2 {
    public static void main(String[] args){
        int a;
        double b;
        String c;
        
        Scanner input =new Scanner(System.in);
        //Scanner name =new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextDouble();
        input.nextLine();
        c = input.nextLine();
        
        System.out.println("String: "+c);
        System.out.println("Double: "+b);
        System.out.println("Int: "+a);
                
    }
    
}

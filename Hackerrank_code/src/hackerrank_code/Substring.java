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
public class Substring {
    public static void main(String[] args){
        int a, b;
        String s;
        Scanner input = new Scanner(System.in);
        
        s = input.nextLine();
        a = input.nextInt();
        b= input.nextInt();
        
        
        
        
        System.out.printf(s.substring(a, b));
    }
    
}

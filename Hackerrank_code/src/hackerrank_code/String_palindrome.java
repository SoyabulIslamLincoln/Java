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
public class String_palindrome {
    public static void main(String[] args){
        String s, reverse="";
        Scanner input= new Scanner(System.in);
        
        s = input.nextLine();
        s = s.toLowerCase();
        for(int i = (s.length()-1); i >=0; --i){
            reverse = reverse+ s.charAt(i);
            
        } 
        if (s.equals(reverse)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrank_code;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author islam
 */
public class pattern_syntax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        
        while(i >0){
            String word = input.nextLine();
            try{
                Pattern.compile(word);
                System.out.println("Valid");
            } catch (Throwable t){
                System.out.println("Invalid");
                
            }
            i-- ;
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operators;
import java.util.*;


/**
 *
 * @author islam
 */
public class Unary_operator {
    public static void main(String[] args){
        int result, x;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a vlaue:");
        
        x = input.nextInt();
        
        result = +x;
        System.out.println("Result : "+result);
        
        result = -x;
        System.out.println("Result : "+result);
        
        result = x++;
        System.out.println("Result : "+result);
        
        result = x--;
        System.out.println("Result : "+result);
        
        result = ++x;
        System.out.println("Result : "+result);
        
        result = --x;
        System.out.println("Result : "+result);
        
                
        
        
        
    
    }
    
}

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
public class conditional_operator {
    public static void main(String[] args){
        int x, y, large;
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter 2 numbers:");
        
        x = input.nextInt();
        y=  input.nextInt();
        
        large = (x>y)?x:y;
        System.out.println("Large number"+large);
                
        
    }
    
}

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
public class TraingleArea {
    public static void main(String[] args){
        Scanner input=  new Scanner(System.in);
        
        double base, height, area;
        
        System.out.print("Enter base = ");
        base = input.nextDouble();
        
        System.out.print("Enter Height = ");
        height=  input.nextDouble();
        
        area = 0.5*base*height;
        
        System.out.println("The area of the traingle is : "+area);
        
    
    }
    
}

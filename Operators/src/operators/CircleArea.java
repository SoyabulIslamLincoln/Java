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
public class CircleArea {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        double radius, area;
        
        System.out.print("Enter radius of the circle =");
        radius=  input.nextDouble();
        
        area = Math.PI*Math.pow(radius, 2);
        
        System.out.println("Area of the circle :"+area);
        
        System.out.printf("Area of the circle : %.3f\n",area);
        
    }
    
}

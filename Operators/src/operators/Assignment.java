/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operators;
import java.util.Scanner ;


/**
 *
 * @author islam
 */
public class Assignment {
    public static void main(String[] args){
        int x, y;
        
        Scanner i = new Scanner(System.in);
        Scanner j = new Scanner(System.in);
        
        System.out.print("Enter a value = ");
        x= i.nextInt();
        
        System.out.print("Enter second value = ");
        y= j.nextInt();
        
        x+=y;
        System.out.println("Sum = "+x);
        
        x-=y;
        System.out.println("Sub = "+x);
        
        x*=y;
        System.out.println("MUL = "+x);
        
        x/=y;
        System.out.println("Div = "+x);
        
        x%=y;
        System.out.println("Divident = "+x);
                
        
        
        
                
        
        
    }
    
}

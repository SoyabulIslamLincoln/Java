/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditional.if_else;
import java.util.Scanner;

/**
 *
 * @author islam
 */
public class ConditionalIf_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a value: ");
        
        x = in.nextInt();
        
        if (x>0){
            System.out.println("The value is Positive");
        }
        else if(x==0){
            System.out.println("The value is 0");
        }
        else {
                
            System.out.println("The value is Negative");
        }
        
        
    }
    
}

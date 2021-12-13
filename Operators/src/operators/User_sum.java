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
public class User_sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i, j, total=0;
        System.out.print("Enter values: ");
        i= input.nextInt();
        j= input.nextInt();
        for (;i<=j; i++){
            total =total+i;
        }
        System.out.println("The Sum is: "+total);
        
        
    }
    
}

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
public class Sum_of_digits {
    public static void main(String[] args){
        int n,  temp,sum, num ;
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter a number: ");
        n= inp.nextInt();
        temp= n;
        sum=0;
        while (temp!=0){
            num= temp%10;
            sum= sum+num;
            temp= temp/10;
        }
        System.out.println("The sum of the digit is : "+sum);
        
    }
    
}

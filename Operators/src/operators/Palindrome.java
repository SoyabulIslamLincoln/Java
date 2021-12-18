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
public class Palindrome {
    public static void main(String[] args){
        int n, sum, num, temp, num2;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = input.nextInt();
        temp= n;
        sum=0;
       
        while(temp!=0){
            num = temp%10;
            sum = sum*10 + num;
            temp = temp/10;
                   
        }
        if(sum== n){
            System.out.printf("The %d number is a palindrome\n", n);
        }
        else if (sum !=n){
            System.out.printf("The %d number is not  a palindrome number\n", n);
        }
        
    }
        
    
}

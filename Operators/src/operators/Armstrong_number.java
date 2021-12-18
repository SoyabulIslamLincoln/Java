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
public class Armstrong_number {
    public static void main(String[] args){
        int n, sum, num, temp, num2;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = input.nextInt();
        temp= n;
        sum=0;
       
        while(temp>0){
            num = temp%10;
            sum = (int)(sum + Math.pow(num,3) );
            temp = temp/10;
                   
        }
        //System.out.println(" "+sum);
        if(sum == n){
            System.out.printf("The %d number is an Armstrong number\n", n);
        }
        else if (sum !=n){
            System.out.printf("The %d number is not  an Armstrong number\n", n);
        }
        
    }
    
}

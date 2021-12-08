/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrank_code;
import java.util.Scanner;

/**
 *
 * @author islam
 */
public class If_else {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        
        if (n%2 ==0){
            if(n >=2 & n<=5){
                System.out.println("Not Weird");
            }
            else if (n>=6 & n<=20){
                System.out.println("Weird");
            }
            else if(n>20){
                System.out.println("Not Weird");
            }
            
        }
        else if (n%2 !=0){
            System.out.println("Weird");
        }
        
    }
    
}

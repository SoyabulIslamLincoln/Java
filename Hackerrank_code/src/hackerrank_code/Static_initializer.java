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
public class Static_initializer {
    public static void main(String[] args){
        int B, H;
        Scanner input = new Scanner(System.in);
        
        B = input.nextInt();
        H = input.nextInt();
        if (B<=0 && H<= 0 || B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else if(B>0 && H>0){
        System.out.println(B*H);
    }
    }
    
}

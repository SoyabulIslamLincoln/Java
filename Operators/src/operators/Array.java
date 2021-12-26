/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operators;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author islam
 */
public class Array {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[] number ;
        String[] name ;
        number = new int[10];
        
        //int[] number = new int[10];
        for(int i=0; i< 10; i++){
            number[i]= input.nextInt();
        }
        System.out.print(Arrays.toString(number));
        
        
        
        
    }

    static boolean toString(double[] number) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

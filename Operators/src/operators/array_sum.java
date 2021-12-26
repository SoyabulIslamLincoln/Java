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
public class array_sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= input.nextInt();
        double[] number= new double[n];
        
        for(int i=0; i<n; i++){
            number[i]= input.nextDouble();
        }
        double sum=0;
        for(int j=0; j<number.length; j++){
            sum= sum+ number[j];
    }
        System.out.print(Arrays.toString(number));
        
        System.out.println();
        System.out.println(number.length);
        System.out.println(sum);
        
    
    }
}

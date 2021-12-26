/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operators;
import java.util.*;

/**
 *
 * @author islam
 */
public class Array_max_min {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= input.nextInt();
        double[] number= new double[n];
        /// take input
        for(int i=0; i<n; i++){
            number[i]= input.nextDouble();
        }
        // sum of the arrays
        double sum=0;
        for(int j=0; j<number.length; j++){
            sum= sum+ number[j];
    }
        System.out.print(Arrays.toString(number));
        // Maximum value
        double max=number[0], min= number[0];
        for (int k=0; k<number.length; k++){
            if(max<number[k]){
                max= number[k];
        }
        }
        for (int l=0; l<number.length; l++){
            if(min>number[l]){
                min = number[l];
        }
        }
        
        
        System.out.println();
        System.out.println(number.length);
        //Avaerage of sum
        System.out.println(sum/number.length);
        System.out.println("MAX   = "+max);
        System.out.println("MIN ="+min);
        
    }
    
}
    

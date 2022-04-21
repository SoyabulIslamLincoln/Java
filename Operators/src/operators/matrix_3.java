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
public class matrix_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int [][] A = new int[r][c];
        int k=0;
        
        System.out.println("Please enter the values: ");
        //Input Matrix
        for (int row = 0; row <r; row++) {
            for (int col = 0; col <c; col++) {
                A[row][col] =k;
                k++;
                
            }
            
        }
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
               System.out.print("\t"+A[row][col]);
              
            }
            System.out.println();
        }
    }
}

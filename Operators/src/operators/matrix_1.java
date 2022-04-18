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
public class matrix_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] A= new int[2][3];
        int[][] B= new int[2][3];
        int[][] C= new int[2][3];
        
        //Getting matrix value
        System.out.println("Enter elements of matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
               System.out.printf("A[%d][%d] = ", row, col);
               A[row][col]= input.nextInt();
               
            }
            
        }
        //printing matrix values
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
               System.out.print("\t"+A[row][col]);
               
               
            }
            System.out.println();
            
        }
    }
    
}

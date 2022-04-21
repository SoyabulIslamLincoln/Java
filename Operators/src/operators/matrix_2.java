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
public class matrix_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int [][] A = new int[r][c];
        int sumDiagonal=0;
        int sumUpTriangular=0;
        int sumLoTriangular=0;
        System.out.println("Please enter the values: ");
        //Input Matrix
        for (int row = 0; row <r; row++) {
            for (int col = 0; col <c; col++) {
                A[row][col] =input.nextInt();
                
            }
            
        }
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
               System.out.print("\t"+A[row][col]);
              
            }
            System.out.println();
        }
        //Sum of upper triangle, lower triangle, diagonal element
        for (int row = 0; row <r; row++) {
            for (int col = 0; col < c; col++) {
                if(row==col){
                    sumDiagonal= sumDiagonal+ A[row][col];
                }
                if (row < col){
                    sumUpTriangular = sumUpTriangular + A[row][col];
                }
                if (row > col){
                    sumLoTriangular = sumLoTriangular + A[row][col];
                }
                
            }
            
        }
        
        System.out.println("Sum Of Diagonal elements = " + sumDiagonal);
        System.out.println("Sum Of uPPER tRIANGULAR elements = " + sumUpTriangular);
        System.out.println("Sum Of Lower Triangular elements = " + sumLoTriangular);
    
        
        
        
        
        
        
    }
    
    
}

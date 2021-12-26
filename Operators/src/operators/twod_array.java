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
public class twod_array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row value: ");
        int r = input.nextInt();
        System.out.println("Enter column value: ");
        int c = input.nextInt();
        int m[][]= new int[r][c];
        
        for (int i=0; i< r; i++){
            for (int j=0;j<c;j++){
                m[i][j]= input.nextInt();
            
            }
        }
        
        
        for (int i=0; i< r; i++){
            for (int j=0;j<c;j++){
                System.out.print(m[i][j] + " ");
                        
            
            }
            System.out.println();
        }
        
        
                
    }
    
}

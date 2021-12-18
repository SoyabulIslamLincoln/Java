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
public class Prime_number {
    
    public static void main(String[] args){
        
        int m, n;
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter two value : ");
        
        m = inp.nextInt();
        n = inp.nextInt();
        int count =0;
        
        for (int i=m; i<=n;i++){
            for(int j=2; j<=i-1;j++){
                if(i % j==0){
                    count ++;
                    break;
                }
            }
            if(count ==0){
                System.out.println(i);
            }
            count=0;
            
        }
        
        
    }
    
}

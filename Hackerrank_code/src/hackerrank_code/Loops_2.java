/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrank_code;
import java.util.*;

/*We use the integers a, b, and n

to create the following series:

You are given q
queries in the form of a,b , and n . 
For each query, print the series corresponding to the given a,b ,
andn values as a single line of  n space-separated integers.  */

/**
 *
 * @author islam
 */
public class Loops_2 {
    public static void main(String[] args){
        int i, q, a,b, n, j, s;
        Scanner input = new Scanner(System.in);
        
        q = input.nextInt();
        if (q>=0 && q<=500){
            for(i=1; i<=q;i++){
                a= input.nextInt();
                b =input.nextInt();
                n =input.nextInt();
                s=a;
                if (a >=0 && b>=0 && a<=50 && b<=50 && n>=1 && n<=15){
                    for(j=1; j<=n;j++){
                        s += (int) ( Math.pow(2, j-1)*b);
                        System.out.printf("%d ", s);
                    } 
                    System.out.println();
                
            }
            }
        }
        
        
    }
    
}

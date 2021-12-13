/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operators;

/**
 *
 * @author islam
 */
public class Even_sum {
    public static void main(String[] args){
        int i=1, j=100, total=0;
        for (;i<=j;i++){
            if(i%2==0){
                total =total+i;
            }
        }
        System.out.println("SUM of even is: "+total);
    }
    
}

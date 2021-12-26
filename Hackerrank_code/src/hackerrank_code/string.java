/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrank_code;
import java.util.Scanner;
/**
 *
 * @author islam
 */
public class string {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String m = input.next();
        String n = input.next();
    
        int l = m.length() + n.length();
        System.out.println(l);
        System.out.println(m.compareTo(n)>0?"Yes":"No");
        m = m.substring(0,1).toUpperCase() + m.substring(1).toLowerCase();
        n = n.substring(0,1).toUpperCase() + n.substring(1).toLowerCase();
        System.out.println(m+" " +n);
    }
}
    
    
    
   
    
    


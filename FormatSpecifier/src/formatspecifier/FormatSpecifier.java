/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formatspecifier;

/**
 *
 * @author islam
 */
public class FormatSpecifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean b= true;
        int i = 1253;
        short s = 56;
        double d =19.67;
        float f = 12.3f;
        char c ='h';
        
        System.out.printf("boolean b= %b\n",b);
        System.out.printf("boolean i= %d\n",i);
        System.out.printf("boolean s= %d\n",s);
        System.out.printf("boolean d= %.2f\n",d);
        System.out.printf("boolean f= %.3f\n",f);
        System.out.printf("boolean c= %c\n",c);
    }
    
}

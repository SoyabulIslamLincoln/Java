
package operators;
import java.util.Scanner;

public class Operators {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //int num1 =  30;
        //int num2 = 5;
        //int result;
        int num1, num2, result;
        Scanner i=  new Scanner(System.in);
        Scanner j=  new Scanner(System.in);
        
        System.out.print("Enter a number = ");
        num1 =i.nextInt();
        
        System.out.print("Enter another number = ");
        num2 =j.nextInt();
       
        
        result=  num1+num2;
        System.out.println("Sum = "+result);
        
        result=  num1- num2;
        System.out.println("Sub = "+result);
        
        result=  num1*num2;
        System.out.println("Mul = "+result);
        
        result=  num1/num2;
        System.out.println("Div = "+result);
        
        result=  num1%num2;
        System.out.println("Div_sub = "+result);
        
        
        
    }
    
}


package userinput;
import java.util.Scanner;

public class UserInput {

    
    public static void main(String[] args) {
        //user imput
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter any number: ");
        //System.out.print("Enter any number: ");
        number = input.nextInt();
        
        System.out.println("Number = "+number);
        
        
        //string input
        
        String name;
        
        Scanner st = new Scanner (System.in);
        
        
        System.out.println("Enter Your name: ");
        name = st.nextLine();
        
        System.out.println("Name = "+name);
        
        
        
        
        
      
    }
    
}

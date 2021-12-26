/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrank_code;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;


/**
 *
 * @author islam
 */
public class currency_converter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double money = input.nextDouble();
        
        Locale indiaLocale = new Locale("en", "IN");
        Locale usLocale = new Locale("en", "US");
        Locale frLocale = new Locale("fr", "FR");
        Locale cnLocale = new Locale("zh", "CN");
        
        NumberFormat us = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(cnLocale);
        NumberFormat france = NumberFormat.getCurrencyInstance(frLocale);
        
        String US = us.format(money);
        String INDIA= india.format(money);
        String CHINA = china.format(money);
        String FRANCE = france.format(money);
        
        System.out.println("US: "+ US);
        System.out.println("India: "+INDIA);
        System.out.println("China: "+CHINA);
        System.out.println("France: "+FRANCE);
        
    }
    
}

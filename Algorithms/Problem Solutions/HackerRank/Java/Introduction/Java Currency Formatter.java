import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Echizen on 2017/3/24.
 */
public class Solution {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double payment = input.nextDouble();
        input.close();
        String us = NumberFormat.getCurrencyInstance(new Locale("en", "us")).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(payment);
        String france = NumberFormat.getCurrencyInstance(new Locale("fr", "FR")).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
/**
*知识点：NumberFormat,Locale 两个类
*
*/
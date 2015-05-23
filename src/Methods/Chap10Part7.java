package Methods;
import java.util.Scanner;

/**
 * Created by David on 5/19/2015.
 */
public class Chap10Part7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double bill, tip;
        System.out.println("How much is your bill?: ");
        bill = input.nextDouble();
        tip = tipCalc(bill);
        System.out.println("The amount you should tip is: " + tip);
    }

    static double tipCalc(double total){
        double tipPercent = 0.15;
        total = total * tipPercent;
        return total;
    }
}

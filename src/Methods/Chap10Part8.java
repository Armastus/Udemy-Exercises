package Methods;

import java.util.Scanner;

/**
 * Created by David on 5/19/2015.
 */
public class Chap10Part8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double num1, num2;
        String Operator;

        System.out.println("Please enter numbers to calculate using +, -, *, /: ");
        num1 = input.nextDouble();
        Operator = input.next();
        num2 = input.nextDouble();

        if(Operator.equals("+"))
            System.out.println("Total is: " + add(num1, num2));
        else if(Operator.equals("-"))
            System.out.println("Total is: " + sub(num1, num2));
        else if (Operator.equals("*"))
            System.out.println("Total is: " + multiply(num1, num2));
        else if(Operator.equals("/"))
            System.out.println("Total is: " + divide(num1, num2));
    }

    static double add(double n1, double n2) {
        return n1 + n2;
    }

    static double sub(double n1, double n2) {
        return n1 - n2;
    }

    static double multiply(double n1, double n2) {
        return n1 * n2;
    }

    static double divide(double n1, double n2) {
        return n1 / n2;
    }
}

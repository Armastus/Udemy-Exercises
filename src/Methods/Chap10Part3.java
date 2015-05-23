package Methods;

import java.util.Scanner;

/**
 * Created by David on 5/19/2015.
 */
public class Chap10Part3 {
    public static void main(String[] args){
        Scanner inputTemp = new Scanner(System.in);
        Scanner inputType = new Scanner(System.in);
        double temperature;
        String tempType;

        System.out.println("Enter the temperature: ");
        temperature = inputTemp.nextDouble();
        System.out.println("Convert to what type of temperature: Enter C or F? ");
        tempType = inputType.next();
        System.out.println("The converted temperature is " + convert(temperature, tempType));
    }
    //Turn both methods below into one method:
    /*static double ftoc(double temp){
        double celsius;
        celsius = (temp - 32.0) * (5.0 / 9.0);
        return celsius;
    }

    static double ctof(double temp) {
        double fahrenheit;
        fahrenheit = temp * (9.0 / 5.0) + 32.0;
        return fahrenheit;
    }*/

    static double convert(double temp, String type){
        if (type.equals("C"))
            return (temp - 32.0) * (5.0 / 9.0);
        else
            return temp * (9.0 / 5.0) + 32.0;
    }
}

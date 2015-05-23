package Methods;

import java.util.Scanner;

/**
 * Created by David on 5/19/2015.
 */
public class Chap10Part4 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int numValue = 0;

        System.out.println("Please enter a number: ");
        numValue = num.nextInt();
        if(isEven(numValue))
            System.out.println(numValue + " is even.");
        else
            System.out.println(numValue + " is odd.");

        Scanner letter = new Scanner(System.in);
        char vowel;

        System.out.println("Please enter a lowercase letter: ");
        vowel = letter.next().charAt(0);
        if(isVowel(vowel))
            System.out.println(vowel + " is a vowel.");
        else
            System.out.println(vowel + " is not a vowel.");
    }

    //predicate methods are boolean methods
    static boolean isEven(int number){
        if(number % 2 == 0)
            return true;
        else
            return false;
    }

    static boolean isVowel(char vowel){
        if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
            return true;
        else
            return false;
    }
}

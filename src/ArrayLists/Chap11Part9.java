package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by David on 5/22/2015.
 */
public class Chap11Part9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String palindrome;
        System.out.println("Enter a word to test if palindrome: ");
        palindrome = input.nextLine();
        ArrayList<String> p = new ArrayList<String>();
        buildAL(p, palindrome);
        if(isPalindrome(p)){
            System.out.println(palindrome + " is a palindrome.");
        }else{
            System.out.println(palindrome + " is not a palindrome.");
        }
    }

    static void display(ArrayList arr){
        for(int x = 0; x < arr.size(); x++){
            System.out.print(arr.get(x));
        }
        System.out.println();
    }

    static void buildAL(ArrayList<String> pword, String word){
        for(int y = 0; y < word.length(); y++){
            pword.add(word.charAt(y) + "");
        }
    }

    static boolean isPalindrome(ArrayList<String> word){
        ArrayList<String> rword = new ArrayList<String>();
        rword.addAll(word);
        Collections.reverse(rword);
        for(int ii = 0; ii < word.size(); ii++){
            if(!(rword.get(ii).equals(word.get(ii)))){
                return false;
            }
        }
        return true;
    }
}

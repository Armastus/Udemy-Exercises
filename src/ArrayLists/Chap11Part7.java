package ArrayLists;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by David on 5/22/2015.
 */
public class Chap11Part7{
    public static void main (String[] args){
        Random rand = new Random(System.currentTimeMillis());
        ArrayList<Integer> numbers = new ArrayList <Integer>();
        for(int x = 0; x < 100; x++) {
            numbers.add(rand.nextInt(101));
        }
        /*if (numbers.indexOf(100) >= 0)
            System.out.println("100 was found out position " + numbers.indexOf(100));
        else
            System.out.println("100 was not found in number.");*/
        int min = 0;
        for(int y = 1; y < numbers.size(); y++) {
            if (numbers.get(y) < numbers.get(min)) {
                min = y;
            }
        }
            System.out.println("The minimum value in numbers is " + numbers.get(min));
    }
}

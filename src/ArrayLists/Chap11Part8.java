package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by David on 5/22/2015.
 */
public class Chap11Part8 {
    public static void main(String[] args){
        Random rand = new Random(System.currentTimeMillis());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int x = 0; x < 10; x++){
            numbers.add(rand.nextInt(101));
        }
        display(numbers);
        Collections.sort(numbers);
        display(numbers);
    }

    static void display(ArrayList arr) {
        for(int x = 0; x < arr.size(); x++){
            System.out.print(arr.get(x) + " ");
        }
        System.out.println();
    }
}

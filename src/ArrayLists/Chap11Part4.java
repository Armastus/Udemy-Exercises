package ArrayLists;

import java.util.ArrayList;

/**
 * Created by David on 5/19/2015.
 */
public class Chap11Part4 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int ii = 1; ii < 11; ii++){
            numbers.add(ii);
        }

        int total = 0;

        for(int ii = 0; ii < numbers.size(); ii++){
            total += numbers.get(ii);
        }

        //.get will get an element in an ArrayList
        System.out.println("The total is: " + total);
        System.out.println("First element: " + numbers.get(0));
        //FYI the -1 always checks to the last element. So you don't need to know the size.
        System.out.println("Last element: " + numbers.get(numbers.size()-1));
    }
}

package ArrayLists;

import java.util.ArrayList;

/**
 * Created by David on 5/19/2015.
 */
public class Chap11Part3 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //the .size is the size of the list.
        /*System.out.println("The number of items is: " + numbers.size());
        numbers.add(0);
        System.out.println("The number of items is: " + numbers.size());*/

        for(int x = 0; x < 10; x++){
            numbers.add(x);
        }
        System.out.println("The number of items is: " + numbers.size());
    }
}

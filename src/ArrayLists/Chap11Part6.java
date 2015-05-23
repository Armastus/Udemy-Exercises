package ArrayLists;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by David on 5/22/2015.
 */
public class Chap11Part6 {
    public static void main (String[] args) {

        Random rand = new Random(System.currentTimeMillis());
        int number;
        /*number = rand.nextInt(101);
        System.out.println(number);*/
        ArrayList <Integer> randNumList = new ArrayList<Integer>();
        for (int x = 0; x < 10; x++){
            number = rand.nextInt(101);
            randNumList.add(number);
        }
        display(randNumList);
    }

    static void display(ArrayList arr) {
        for (int ii = 0; ii < arr.size(); ii++) {
            System.out.print(arr.get(ii) + " ");
        }
    }
}

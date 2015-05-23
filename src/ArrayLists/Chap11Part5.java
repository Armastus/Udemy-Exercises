package ArrayLists;

import java.util.ArrayList;

/**
 * Created by David on 5/19/2015.
 */
public class Chap11Part5 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int ii = 1; ii < 11; ii++){
            numbers.add(ii);
        }
        display(numbers);
        change(numbers, 5);
        display(numbers);
    }

    static void display(ArrayList arr){
        for (int ii = 0; ii < arr.size(); ii++){
            System.out.print(arr.get(ii) + " ");
        }
        System.out.println();
    }

    static void change(ArrayList<Integer> arr, int amount) {
        int value;
        for(int ii = 0; ii < arr.size(); ii++){
            value = arr.get(ii);
            arr.set(ii, value + amount);
        }
    }
}

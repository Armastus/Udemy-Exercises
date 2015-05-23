package ArrayLists;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by David on 5/22/2015.
 */
public class Chap11Part10 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        buildAL(numbers, 10);
        int max = maximum(numbers);
        display(numbers);
        System.out.println("The maximum valus is " + numbers.get(max));
    }

    static void display(ArrayList arr){
        for(int x = 0; x < arr.size(); x++){
            System.out.print(arr.get(x) + " ");
        }
        System.out.println();
    }

    static void buildAL(ArrayList<Integer> arr, int num){
        Random rand = new Random(System.currentTimeMillis());
        for(int y = 0; y < num; y++){
            arr.add(rand.nextInt(101));
        }
    }

    static int maximum(ArrayList<Integer> arr){
        int maxPos = 0;
        for(int ii = 1; ii < arr.size(); ii++){
            if(arr.get(ii) > arr.get(maxPos)){
                maxPos = ii;
            }
        }
        return maxPos;
    }
}

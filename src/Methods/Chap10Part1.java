package Methods;

/**
 * Created by David on 5/19/2015.
 */
public class Chap10Part1 {
    public static void main(String[] args){
        int num = 12;

        System.out.println(num + " Squared equals " + square(num));
    }

    //an independent method starts with static
    static int square(int number){
        return number * number;
    }
}

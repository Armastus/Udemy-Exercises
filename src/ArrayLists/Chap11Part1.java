package ArrayLists;

import java.util.ArrayList;

/**
 * Created by David on 5/19/2015.
 */
public class Chap11Part1 {
    public static void main(String[] argss) {
        double average;
        int total = 0;
        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(78);
        grades.add(84);
        grades.add(90);
        for(int ii = 0; ii < grades.size(); ii++)
            total += grades.get(ii);
        average = total / grades.size();
        System.out.println("The average is " + average);


        /*int grade1, grade2, grade3, total;
        double average;
        grade1 = 78;
        grade2 = 84;
        grade3 = 90;
        total = grade1 + grade2 + grade3;
        average = total / 3; */
    }
}

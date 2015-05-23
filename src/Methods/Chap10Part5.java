package Methods;

/**
 * Created by David on 5/19/2015.
 */
public class Chap10Part5 {
    public static void main(String[] args){
        Heading("bleepbloop", "05/19/2015");
    }
    //void method just gives stuff in method.
    static void Heading(String name, String date) {
        System.out.println("******************");
        System.out.println("* McMillan *");
        System.out.println("* 05/19/2015 *");
        System.out.println("******************");
        System.out.println("name is " + name + " date " + date);
    }
}

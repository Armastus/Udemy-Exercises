import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by David on 5/10/2015.
 */
public class ReadingInFile {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            FileInputStream fstream = new FileInputStream("C:\\Users\\David\\Desktop\\Project Euler problems via text.txt");

            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strline;

            while((strline = br.readLine()) != null) {

                //System.out.println(strline);
                //System.out.println(strline.concat("Problem"));
            }
            in.close();
        }
        catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

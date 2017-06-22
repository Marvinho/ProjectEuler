/**
 * Created by Marvi on 11.06.2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProjectEuler001Multiplesof3and5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            long m = n-1;
            long multipleOfThrees = 3*(((m/3)*(m/3+1))/2);
            long multipleOfFives = 5*(((m/5)*(m/5+1))/2);
            long multipleOfFifteen = 15*(((m/15)*(m/15+1))/2);
            // System.out.println(multipleOfThrees+" "+ multipleOfFives+" "+ multipleOfFifteen);
            System.out.println(multipleOfThrees+multipleOfFives-multipleOfFifteen);
        }
    }
}

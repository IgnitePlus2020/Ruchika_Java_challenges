import java.util.Scanner;

/**
 * Created by user on 3/24/2020.
 */
public class Concatenate {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter the two strings to concatenate:");
        s1 = in.next();
        s2 = in.next();

        System.out.println("The concatenated string is:" + (s1+s2));

    }
}

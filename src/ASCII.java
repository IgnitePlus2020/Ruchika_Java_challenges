import java.util.Scanner;

/**
 * Created by user on 3/20/2020.
 */
public class ASCII {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String ch;
        System.out.println("Enter the character to find ASCII value:");
        ch = in.next();
        System.out.println("The ASCII value is:" + (int)ch.charAt(0));

    }
}

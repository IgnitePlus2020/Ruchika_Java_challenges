import java.util.Scanner;

/**
 * Created by user on 3/24/2020.
 */
public class Largest {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 numbers:");
        int a,b,c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int largest = (a > b) ? ((a > c) ? a : c) : (b > c ? b : c);
        System.out.println("The largest is " + largest);
    }
}

import java.util.Scanner;

/**
 * Created by user on 3/20/2020.
 */
public class PerfectSquare {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double n;
        System.out.println("Enter the num to check:");
        n = in.nextDouble();
        double root = Math.sqrt(n);
        if(root - Math.floor(root) == 0)
            System.out.println("It is perfect square");
        else
            System.out.println("It is not perfect square");
    }
}

import java.util.Scanner;

/**
 * Created by user on 3/20/2020.
 */
public class Average {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the num of elements:");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n;i++)
            a[i] = in.nextInt();
        int sum = 0;
        for(int num : a)
            sum+=num;
        System.out.println("The average is " + (double)sum/n );
    }
}

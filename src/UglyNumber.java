import java.util.Scanner;

/**
 * Created by user on 3/24/2020.
 */
public class UglyNumber {
    public static void main(String args[]){
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = in.nextInt();
        for(int i = 2; i < 6 && num > 0;i++){
            while(num % i == 0)
                num /= i;
        }
        if (num == 1)
            System.out.println("It is ugly number.");
        else
            System.out.println("It is not ugly number");
    }
}

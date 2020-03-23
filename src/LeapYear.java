import java.util.Scanner;

/**
 * Created by user on 3/20/2020.
 */
public class LeapYear {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int year;
        System.out.println("Enter the year to check:");
        year = in.nextInt();
        if((year % 400== 0) || ((year % 4 == 0) && year % 100 != 0))
            System.out.println("It is leap year");
        else
            System.out.println("It is not leap year");
    }
}

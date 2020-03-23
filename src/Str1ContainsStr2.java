import java.util.Scanner;

/**
 * Created by user on 3/24/2020.
 */
public class Str1ContainsStr2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String st1,st2;
        System.out.println("Enter the string 1 :");
        st1 = in.nextLine();
        System.out.println("Enter the string to check if it is present in String 1 :");
        st2 = in.nextLine();
        System.out.println("The string2 is present in String 1 is:"+st1.contains(st2));
    }
}

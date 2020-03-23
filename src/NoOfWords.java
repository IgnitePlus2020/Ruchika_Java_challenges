import java.util.Scanner;

/**
 * Created by user on 3/24/2020.
 */
public class NoOfWords {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String st;
        System.out.println("Enter the string to count no of words:");
        st = in.nextLine();
        String [] arr = st.split(" ", st.length());
        System.out.println("The no of words are:" + arr.length);
        System.out.println("The words are:");
        for(String s: arr)
            System.out.println(s);
    }
}

import java.util.Scanner;

/**
 * Created by user on 3/24/2020.
 */
public class ToUpperCase {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Enter the string to convert to upper:");
        s = in.next();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(97 <= ch && ch <= 122)
                ch = (char)(ch - 32);
            System.out.print(ch);
        }


    }
}

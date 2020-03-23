import java.util.Scanner;

/**
 * Created by user on 3/24/2020.
 */
public class Replace_a {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String st;
        System.out.println("Enter the string:");
        st = in.nextLine();
        System.out.println("The string where a is replaced by $ is:");
        for(int i = 0; i < st.length();i++){
            char ch = st.charAt(i);
            if(ch == 'a')
                ch = '$';

            System.out.print(ch);
        }
    }
}

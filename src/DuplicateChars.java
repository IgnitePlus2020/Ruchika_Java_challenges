import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by user on 3/24/2020.
 */
public class DuplicateChars {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String st;
        System.out.println("Enter the string to check duplicate chars:");
        st = in.next();
        HashMap<Character,Integer>map = new HashMap<Character, Integer>();
        for(char c : st.toCharArray()){
            if(!map.containsKey(c))
                map.put(c, 0);

            map.put(c, map.get(c) + 1);
        }
        System.out.println("The duplicate chars are:");
        for(Character c : map.keySet()){
            int count = map.get(c);
            if(count > 1)
                System.out.println(c);
        }
    }
}

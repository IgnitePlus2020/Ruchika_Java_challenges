import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by user on 3/24/2020.
 */
public class Permutations {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String st;
        System.out.println("Enter the string to generate permutations :");
        st = in.next();
        ArrayList<String>res = new ArrayList<String>();
        getPerms("",st,res);
        System.out.println("The permutations are:");
        for(String s : res)
            System.out.println(s);
    }
    static void getPerms(String prefix,String remaining,ArrayList<String>res){
        if(remaining.length() == 0)
            res.add(prefix);
        int len = remaining.length();
        for(int i = 0;i < len;i++){
            String left = remaining.substring(0,i);
            String right = remaining.substring(i+1,len);
            char c = remaining.charAt(i);
            getPerms(prefix+c,left+right,res);
        }
    }

}

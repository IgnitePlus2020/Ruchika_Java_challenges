import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Created by user on 3/20/2020.
 */
public class CreateFile {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("Enter the name of file to create:");
        name = in.next();
        try{
            FileOutputStream file = new FileOutputStream(name);
            System.out.println("The file is created" );
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

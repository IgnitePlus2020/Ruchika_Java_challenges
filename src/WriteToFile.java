import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Created by user on 3/20/2020.
 */
public class WriteToFile {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String name,text;
        System.out.println("Enter the name of file to write data:");
        name = in.nextLine();
        System.out.println("Enter the text to write data:");
        text = in.nextLine();
        try{
            byte[] b = text.getBytes();
            FileOutputStream file = new FileOutputStream(name,true);
            file.write(b);
            file.close();
            System.out.println("The file is saved" );
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

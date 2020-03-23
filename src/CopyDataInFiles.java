import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Created by user on 3/20/2020.
 */
public class CopyDataInFiles {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String infile,outfile;
        System.out.println("Enter the name of file to pick data:");
        infile = sc.nextLine();
        System.out.println("Enter the file to write to:");
        outfile = sc.nextLine();
        try{
            FileInputStream in = new FileInputStream(infile);
            FileOutputStream out = new FileOutputStream(outfile);
            byte[] buffer = new byte[1000];
            int length;
            while((length = in.read(buffer)) > 0)
                out.write(buffer, 0, length);
            in.close();
            out.close();
            System.out.println("The file is copied successfully" );
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

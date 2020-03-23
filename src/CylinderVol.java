import java.util.Scanner;

/**
 * Created by user on 3/20/2020.
 */
public class CylinderVol {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double volume,r,h;
        System.out.println("Enter the radius of cylinder:");
        r = in.nextDouble();
        System.out.println("Enter the height of cylinder:");
        h = in.nextDouble();
        System.out.println("The volume of cylinder is:" + Math.PI*r*r*h);

    }
}

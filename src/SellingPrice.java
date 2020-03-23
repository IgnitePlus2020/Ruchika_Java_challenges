import java.util.Scanner;

/**
 * Created by user on 3/20/2020.
 */
public class SellingPrice {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double cp,discount,sp;
        System.out.println("Enter the cost price of pen:");
        cp = in.nextDouble();
        System.out.println("Enter the discount percentage:");
        discount = in.nextDouble();
        System.out.println("The discount given is:" + cp*discount/100);
        System.out.println("The selling price is:" + (cp - (cp*discount/100)));
    }
}

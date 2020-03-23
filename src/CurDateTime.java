import java.util.Date;

/**
 * Created by user on 3/19/2020.
 */
public class CurDateTime {
    public static void main(String args[]){
        Date date = new Date();
        System.out.println("Current date and time way 1:" + date);
        System.out.println("Way 2:" +java.time.LocalDate.now());
        System.out.println("Way 3:" +java.time.LocalTime.now());
    }
}

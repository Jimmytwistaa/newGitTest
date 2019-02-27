
package apple;
import java.util.Scanner;
public class Apple {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int girls, boys, people;
        girls = 11;
        boys = 3;
        people =  girls % boys;
       System.out.println(people);
    }
    
}


import java.util.Scanner;

public class Programme_16_FindPositiveNegative {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = Scan.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //Closing the scanner object
        Scan.close();
    }

    // Finding the number is Positive Negative or Zero
    public static void findNumberIsPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + " is a Positive number");
        } else if (number < 0) {
            System.out.println(number + "is a Negative number");
        } else {
            System.out.println(number + " is ZERO");

        }
    }
}



import java.util.Scanner;

class NextNumberUtility {

    int getNextNumber(int number) {

// Return next number
        return number + 1;

    }

}

public class ReturnNextNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();

// Create object
// Call method
// Print result
        NextNumberUtility obj = new NextNumberUtility();

        int res = obj.getNextNumber(number);

        System.out.print(res);
    }
}


import java.util.Scanner;

class LargestNumberUtility {

    int getLarger(int first, int second) {

// Return larger number
        if (first > second) {
            return first;
        }

        return second;

    }
}

public class ReturnLargestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();

        int second = scanner.nextInt();

// Create object
// Call method
// Print result
        LargestNumberUtility obj = new LargestNumberUtility();

        int res = obj.getLarger(first, second);

        System.out.print(res);

    }
}

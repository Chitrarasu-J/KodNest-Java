
import java.util.Scanner;

// 1. Rename the class here
class NumberUtility2 {

    int getValue(int number) {
        // Return number
        return number;
    }
}

public class NumberToMethodReturnIt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // 2. Use the renamed class here
        NumberUtility2 n1 = new NumberUtility2();

        // Pass number to the method
        int res = n1.getValue(number);

        // Print returned value
        System.out.print(res);

        sc.close(); // It's also good practice to close your scanner!
    }
}

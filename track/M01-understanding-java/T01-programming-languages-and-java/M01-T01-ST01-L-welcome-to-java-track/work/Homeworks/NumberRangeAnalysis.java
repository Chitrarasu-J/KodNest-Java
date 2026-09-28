
import java.util.Scanner;

public class NumberRangeAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();

        int end = sc.nextInt();

        sc.close();

        int even = 0;

        int odd = 0;

        for (int i = start; i <= end; i++) {

            if (i % 2 == 0) {
                even += i;
            } else {
                odd++;
            }

        }

        System.out.println("Even sum: " + even);

        System.out.print("Odd count: " + odd);

    }
}

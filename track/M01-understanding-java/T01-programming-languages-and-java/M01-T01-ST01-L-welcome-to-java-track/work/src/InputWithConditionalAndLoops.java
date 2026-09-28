
import java.util.Scanner;

public class InputWithConditionalAndLoops {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int a[] = new int[size];

        int sum = 0;
        sc.close();

        for (int i = 0; i < size; i++) {

            a[i] = sc.nextInt();

            sum += a[i];
        }

        System.out.println("Total solved: " + sum);

        String result = (sum >= 20)
                ? "Strong progress" : (sum >= 10)
                        ? "Keep improving" : "Needs more practice";

        System.out.println("Status: " + result);
    }
}

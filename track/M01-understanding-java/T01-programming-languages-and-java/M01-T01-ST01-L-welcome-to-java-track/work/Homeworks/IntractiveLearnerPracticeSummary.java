
import java.util.Scanner;

public class IntractiveLearnerPracticeSummary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int practiceDays = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= practiceDays; i++) {

            total += sc.nextInt();

        }

        sc.close();

        System.out.println("Learner: " + name);

        System.out.println("Total solved: " + total);

        double average = total / practiceDays;

        System.out.println("Daily average: " + average);

        String result = (average >= 5.0) ? "Consistent" : "Needs consistency";

        System.out.print("Status: " + result);
    }
}

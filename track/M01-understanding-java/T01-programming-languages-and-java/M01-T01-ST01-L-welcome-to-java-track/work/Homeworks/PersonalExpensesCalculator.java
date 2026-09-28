
import java.util.Scanner;

public class PersonalExpensesCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double monthlyIncome = sc.nextDouble();

        double rentExpenses = sc.nextDouble();

        double foodExpenses = sc.nextDouble();

        double travelExpenses = sc.nextDouble();

        sc.close();

        double totalExpenses = rentExpenses + foodExpenses + travelExpenses;

        double remainingExpenses = monthlyIncome - totalExpenses;

        System.out.println("Total expense: " + totalExpenses);

        System.out.println("Remaining: " + remainingExpenses);

        String result = (remainingExpenses >= 0)
                ? "Within budget" : "Over budget";

        System.out.println("Status: " + result);

    }
}

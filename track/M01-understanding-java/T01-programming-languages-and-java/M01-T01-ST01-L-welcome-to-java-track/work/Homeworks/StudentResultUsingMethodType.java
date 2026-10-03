
import java.util.Scanner;

class StudentResult {

    void showTitle() {
        System.out.println("Student Result");

    }

    void displayName(String name) {
        System.out.println("Name: " + name);

    }

    int getPassingMark() {
        return 40;
    }

    int calculateAverage(int first, int second) {
        return (first + second) / 2;

    }

}

public class StudentResultUsingMethodType {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int first = scanner.nextInt();

        int second = scanner.nextInt();

// Create object
// Call methods
// Print returned values
        StudentResult obj = new StudentResult();

        obj.showTitle();

        obj.displayName(name);

        System.out.println("Passing Mark: " + obj.getPassingMark());

        System.out.println("Average: " + obj.calculateAverage(first, second));
    }
}

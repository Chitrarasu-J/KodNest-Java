
import java.util.Scanner;

class MethodPractice {

    void showTitle() {

        System.out.println("Method Practice");

    }

    void showName(String name) {
        System.out.println("Name: " + name);

    }

    int getPassingMark() {
        return 40;
    }

    int calculateTotal(int first, int second) {
        return first + second;
    }

}

public class AllFourTypes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int first = scanner.nextInt();

        int second = scanner.nextInt();

// Create object and call all methods
        MethodPractice obj = new MethodPractice();

        obj.showTitle();

        obj.showName(name);

        System.out.println("Passing Mark: " + obj.getPassingMark());

        System.out.println("Total: " + obj.calculateTotal(first, second));
    }
}

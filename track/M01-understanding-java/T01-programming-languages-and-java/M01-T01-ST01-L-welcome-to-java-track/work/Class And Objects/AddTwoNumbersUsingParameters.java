
import java.util.Scanner;

class Calculator {

    int add(int first, int second) {

// Return sum
        int sum = first + second;

        return sum;

    }

}

public class AddTwoNumbersUsingParameters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();

        int second = scanner.nextInt();

// Create object
        Calculator cal = new Calculator();

// Call add() 
        int sum = cal.add(first, second);

// Print returned sum
        System.out.print(sum);
    }

}

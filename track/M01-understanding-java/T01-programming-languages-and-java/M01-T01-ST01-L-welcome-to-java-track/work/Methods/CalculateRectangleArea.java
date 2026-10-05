
import java.util.Scanner;

class Rectangle {

    int calculateArea(int length, int breadth) {

// Return area
        return length * breadth;

    }

}

public class CalculateRectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int breadth = scanner.nextInt();

// Create object
// Call calculateArea()
// Print area
        Rectangle obj = new Rectangle();

        int res = obj.calculateArea(length, breadth);

        System.out.print("Area: " + res);
    }
}

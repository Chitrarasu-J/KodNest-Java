
import java.util.Scanner;

class StudentUtility {

    void displayName(String name) {

        System.out.print("Student: " + name);

// Print student name
    }

}

public class ClassNamedStudentUtility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

// Create object
        StudentUtility s1 = new StudentUtility();

        s1.displayName(name);

// Call displayName()
    }
}

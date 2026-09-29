
import java.util.*;

class Student {

    int id;

    String name;

    String course;

    double javaCourse;
}

public class CreateAndDisplayStudentObject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.id = sc.nextInt();

        sc.nextLine();

        s.name = sc.nextLine();

        s.course = sc.nextLine();

        s.javaCourse = sc.nextDouble();

        System.out.println("Student Profile");

        System.out.println("ID: " + s.id);

        System.out.println("Name: " + s.name);

        System.out.println("Course: " + s.course);
        System.out.println("Java Score: " + s.javaCourse);
        sc.close();
    }
}


import java.util.*;

class Student {

    int id;

    String name;

    String course;

    double javaCourse;
}

public class TwoObjectOneClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = sc.nextInt();

        sc.nextLine();

        s1.name = sc.nextLine();

        s1.course = sc.nextLine();

        s1.javaCourse = sc.nextDouble();

        s2.id = sc.nextInt();

        sc.nextLine();

        s2.name = sc.nextLine();

        s2.course = sc.nextLine();

        s2.javaCourse = sc.nextDouble();

        sc.close();

        // s1 Details.................................................
        System.out.println("Student Profile");

        System.out.println("ID: " + s1.id);

        System.out.println("Name: " + s1.name);

        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.javaCourse);

        // s2 Details.................................................
        System.out.println("ID: " + s2.id);

        System.out.println("Name: " + s2.name);

        System.out.println("Course: " + s2.course);

        System.out.println("Java Score: " + s2.javaCourse);

    }
}

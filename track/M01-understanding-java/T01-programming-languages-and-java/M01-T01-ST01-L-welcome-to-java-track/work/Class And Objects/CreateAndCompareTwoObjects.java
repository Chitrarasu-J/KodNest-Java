
import java.util.Scanner;

class StudentC {

    int id;

    String name;

    int javaScore;

}

public class CreateAndCompareTwoObjects {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentC s1 = new StudentC();

        StudentC s2 = new StudentC();

        System.out.println("Enter details for student 1:");

        s1.id = sc.nextInt();

        sc.nextLine();

        s1.name = sc.nextLine();

        s1.javaScore = sc.nextInt();

        //.......................................................
        System.out.println("Enter details for student 2:");

        s2.id = sc.nextInt();

        sc.nextLine();

        s2.name = sc.nextLine();

        s2.javaScore = sc.nextInt();

        sc.close();

        // Student Details.................
        System.out.println("Student Details:");

        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);

        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);

        // Comparison Results000
        System.out.println("Comparison Results:");

        if (s1.javaScore > s2.javaScore) {

            System.out.println(s1.name + " has the higher Java score.");
        } else if (s2.javaScore > s1.javaScore) {

            System.out.println(s2.name + " has the higher Java score.");

        } else {
            System.out.println("Both students have the same Java score.");
        }

    }

}


import java.util.Scanner;

public class StringAsSecondInput {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        sc.nextLine();

        String name = sc.nextLine();

        sc.close();

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);
    }
}

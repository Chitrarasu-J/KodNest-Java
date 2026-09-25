
import java.util.*;

class ScannerDemo {

    public static void main(String[] args) {

// Read and display the profile
        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();

        int solvedProblems = scan.nextInt();

        double assessmentPercentage = scan.nextDouble();

        scan.close();

        System.out.println("Learner: " + firstName);

        System.out.println("Problems solved: " + solvedProblems);

        System.out.println("Assessment: " + assessmentPercentage);

    }
}

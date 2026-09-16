
class LearningCommitment {

    public static void main(String[] args) {

        double principle = 10000.0;

        double rate = 6.5;

        double time = 2.0;

        double simpleInterest = principle * rate * time / 100.0;

        System.out.println("Simple Interest: " + simpleInterest);

        System.out.println("Total Amount: " + (principle + simpleInterest));

        double Weight = 72.0;

        double height = 1.8;

        System.out.println("BMI: " + (Weight / (height * height)));

        int totalMarks = 78 + 84 + 69 + 91 + 88;

        System.out.println("Total Marks: " + totalMarks);

        System.out.println("Percentage: " + (totalMarks * 100.0) / 500);

    }
}

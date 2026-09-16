
class LearningProgress {

    public static void main(String[] args) {

        int completedTopics = 17;

        int totalTopics = 20;

        int learningHours = 3;

        int learningDays = 5;

        System.out.println("Completed Topics: " + completedTopics);

        System.out.println("Remaining Topics: " + (totalTopics - completedTopics));

        System.out.println("Weekly Learning Hours: " + (learningHours * learningDays));

        double progressPercentage = (double) completedTopics * 100 / totalTopics;

        System.out.println("Progress Percentage: " + progressPercentage);
    }
}

public class GradeProcessor {
    public static void main(String[] args) {
        int[] grades = {78, 85, 92, 67, 88, 95, 73, 90};

        int total = 0;
        for (int score : grades) {
            total += score;
        }
        double average = (double) total / grades.length;
        System.out.printf("Total: %d%n", total);
        System.out.printf("Average: %.2f%n", average);

        int maxScore = grades[0], minScore = grades[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > maxScore) {
                maxScore = grades[i];
                maxIndex = i;
            }
            if (grades[i] < minScore) {
                minScore = grades[i];
                minIndex = i;
            }
        }
        System.out.printf("Highest: %d (index %d)%n", maxScore, maxIndex);
        System.out.printf("Lowest: %d (index %d)%n", minScore, minIndex);

        int countAbove = 0;
        for (int score : grades) {
            if (score > average) {
                countAbove++;
            }
        }
        System.out.printf("Above average: %d%n", countAbove);

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d: %d%n", i, grades[i]);
        }
    }
}

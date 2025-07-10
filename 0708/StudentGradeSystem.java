public class StudentGradeSystem {
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        return 'D';
    }

    public static int findMaxIndex(int[] arr) {
        int maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static int findMinIndex(int[] arr) {
        int minIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static double proportionAboveAverage(int[] arr) {
        int sum = 0;
        for (int v : arr) sum += v;
        double avg = (double) sum / arr.length;
        int count = 0;
        for (int v : arr) if (v > avg) count++;
        return (double) count / arr.length * 100;
    }

    public static void printReport(int[] scores) {
        System.out.println("===== Student Grade Report =====");
        System.out.println("--------------------------------");

        int maxIdx = findMaxIndex(scores);
        int minIdx = findMinIndex(scores);
        double pctAbove = proportionAboveAverage(scores);

        int countA = 0, countB = 0, countC = 0, countD = 0;
        for (int v : scores) {
            char g = getGrade(v);
            switch (g) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                default:  countD++;
            }
        }
        System.out.printf("Total students       : %d%n", scores.length);
        System.out.printf("A (90+)              : %d%n", countA);
        System.out.printf("B (80-89)            : %d%n", countB);
        System.out.printf("C (70-79)            : %d%n", countC);
        System.out.printf("D (<70)              : %d%n", countD);
        System.out.printf("Highest score        : %d (student %d)%n", scores[maxIdx], maxIdx);
        System.out.printf("Lowest score         : %d (student %d)%n", scores[minIdx], minIdx);
        System.out.printf("Above average ratio  : %.2f%%%n", pctAbove);

        // 詳細列表
        System.out.println("--------------------------------");
        System.out.printf("%-8s %-6s %-6s%n", "Student", "Score", "Grade");
        System.out.println("--------------------------------");
        for (int i = 0; i < scores.length; i++) {
            char grade = getGrade(scores[i]);
            System.out.printf("%-8d %-6d %-6c%n", i, scores[i], grade);
        }
        System.out.println("================================");
    }
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        printReport(scores);
    }
}

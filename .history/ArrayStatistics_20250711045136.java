public class ArrayStatistics {
    public static void main(String[] args) {
        int[] data = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        int sum = 0;
        for (int v : data) {
            sum += v;
        }
        double average = (double) sum / data.length;

        int maxVal = data[0], minVal = data[0];
        int maxIdx = 0, minIdx = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] > maxVal) {
                maxVal = data[i];
                maxIdx = i;
            }
            if (data[i] < minVal) {
                minVal = data[i];
                minIdx = i;
            }
        }

        int aboveCount = 0;
        for (int v : data) {
            if (v > average) {
                aboveCount++;
            }
        }

        int evenCount = 0, oddCount = 0;
        for (int v : data) {
            if (v % 2 == 0) evenCount++;
            else           oddCount++;
        }

        String line = "+----------------------+---------+-------+";
        System.out.println(line);
        System.out.printf("| %-20s | %7s | %5s |%n", "Statistic", "Value", "Index");
        System.out.println(line);
        System.out.printf("| %-20s | %7d | %5s |%n", "Sum", sum, "");
        System.out.printf("| %-20s | %7.2f | %5s |%n", "Average", average, "");
        System.out.printf("| %-20s | %7d | %5d |%n", "Max", maxVal, maxIdx);
        System.out.printf("| %-20s | %7d | %5d |%n", "Min", minVal, minIdx);
        System.out.printf("| %-20s | %7d | %5s |%n", "Above avg count", aboveCount, "");
        System.out.printf("| %-20s | %7d | %5s |%n", "Even count", evenCount, "");
        System.out.printf("| %-20s | %7d | %5s |%n", "Odd count", oddCount, "");
        System.out.println(line);
    }
}

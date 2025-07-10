public class ArraySearcher {
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};

        int[] targets = {67, 100};
        for (int target : targets) {
            int idx = findElement(arr, target);
            int occ = countOccurrences(arr, target);

            System.out.printf("findElement(arr, %d) → %d%n", target, idx);
            System.out.printf("countOccurrences(arr, %d) → %d%n", target, occ);
        }
    }
}

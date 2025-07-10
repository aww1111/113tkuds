public class ArrayUtility {
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void reverseArray(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
    }

    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int findSecondLargest(int[] array) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int v : array) {
            if (v > max) {
                second = max;
                max = v;
            } else if (v > second && v < max) {
                second = v;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] data = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        System.out.print("Original array: ");
        printArray(data);

        int[] copied = copyArray(data);
        System.out.print("Copied array:   ");
        printArray(copied);

        reverseArray(data);
        System.out.print("Reversed array: ");
        printArray(data);

        reverseArray(data);

        int secondLargest = findSecondLargest(data);
        System.out.println("Second largest: " + secondLargest);
    }
}

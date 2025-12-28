public class LinearSearch {

    // Finds the first occurrence of the target element
    static int findFirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Counts how many times the target element appears
    static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    // Finds the last occurrence of the target element
    static int findLastOccurrence(int[] arr, int target) {
        int lastOccurrence = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lastOccurrence = i;
            }
        }
        return lastOccurrence;
    }

    public static void main(String[] args) {

        int[] arr = {12, 3, 9, 4, 3, 9, 9};
        int target = 9;

        int firstIndex = findFirstOccurrence(arr, target);
        int occurrences = countOccurrences(arr, target);
        int lastIndex = findLastOccurrence(arr, target);

        System.out.println("The element occurred " + occurrences + " times");
        System.out.println("The element last occurred at index " + lastIndex);

        if (firstIndex == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index " + firstIndex);
        }
    }
}

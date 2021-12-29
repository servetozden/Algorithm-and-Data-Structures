package Algorithm;

public class InsertionSort {
    public static void main(String[] args) {

        // Insertion sort is a simple sorting algorithm that builds
        // the final sorted array (or list) one item at a time. It is much less
        // efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

        Integer[] data = {1,9,6,2,3,};
        sort(data);

    }

    static void sort(Integer[] arr) {
        int i, j, newValue;
        for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = newValue;
        }
    }
}

package Algorithm;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] data = {1,9,6,2,3,};
         sort(data);
    }

    //Merge sort is one of the most efficient sorting algorithms.
    //It works on the principle of Divide and Conquer. 
    //Merge sort repeatedly breaks down a list into several sublists until each sublist consists of a single element and merging those sublists in a manner that results into a sorted list.


    public static void sort(Comparable[] a) {
        Comparable[] tmp = new Comparable[a.length];
        sort(a, tmp, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, Comparable[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            sort(a, tmp, left, center);
            sort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }

    private static void merge(Comparable[] a, Comparable[] tmp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while (left <= leftEnd && right <= rightEnd) {
            if (a[left].compareTo(a[right]) <= 0) {
                tmp[k++] = a[left++];
            } else {
                tmp[k++] = a[right++];
            }
        }

        while (left <= leftEnd) // Copy rest of first half
        {
            tmp[k++] = a[left++];
        }

        while (right <= rightEnd) // Copy rest of right half
        {
            tmp[k++] = a[right++];
        }

        // Copy tmp back
        for (int i = 0; i < num; i++, rightEnd--) {
            a[rightEnd] = tmp[rightEnd];
        }
    }
}

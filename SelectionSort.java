package Algorithm;

public class SelectionSort {

    public static void main(String[] args) {
        Integer[] data = {1,9,6,2,3,};
        sort(data);
    }

    static void sort(Integer[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

    }

}

//A sort algorithm that repeatedly searches remaining items to find the least one and moves it to its final location. The run time is Θ(n²), where n is the number of elements. The number of swaps is O(n).

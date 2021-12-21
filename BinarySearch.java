import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        
        //Binary Search is an algorithm for finding a specific value in a sorted array. At each step in this technique, it is checked whether the sought value is equal to the middle value of the array.
        int arr[] = {10,5,20,30,40,50};
        int key = 5;
        int result = Arrays.binarySearch(arr,key);
        if (result < 0)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }
}

package Sorting_Algorithms.BubbleSort;

import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {
        int[] arr = {5,2,8,6,3,7,1,0,4,9};
        System.out.println("BSort öncesi liste : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("**************");
        BubbleSort.bubbleSort(arr);
        System.out.println("BSort sontası liste ");
        System.out.println(Arrays.toString(arr));
    }
}
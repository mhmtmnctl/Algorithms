package Sorting_Algorithms.InsertionSort;

import java.util.Arrays;

public class InsertionSortRunner {
    public static void main(String[] args) {
        int[] arr1 = {12,9,4,99,120,1,3,10};
        System.out.println("ISort öncesi liste :");
        System.out.println(Arrays.toString(arr1));
        System.out.println("********************");
        System.out.println("ISort sonrası liste :");
        InsertionSort.insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("*********************");
    }
}

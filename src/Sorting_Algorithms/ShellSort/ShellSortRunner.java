package Sorting_Algorithms.ShellSort;

import java.util.Arrays;

public class ShellSortRunner {
    public static void main(String[] args) {
        int[] arr1 = {7,5,4,1,9,3,2,2}; // 3,4,5
        System.out.println("SSort olmadan öncesi liste :");
        System.out.println(Arrays.toString(arr1));
        System.out.println("*******************");
        ShellSort.shellSort(arr1);
        System.out.println("SSort sonrası liste : ");
        System.out.println(Arrays.toString(arr1));
    }
}

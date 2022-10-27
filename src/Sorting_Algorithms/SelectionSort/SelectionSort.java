package Sorting_Algorithms.SelectionSort;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        int min;
        int temp;
        int j;
        int i=0;
        for(; i<arr.length; i++){
            min = i;
            for(j= i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            // swap işlemi
            temp = arr[i];
            arr[i] = arr[min];
            arr[min]=temp;
        }

    }
}

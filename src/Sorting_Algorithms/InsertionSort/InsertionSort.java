package Sorting_Algorithms.InsertionSort;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i= 1; i<arr.length;i++ ){
            int value = arr[i];
            int j = i-1;
            //seçilen indexin sol
            // tarafındaki sayılar
            // büyükse
            //swap işlemi yapılacak
            while(j>=0 && arr[j]>value){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=value;
        }
    }

}

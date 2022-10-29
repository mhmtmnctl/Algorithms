import Sorting_Algorithms.BubbleSort.BubbleSort;
import Sorting_Algorithms.InsertionSort.InsertionSort;
import Sorting_Algorithms.MergeSort.MergeSort;
import Sorting_Algorithms.QuickSort.QuickSort;
import Sorting_Algorithms.SelectionSort.SelectionSort;
import Sorting_Algorithms.ShellSort.ShellSort;

import java.util.Arrays;
import java.util.Random;

public class WhichOneIsFaster {
    public static void main(String[] args) {
        int[] siraliListe = createOrderedLst(10000);
        int[] arr = createList(10000);
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        int[] arr3 = Arrays.copyOf(arr,arr.length);
        int[] arr4 = Arrays.copyOf(arr,arr.length);
        int[] arr5 = Arrays.copyOf(arr,arr.length);
        int[] arr6 = Arrays.copyOf(arr,arr.length);
        int[] arr7 = Arrays.copyOf(arr,arr.length);

        long startTime ;
        long endTime;
        double estimatedTime ;

        // InsertionSort
        startTime=System.currentTimeMillis();
        InsertionSort.insertionSort(arr);
//        InsertionSort.insertionSort(siraliListe);
        endTime = System.currentTimeMillis();
        estimatedTime = (double)(endTime-startTime)/1000;
        System.out.println("InsertionSort = " + estimatedTime);

        // SelectionSort
        startTime=System.currentTimeMillis();
        SelectionSort.selectionSort(arr2);
//        SelectionSort.selectionSort(siraliListe);
        endTime = System.currentTimeMillis();
        estimatedTime = (double)(endTime-startTime)/1000;
        System.out.println("SelectionSort = " + estimatedTime);

        // BubbleSort
        startTime=System.currentTimeMillis();
        BubbleSort.bubbleSort(arr3);
//        BubbleSort.bubbleSort(siraliListe);
        endTime = System.currentTimeMillis();
        estimatedTime = (double)(endTime-startTime)/1000;
        System.out.println("BubbleSort = " + estimatedTime);

        // MergeSort
        startTime=System.currentTimeMillis();
        MergeSort.mergeSort(arr4,0,arr4.length-1);
//        MergeSort.mergeSort(siraliListe,0,siraliListe.length-1);
        endTime = System.currentTimeMillis();
        estimatedTime = (double)(endTime-startTime)/1000;
        System.out.println("MergeSort = " + estimatedTime);

        // QuickSort
        startTime=System.currentTimeMillis();
        QuickSort.quickSort(arr5,0,arr5.length-1);
//        QuickSort.quickSort(siraliListe,0,siraliListe.length-1);
        endTime = System.currentTimeMillis();
        estimatedTime = (double)(endTime-startTime)/1000;
        System.out.println("QuickSort = " + estimatedTime);

        // ShellSort
        startTime=System.currentTimeMillis();
        ShellSort.shellSort(arr6);
//        ShellSort.shellSort(siraliListe);
        endTime = System.currentTimeMillis();
        estimatedTime = (double)(endTime-startTime)/1000;
        System.out.println("ShellSort = " + estimatedTime);


        //Arrays.sort()
        startTime=System.currentTimeMillis();

        Arrays.sort(arr7);
        endTime = System.currentTimeMillis();
        estimatedTime = (double)(endTime-startTime)/1000;
        System.out.println("Array.Sort = " + estimatedTime);






    }

    public static int[] createList(int elemanSayisi){
        int[] arr = new int[elemanSayisi];
        Random rm  = new Random();
        for(int i=0 ; i<arr.length; i++ ){
            arr[i] = rm.nextInt(10000);
        }
        return arr;
    }

    public static int[] createOrderedLst(int elemanSayisi){
        int[] arr = new int[elemanSayisi];
        for(int i=0 ; i< arr.length; i++) {
            arr[i]=i;
        }
        return arr;

    }
}

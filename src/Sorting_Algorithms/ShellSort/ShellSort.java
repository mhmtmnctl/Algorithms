package Sorting_Algorithms.ShellSort;

public class ShellSort {
    public static void shellSort(int[] a){
        int insert ;
        int moveItem;
        for(int gap=a.length/2; gap>0; gap/=2) {
            for(int next=gap; next<a.length ; next++) {
                insert= a[next];
                moveItem = next;
                while(moveItem>=gap && insert<a[moveItem-gap]){
                    a[moveItem]=a[moveItem-gap];
                    moveItem-=gap;
                }
                a[moveItem]=insert;
            }
        }
    }
}

package Sorting_Algorithms.QuickSort;

public class QuickSort {
    public static int partition(int[] dizi, int alt, int ust){
        // dizinin son elemanı pivot seçelim
        int pivot = dizi[ust];
        int i=(alt-1);
        //ilk iterasyondali swap işlemine uygun hale getiriliyor
        for(int j=alt;j<ust;j++){
            if(dizi[j]<=pivot){
                i++;
                int temp=dizi[i];
                dizi[i]=dizi[j];
                dizi[j]=temp;
            }

        }
        //swap işlemi
        int temp= dizi[i+1];
        dizi[i+1]=dizi[ust];
        dizi[ust]=temp;

        return i+1;
    }

    public static void quickSort(int[] dizi, int alt, int ust){
        if(alt<ust){
            int pi = partition(dizi,alt,ust);
            //pivot değeri seçilip, recursive olarak kendini çağırıyor
            quickSort(dizi,alt,pi-1);
            quickSort(dizi,pi+1,ust);

        }
    }
}
package Sorting_Algorithms.MergeSort;

public class MergeSort {

    public static void merge(int arr[], int left, int middle, int right)
    {

        int low = middle - left + 1; //sol alt-array büğüklüğü
        int high = right - middle;//sağ alt-array büğüklüğü

        int L[] = new int[low];//sol-sağ alt arrayler oluşturuluyor
        int R[] = new int[high];

        int i = 0, j = 0;

        for (i = 0; i < low; i++)//sol alt arraya elemanlar kopyalanıyor
        {
            L[i] = arr[left + i];
        }
        for (j = 0; j < high; j++)//sağ alt arraya elemanlar kopyalanıyor
        {
            R[j] = arr[middle + 1 + j];
        }


        int k = left;//
        i = 0;//
        j = 0;

        while (i < low && j < high)//sol-sağ alt arrayler merge leniyor
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < low)//sol arrayde kalan elemanlar merge leniyor

        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < high)//sağ arrayde kalan elemanlar merge leniyor
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public static void mergeSort(int arr[], int left, int right)
    {
        int middle;

        if (left < right) {
            middle = (left + right) / 2;

            mergeSort(arr, left, middle);//sol alt-array

            mergeSort(arr, middle + 1, right);//sağ alt-array



            merge(arr, left, middle, right);//2 array birleştiriliyor
        }
    }





}

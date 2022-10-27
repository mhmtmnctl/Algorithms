package BigO;

public class O1 { // O(n) ==> O(1) ( Constant Complexity )
    // Task : verilen Array in son elemanını
    //ekrana yazdırın
    public static void main(String[] args) {
        int[] arr = {1,10,23,43,77,1234};//6 eleman
        System.out.println(arr[arr.length - 1]); // tek işlem

        // başka bir örnek : verilen sayının çift olup olmadığını
        // kontrol edin
        int x = 24 ;
        if(x%2==0) System.out.println("cift");


    }


}

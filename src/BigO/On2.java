package BigO;

public class On2 { // O(n^2) --> Quadratic Complexity
    public static void main(String[] args) {
        int count = 0 ; // 1 işlem
        int[] arr = {2,1,5}; // 1 işlem
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i]+arr[j]);
                count++;
            }


        }
        System.out.println("count : "+count);

    }
}

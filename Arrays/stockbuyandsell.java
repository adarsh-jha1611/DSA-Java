
import java.util.*;

 class stockbuyandsell {

    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n]

    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
}

    int maxPro = maxProfit(arr);
    System.out.println("Max profit is: " + maxPro);

    }
    static int maxProfit(int[] arr) {
    int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        minPrice = Math.min(minPrice, arr[i]);
        maxPro = Math.max(maxPro, arr[i] - minPrice);
    }
    return maxPro;
    }
}

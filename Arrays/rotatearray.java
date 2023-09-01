package Arrays;

import java.util.*;

public class rotatearray
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n]

    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
}

    static void rotate()
    {
       int i = 0, j = arr.length - 1;
       while(i != j)
       {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         i++;
       }
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));
        
        rotate();
        
        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
    }
}

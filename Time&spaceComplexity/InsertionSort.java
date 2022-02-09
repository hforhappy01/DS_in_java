import java.util.*;
import java.io.*;
public class InsertionSort {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        for(int i = 1; i <= arr.length-1; i++){ // 5 ke liye 4 hi journey hongi
            // loop zero se chlaoge to 3 tk jaaoge 1 se chlaaoge to 4 tk jaaoge
            for(int j = i-1; j >= 0; j--){
             if(arr[j]>arr[j+1]){
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }   
             else {
                 break;
             }

             

            }
        }

        for(int val : arr){
            System.out.println(val+" ");
        }

        

        
    }


}

import java.util.*;
import java.io.*;

public class BubbleSort{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        bubblesort(arr);

    }

    public static void bubblesort(int[] arr){
        for(int journey = 0; journey < arr.length-1; journey++){   /* journey here defines if there is 5 elements in unorganised manner to organise them we  need to travel through it 4 times
             ex - [1,3,2] => tin element hai to 2 journey hongi
             journey 1 
             1-3 compare - is 1 smaller than 3 if yes dont do any thing other wise swap it
             3-2 comparison - is 3 smaller than 2 if no swap it  2-3 => 1 2 3
            journey 2
             journey compare each elment  is 1 smaller than 2  and 2 is smaller than 3 don't do any thing */
           
             for(int j = 0; j < arr.length-1-journey; j++){  // j here defines the comparison suppose there is 5 elements in an array than we need to compare it for 4 times
                if(NoisSmaller(arr,j+1,j)==true){
                    Swap(arr,j+1,j);        // swap the element at j+1 with jth element 
                }
            }
        }

        for(int j = 0; j < arr.length ;j++){
            System.out.println(arr[j]);
        }
    }

    public static boolean NoisSmaller(int[]arr , int i, int j){
        if(arr[i]<arr[j]){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void Swap(int[]arr , int i, int j){
        int temp = 0;
        temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }



}
import java.util.*;
import java.io.*;

public class SelectionSort{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        selsort(arr);

    }

    public static void selsort(int[] arr){
        for(int journey = 0; journey < arr.length-1; journey++){   /* journey here defines if there is 5 elements in unorganised manner to organise them we  need to travel through it 4 times
             ex - [1,3,2] => tin element hai to 2 journey hongi
             journey 1 
             1-3 compare - is 1 smaller than 3 if yes dont do any thing other wise swap it
             3-2 comparison - is 3 smaller than 2 if no swap it  2-3 => 1 2 3
            journey 2
             journey compare each elment  is 1 smaller than 2  and 2 is smaller than 3 don't do any thing */
           
             int minvalueindex = journey ;  

             for(int j = journey+1; j <= arr.length-1; j++){  // j here defines the comparison suppose there is 5 elements in an array than we need to compare it for 4 times
                if(NoisSmaller(arr,j,minvalueindex)==true){ // why I have not kept journey as comparing no?-> bcz journey start with place 1 every time and min value index is already changed to something else when loop starts again instead comparing 
                    //next jth element with min value index we compare it with journey it will return us a last min value index no which will give some different result ex - 8 4 5 6 in this ex 8 swap its positin with 6 instead of 4 that is what we not wanted.
                    minvalueindex = j;      // minvalueindex becomes j and j moves to the next element position in the array
                }
            }
            Swap(arr,journey,minvalueindex);
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
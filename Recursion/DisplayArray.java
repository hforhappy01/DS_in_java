

import java.io.*;
import java.util.*;
public class DisplayArray {
    public static void main(String[] args){
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int [] array = new int[n];
          for(int i = 0; i < array.length; i++){
              array[i] = scn.nextInt();
           }
          display_Array(array , 0);
    }
// expectation => display_Array(a,i) => a[i] a[i+1] a[i+2]... a[i+n-1] a[i+n]
// faith => display_Array(a ,i+1) => a[i+1] a[i+2] ...
// ewedsfaith => display_array(a,i)=> a[i] display_Array(a,i+1)
   
    public static void display_Array (int[] array, int i ){
        System.out.println(array[i]);
        display_Array(array, i+1);
    }
}

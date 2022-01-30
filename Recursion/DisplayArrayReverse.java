import java.util.*;
import java.io.*;

public class DisplayArrayReverse {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        display_arr_reverse(array,0);
    }

    // expectation => display_arr_reverse(a,0) = 5 4 3 2 1 
    // faith => display_arr_reverse(a,1) = 5 4 3 2 
    // ewf = > d(a,0) => display_arr_reverse(a,1) a[0]
    
    public static void display_arr_reverse(int [] a, int i){
        if(i==a.length){
            return;
        }
        
        display_arr_reverse(a,i+1);
        System.out.println(a[i]);
    }
}

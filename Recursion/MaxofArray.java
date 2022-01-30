import java.util.*;
import java.io.*;

public class MaxofArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] array = new int[n];
        for (int i = 0; i <array.length; i++)  {
            array[i] = scn.nextInt();
        }
        int arraymax = maxofarr(array,0);
        System.out.println(arraymax);
    }

    // expectation => maxofarr(array, i)=> [5 4 3 2 1 ] => 5
    // faith = > maxofarr(array,i+1) => [4 3 2 1 ] = 4
    // ewf = > maxofarr (array,i) => array[0]=5 compares with 4 => 5

    public static int maxofarr(int[] array, int i){
        if(i == array.length - 1){ // why I applied this condition?
        /*     soln - suppose we have only one element for that index is 0 and array.lenght is 1 
            when we minus 1 from array.lenght it is equal to zero so element at the zeroth position is the max ultimately because there is no other element we can compare it with 
            ex - u have array in which there is only one element so that element is max also 
            a[0] = 99 -> 99 itself is ma */
            return array[i];  
        }

        int maxis = maxofarr(array, i+1); // maxis is the greatest element from index + 1 to the end
        if(array[i] > maxis){
            return array[i];
        }
        else{
            return maxis;
        }

    }
}


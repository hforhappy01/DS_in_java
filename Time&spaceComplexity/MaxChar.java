import java.util.*;
import java.io.*;

public class MaxChar {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    int[] farr = new int[26];

    for(int i=0; i<str.length(); i++){

        char ch = str.charAt(i);
        int index = ch - 'a';
        farr[index]++ ;
    }

    int maxIdx = 0;
    for(int i=0; i<farr.length; i++){
        if(farr[i]>farr[maxIdx]){
            maxIdx = i;
        }
    }
    char maxchar = (char)(maxIdx + 'a'); 
    System.out.println(maxchar);
    


}   
}

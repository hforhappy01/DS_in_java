import java.util.*;
import java.io.*;


public class Printzigzag {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("enter the no");
        int n = scn.nextInt();
        zigzag(n);
        
    }

    // I have used euler tree to do low level thinking.

    
    
    public static void zigzag(int n) {
        if(n==0){
            return ; 
        }

        System.out.print(n);  //a-  pre area 
        zigzag(n-1);          //b - left call
        System.out.print(n);  //c - inner area 
        zigzag(n-1);          // d - right call
        System.out.print(n);  // e - post area

    }

}

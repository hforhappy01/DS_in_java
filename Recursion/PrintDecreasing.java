// work on the principle of mathematical induction 


import java.util.*;
public class PrintDecreasing{
     public static void main(String[] args) throws Exception{
            Scanner scn = new Scanner(System.in);
            System.out.println("enter the value");
            int n = scn.nextInt();
            PD(n);
     }
     // recursion - function calling itself using recursive method
     // expectaion =>pd(n)= n n-1 n-2 .... 3 2 1 /pd(5) = 54321 
     //faith => pd(n-1)= n-1 n-2 n-3 n-4 .... 3 2 1 /pd(4) = 4321
     // E weds faith => pd(n) = n pd(n-1) /pd(5) = 5 pd(4)
     public static void PD(int n){
         if(n == 0){
             return;
         }
         System.out.println(n);
         PD(n-1);
     }
}



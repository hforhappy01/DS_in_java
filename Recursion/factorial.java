import java.util.*;
import java.io.*;

public class factorial {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the value");
        int n = scn.nextInt();
        int fn = fact(n);
        System.out.println(fn);
    }

    // expectaion - fact(5)=> 5*4*3*2*1
    // faith - fact(4) => 4*3*2*1
    // expectation weds faith => 5* fact(4)
    public static int fact(int n) {  // because we have taken int the value should be return
        
        
        if(n==0){
         return 1;
        }
        // to return the value we should recieve the value  
        int fact_n_minus1 = fact(n-1);  //a  first a ka right chalega  fact(n-1) like you have enterd no 3 - 3 2 1 0 for 0 fact_n_minus will recieve the value 1 uske baad jo bhi return hoga wo pehle a left mai recieve hoga
        int fact_n = n*fact_n_minus1;   //b 1 * 1 = 1 , 2 * 1 = 2  yaha 2 recieve hoga fact_n_minus1 ko => 3 * 2 = 6 => 4 * 6 =32
        return fact_n;                  //c 


    }
}

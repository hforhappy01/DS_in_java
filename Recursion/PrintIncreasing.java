import java.util.*;
import java.io.*;

public class PrintIncreasing {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the value");
        int n = scn.nextInt();
        PI(n);
    }
    // expectation => pi(n) = 1 2 3 4 .. n-2 n-1 n 
    // faith => pi(n-1) = 1 2 3 ... n-2 n-1  
    // e weds f => pi(n-1).n


    public static void PI(int n) {
if(n ==0){
    return;  // 0 ho jaaye to bs return kr jaao us se niche nhi jana
}

        PI(n-1);  // memory pic -- 5 4 3 2 1 jaate hue decrease krega aate hue print krega 1 2 3 4 5
        System.out.println(n);
    }
}

import java.util.*;
import java.io.*;

public class Power_linear {
    public static void main(String[] args){
  Scanner scn = new Scanner(System.in);
  int x = scn.nextInt();
  int n = scn.nextInt();
  int res = power(x,n);
  System.out.println(res);
}
// expectation => p(2,5) = 2.2.2.2.2
// faith => p(2,4) = 2.2.2.2.4
// ewf => p(2,5) = p(2,4).2

public static int power(int a, int b) {
  
    if(b==0){
        return 1;
    }
int xpowernminus1 = power(a,b-1);
int xpowerpr = xpowernminus1*a;
return xpowerpr;

}

}

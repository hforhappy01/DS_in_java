import java.util.*;
import java.io.*;

public class power_linearfinesol {
    public static void main(String[] args){
  Scanner scn = new Scanner(System.in);
  int x = scn.nextInt();
  int n = scn.nextInt();
  int res = power(x,n);
  System.out.println(res);
}
// expectation => x power n = 2^5 = 2^2. 2^2 .2
// faith => x powern n-1 = 2^4 = 2^2. 2^2 
// e weds faith => 2^5 =  2^4. 2 

public static int power(int x, int n) {
  
    if(n==0){
        return 1;   // as we reach to n = 0 return 1 dont go further down to negative nos. any postive no with power zero will return 1
                   
    }


    int xpowernby2= power(x,n/2);   // as we are optimizing our code we take n/2 instead of n-1 this will improve our time complexity
int xpowern = xpowernby2*xpowernby2;


if(n % 2 == 1){
    xpowern = xpowern * x ;
}

return xpowern;

}

}

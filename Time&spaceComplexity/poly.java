import java.util.*;
import java.io.*;
public class poly {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int x = scn.nextInt();
    int c = n;
    int pwithx = x;
    int temp = 0;
    while(c>=1){
        int term = c*pwithx;
        temp = temp+term;
        pwithx = pwithx*x;
        
        System.out.println(term);
        c--;
    }
    System.out.println(temp);

    }
}

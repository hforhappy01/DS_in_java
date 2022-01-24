import java.util.*;


public class PrintIncreasingDecreasing{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the no");
        
        int n = scn.nextInt();
        PID(n);
    }

    public static void PID(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PID(n-1);
        System.out.println(n);
    }
}

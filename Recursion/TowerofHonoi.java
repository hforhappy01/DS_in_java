import java.util.*;
import java.io.*;
public class TowerofHonoi{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // you have n disk 
        int tw1 = scn.nextInt(); // tower 1
        int tw2 = scn.nextInt(); // tower 2
        int tw3 = scn.nextInt(); // tower 3
        towerofhonoi(n, tw1, tw2, tw3);
    }
    public static void towerofhonoi(int n, int tw1, int tw2, int tw3 ){
        if(n == 0){
            return;
        }

        towerofhonoi(n-1, tw1, tw3, tw2);
        System.out.println(n+ " [" + tw1 + " -> "+ tw2 + "]");
        towerofhonoi(n-1, tw3, tw2, tw1);

    }
}
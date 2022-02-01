import java.util.*;
import java.io.*;

public class getStairPath {
     public static void main(String[] args){
           Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();
           ArrayList<String>paths = getStairPaths(n); 
           System.out.println(paths);
     }

     public static ArrayList<String> getStairPaths(int n){

        if(n==0){
            ArrayList<String> bres= new ArrayList<String>();
            bres.add("");
            return bres;
        }
        else if(n<0 ){
            ArrayList<String> res = new ArrayList<String>();
             return res;
        }

        ArrayList<String> nminus1= getStairPaths(n-1);
        ArrayList<String> nminus2= getStairPaths(n-2);
        ArrayList<String> nminus3= getStairPaths(n-3);

        ArrayList<String> fornpath = new ArrayList<String>();
        for(String pathfromnm1 : nminus1){
            String pathfromn = "1"+ pathfromnm1;
            fornpath.add(pathfromn);
        }
        for(String pathfromnm2 : nminus2){
            String pathfromn = "2"+ pathfromnm2;
            fornpath.add(pathfromn);
        }for(String pathfromnm3 : nminus3){
            String pathfromn = "3"+ pathfromnm3;
            fornpath.add(pathfromn);
        }

        return fornpath;
     }
}

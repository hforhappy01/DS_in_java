import java.util.*;
import java.io.*;

public class GetSubSequence {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ss = gss(str);
        System.out.println(ss);
         
    }

    // expectation=> gss(abc)=>[..., ..c, .b. ,.bc] + [a.. , a.c, ab., abc]
    // faith => gss(bc) => [.., .c, b. ,bc]
    // expextation weds faith => gss(abc)=>.*gss(bc)+a*gss(bc)
    public static ArrayList<String> gss(String str){

        if(str.length() ==0){ // have you ever wonder when u select zero apple out of bucket u have to choose one way that one way is rejecting all of them
            ArrayList<String> bres = new ArrayList<String>();  
            bres.add("");  // do alg alg baat hai bucket mai paani nhi hona ya bucket hi nhi hona 
            return bres;
        }
     char ch = str.charAt(0);  // abc -> a
     String restofsquence = str.substring(1);  // abc ->bc
     ArrayList<String> rss = gss(restofsquence); // gss(bc) -> [..,.c,b.,bc]
     ArrayList<String> fss = new ArrayList<String>(); // everything
     for(String rstr: rss){
         fss.add("_"+ rstr);
     }
     for(String rstr: rss){
        fss.add(ch+ rstr);
    }

    return fss;

    }
}

// for complete understanding of memory diagram refer to the video of 25 th august 2:35
import java.util.*; 
import java.io.*;

public class getkpc { public static void main(String[] args){
   Scanner scn = new Scanner(System.in);
   String str = scn.nextLine();
   ArrayList<String> words = getKPC(str);
   System.out.println(words); 
}

// expextation => getkpc(123) => [adg, adh, adi, aeg, aeh, aei, afg, afh, afi, bdg, bdh, bdi, beg, beh, bei, bfg, bfh, bfi, cdg, cdh, cdi, ceg, ceh, cei, cfg, cfh, cfi] 
// faith => getkpc(23) =>[dg, dh, di, eg, eh, ei, fg, fh, fi] de dega
// ewedsfaith=> getkpc(123)=>a.(getkpc(23))+ b.(getkpc(23))+c.(getkpc(23))

public static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
// {0-9}


public static ArrayList<String> getKPC(String str){
    //base case 
    if(str.length()==0){  // as string length becomes zero exit and return blank
        ArrayList<String> bres = new ArrayList<String>();
        bres.add("");
        return bres;
    }
    char ch = str.charAt(0);  // 1
    String ros = str.substring(1, str.length());// all words for 23
    ArrayList<String> rres = getKPC(ros);
    ArrayList<String> mres = new ArrayList<String>(); 
    
    String code = codes[ch-48]; // it will convert char to integer 
 
    for(int i = 0; i < code.length(); i++){ 
        char chi = code.charAt(i);
        for(String rstr: rres){
            mres.add(chi+rstr);
        }
    }
    
    return mres;
   
}
}
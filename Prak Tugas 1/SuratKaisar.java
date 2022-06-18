import java.io.*;
import java.util.*;

public class SuratKaisar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String isiTeks = input.nextLine();
        int nilai = input.nextInt();
        String chipertext ="";
        System.out.println(methodCaesar(chipertext,nilai,isiTeks));
  }
    public static String methodCaesar (String chipertext, int nilai, String isiTeks){
        chipertext ="";
        char alpabet;
        for(int i=0; i < isiTeks.length();i++){
            alpabet = isiTeks.charAt(i);
                if(alpabet >= 'a' && alpabet <= 'z'){
                alpabet = (char) (alpabet + nilai);
                    if(alpabet > 'z') {
                    alpabet = (char) (alpabet+'a'-'z'-1);
                    }
                chipertext = chipertext + alpabet;
                }
                else if(alpabet >= 'A' && alpabet <= 'Z') {
                alpabet = (char) (alpabet + nilai);    
                    if(alpabet > 'Z') {
                    alpabet = (char) (alpabet+'A'-'Z'-1);
                    }
                    chipertext = chipertext + alpabet;
                    }else {
             chipertext = chipertext + alpabet;   
            }  
    }   
        return chipertext;
        }     
}
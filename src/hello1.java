import java.io.*;
import java.util.*;

public class hello1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int c=A.length()+B.length();
        System.out.println(c);
        boolean bool=true;
        for(int i=0;i<A.length();i++){
            for(int j=0;j<B.length();j++){
                if (Character.getNumericValue(A.charAt(0))>Character.getNumericValue(B.charAt(0))){
                    bool=true;

                }
                else if(Character.getNumericValue(A.charAt(i))>Character.getNumericValue(B.charAt(j))){
                    bool=false;
                }



            }
        }
        if(bool){
            System.out.println("Yes");

        }else{System.out.println("No");}




        A=A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase();
        B=B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase();
        System.out.println(A+" "+B);
    }
}




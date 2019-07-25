import java.util.Arrays;
import java.util.Scanner;

public class Equation1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String[] plus=s.split("\\+");
        Double result=0.0;
        for (String q:plus){

            String[] mult=q.split("\\*");
            int multiply=1;
            for (String w:mult){

                double d=Double.parseDouble(w);
                multiply*=d;
            }
            result+=multiply; }
        System.out.println(result);


    }

}

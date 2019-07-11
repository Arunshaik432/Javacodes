import java.util.Arrays;
import java.util.Scanner;

public class negativeNumbers {
    public static void main(String[] args) {
        int n=5;
        int a[]=new int[n];
        int sum=0;
        Scanner scan=new Scanner(System.in);
        for (int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int l=0,m=0,lum=0;
        for (int v:a){
            lum=lum+v;
        }
        if(lum<0){
            m++;
        }


        for (int k=1;k<n;k++) {
            for (int j = 0; j <= n-k; j++) {
                int sub[] = Arrays.copyOfRange(a, j, j + k);
                sum=0;
                for (int val : sub) {

                    sum = sum + val;


                }
                if (sum < 0) {
                    l++;

                }

            }
        }
        System.out.println(l+m);


    }
}

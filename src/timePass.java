import java.util.Scanner;



public class timePass {
    public static void main(String[] args){
        int n,temp;
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        boolean b=true;
        for (int i=2;i<n;i++){
            if(n%i==0){
               b=false;
            }
        }
        if(b==true){
            System.out.println("it's a prime number");
        }
        else
            System.out.println("not a prime number");


    }


}

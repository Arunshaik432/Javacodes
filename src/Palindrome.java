import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int temp=num,sum=0;
        boolean palin=false;
        while(!palin)

        {   while(num>0)
            {   int time=num%10;
                num=num/10;
                sum=sum*10+time;
            }if (temp!=sum){
                temp=temp+sum;
                num=temp;
                sum=0;
            } else{ palin=true;}
        }System.out.println("yes,it is palindrome after  "+sum+" "+ "value of addition"); }}

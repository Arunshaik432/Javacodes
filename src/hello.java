import java.util.*;
//armstrong number 153=1*1*1+5*5*5+3*3*3=153
class hello{
    public static void main(String[] args) {
        int r,sum=0,n,temp;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number ,i will tell it's an armstrong or not");
        n=scan.nextInt();
        temp=n;
        while (n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(sum==temp){
            System.out.println("it's an armstrong");
        }
        else{
            System.out.println("Sorry,not an armstrong");
        }










    }
}
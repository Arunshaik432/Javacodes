import java.util.*;
class Solution{


    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }

        Iterator it=mylist.iterator();
        while(it.hasNext()){

            if(it.next() instanceof Integer){
                if (it.next()!="###"){
                    ArrayList<Object> ar=new ArrayList<>();
                    ar.add(it.next());
                    ar.iterator();
                }


            }
            //Hints: use instanceof operator

            break;
        }

        while(it.hasNext()){
            Object element = it.next();
            System.out.println(element);
        }
    }
}

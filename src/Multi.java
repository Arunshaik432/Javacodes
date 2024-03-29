

class Q{
    int num;
    boolean valueset=false;
    public synchronized void put(int num)  {
        if (valueset){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("put :"+num);
        this.num=num;
        valueset=true;
        notify();
    }
    public synchronized void get(){
        if (!valueset){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("get :"+num);
        valueset=false;
        notify();
    }
}
class Producer implements Runnable{
    Q q;



    public  Producer(Q q){
        this.q=q;
        Thread t=new Thread(this,"Producer");
        t.start();
    }



    public void run(){
        int i=0;
        while(true){
            q.put(i++);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
class Consumer implements Runnable{
    Q q;
    public  Consumer(Q q){
        this.q=q;
        Thread t=new Thread(this,"consumer");
        t.start();


    }


    public void run(){

        while(true){
            q.get();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
class TestJoinMethod2{
    public static void main(String[] args) {
        Q q=new Q();
        Producer p=new Producer(q);
        Consumer c=new Consumer(q);


    }
}
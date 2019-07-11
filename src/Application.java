class Add{

    public void show(){

        System.out.println("in show of Add");
    }





}

class AddSub extends Add{
    public void show(){

        System.out.println("in show of AddSub");
    }
}
class Application{

    public static void main(String[] args) {
        AddSub obj=new AddSub();
        Add    obj1=new Add();
        AddSub a;
        a=obj;
        a.show();

    }
}//by this code i got to know when we are creating the reference of superclass and assigning the refrence of the subclass it is workng
//but vice versa is not possible.

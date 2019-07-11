public class Super {
    public void abc(){
        System.out.println("in abc of super class");


    }
}
class SuperClass extends Super{
    public void abc(){
        super.abc();
        System.out.println("in abc of SueperClass");
    }
}

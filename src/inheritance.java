public class inheritance {
    protected String brand="ford";
    public void honk(){
        System.out.println("honk,honkkkkkk");
    }

}
class inherit extends inheritance{
    private String modelName="mustang";

    public static void main(String[] args) {
        inherit myObj=new inherit();
        myObj.honk();
        System.out.println(myObj.brand+"   "+myObj.modelName);

    }

}

public class encapsulation {
    private String name;
    private String name1;
    public void setName(String newname,String newname1){
        this.name=newname;
        this.name1=newname1;
    }
    public String getName(){

        return name;

    }
    public String getName1(){
        return name1;
    }

}
class encap{
    public static void main(String[] args) {
        encapsulation myobj=new encapsulation();
        myobj.setName("hari","ahron");
        System.out.println(myobj.getName()+" "+myobj.getName1());

    }


}


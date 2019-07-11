class BlockCompetition{//in this here is a competition between static block vs initializer block and constructor
    static String s="";
    int i;
    {
        s="hello";
        System.out.println("in  ");
        i=6;
    }
    static {
        System.out.println("in stattcic");
    }

    public BlockCompetition(){
        System.out.println("in constructor");
    }

    public static void main(String[] args) {
        BlockCompetition obj1=new BlockCompetition();
        BlockCompetition obj2=new BlockCompetition();
        System.out.println("th string s is :"+s+obj1.i+obj2.i);
    }

}
//so static comes first then initializer block and then constructor
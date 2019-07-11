public class ThisKeyword {
    int i;
    public ThisKeyword(int i){
        this.i=i;
    }
    public void Show(){
        System.out.println(this.i);
    }
}
class This{
    public static void main(String[] args) {
        ThisKeyword obj =new ThisKeyword(5);
    }
}

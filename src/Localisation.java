import java.util.Arrays;
import java.util.List;

class Localisation
{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,54,76);
        list.forEach(DoubleIt.d::Double);
    }

}
class DoubleIt{
    static DoubleIt d=new DoubleIt();
    public  void Double(int i)
    {
        System.out.println(i*2);
    }
}


import java.lang.reflect.Method;

public class ReflectionAP {
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("Rised");
        Rised r=(Rised)c.newInstance();
        Method m=c.getMethod("show",null);
        m.setAccessible(true);
        m.invoke(r,null);

    }
}

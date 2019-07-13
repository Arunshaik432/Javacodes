import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.List;

public class DeSerializationXML  {
    public static void main(String[] args) throws Exception{
        XMLDecoder xml=new XMLDecoder(new BufferedInputStream(new FileInputStream("myCollege.xml")));
        College cdfd=(College)xml.readObject();
        List<Student> s=cdfd.getS();
        for (Student value:s){
            System.out.println(value);
        }
    }
}

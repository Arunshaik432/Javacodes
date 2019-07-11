

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationXML{

    public static void main(String[] args) {
        Student std=new Student();
        std.setRollno(101);
        std.setSname("Arun");
        Student std1=new Student();
        std1.setRollno(132);
        std1.setSname("Navin");
        List<Student> s=new ArrayList<Student>();
        s.add(std);
        s.add(std1);
        College c=new College();
        c.setS(s);
        try (XMLEncoder xml = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")))) {

            xml.writeObject(c);

        }


        catch (Exception e){

        }
    }

}

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws Exception {
        Save obj=new Save();
        obj.i=5;
        File f=new File("Gangster.txt");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois =new ObjectInputStream(fis);
        Save obj1=(Save) ois.readObject();
        System.out.println(obj1);



    }
}
class Save implements Serializable {
    int i;

    @Override
    public String toString() {
        return "Save{" +
                "i=" + i +
                '}';
    }
}

import java.io.*;
import java.util.Properties;

class Inter{
    public static void main(String[] args) throws Exception {
        Properties p =new Properties();
        File f=new File("new.properties");

        InputStream is=new FileInputStream(f);
        p.load(is);



        p.list(System.out);

    }
}
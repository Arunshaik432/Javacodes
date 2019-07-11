

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class College implements Serializable {
    List<Student> s=new ArrayList<Student>();

    public List<Student> getS() {
        return s;
    }

    public void setS(List<Student> s) {
        this.s = s;
    }


}

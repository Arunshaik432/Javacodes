import java.sql.*;

class jdbc{
    public static void main(String[] args) throws Exception {

        StudentDao dao=new StudentDao();
        Student1 s=new Student1();
        s.rollno=13;
        s.sname="arun";
        dao.connect();
        dao.addStudent(s.rollno,s.sname);
        System.out.println(s.sname);

    }
}
class StudentDao
{   Student1 s=new Student1();
    Connection con=null;
    public void connect() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost/abc","root","arun200104");

    }
    public Student1 getStudent(int rollno) throws Exception
    {   String query="select sname from student where rollno="+rollno;
        s.rollno=rollno;

        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(query);
        rs.next();
        String name=rs.getString(1);
        s.sname=name;
        return s;
    }

    public void addStudent(int roll,String name) throws Exception{
        String query="insert into student values(?,?)";
        PreparedStatement st=con.prepareStatement(query);
        st.setInt(1,roll);
        st.setString(2,name);
        st.executeUpdate();

    }


}
class Student1{
    int rollno;
    String sname;


}
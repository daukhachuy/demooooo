package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Teacher;

public class TeacherList {

    private static final List<Teacher> list = new ArrayList<>();

    public TeacherList() {
    }

    public static List<Teacher> getList() {
        return list;
    }

    String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=lad3;";
    String user = "sa";
    String pass = "huy123";

    public void loadTeacher() {
        try {
            // De ket noi co so du lieu
            // Buoc 1: Nap trinh dieu khien
            Class.forName(driverName);
            try {               
                Connection con = DriverManager.getConnection(url, user, pass);
                Statement stmt = con.createStatement();
                String sql = "SELECT * FROM  Student";               
                ResultSet result = stmt.executeQuery(sql);
                while (result.next()) {
                    System.out.println("succccc");

                }
                result.close();
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(TeacherList.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        TeacherList teacherList = new TeacherList();
        teacherList.loadTeacher();
        for (Teacher a : list) {
            System.out.println(a);
            
        }
    }
}

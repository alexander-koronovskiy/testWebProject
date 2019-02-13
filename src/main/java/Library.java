import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Library {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter pw = response.getWriter();
        try{Class.forName("org.postgresql.Driver");} catch (ClassNotFoundException e){e.printStackTrace();}
        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java_ee_db", "postgresql","");
            Statement statament = connection.createStatement();
            ResultSet rs = statament.executeQuery("SELECT title FROM books");
            while (rs.next()){pw.println(rs.getString("title"));}

            statament.close();
        }catch(SQLException e){e.printStackTrace();}
    }
}
import java.sql.*;
class CreateDatabase{
    public static void main(String[] args) {
        String name="root";
        String pass="";
        String url="jdbc:mysql://localhost:3306";
        String sql="create database nhuzJava";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,name,pass);
            Statement st=con.createStatement();
            st.executeUpdate(sql);
            System.out.println("Database Created Success");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
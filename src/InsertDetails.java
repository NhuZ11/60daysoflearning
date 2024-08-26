import java.sql.*;

public class InsertDetails {
    public static void main(String[] args) {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/nhuzjava";
        String sql = "INSERT INTO student (id, name, address) VALUES "
                + "(1, 'nhuz', 'dallu'), "
                + "(2, 'nhujit', 'ramkot'), "
                + "(3, 'ram ', 'chagal')";

        try {
            // Load and register MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Create statement
            Statement st = con.createStatement();

            // Execute update (insert records)
            st.executeUpdate(sql);
            System.out.println("Records inserted successfully.");

            // Close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
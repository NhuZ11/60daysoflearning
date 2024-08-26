import java.sql.*;
import java.util.Scanner;

public class CRUD {
    Connection con;
    String sql;
    public void connection() {
        String name = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/nhuzjava";
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            con = DriverManager.getConnection(url, name, pass);
            System.out.println("Connection established successfully.");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Failed to establish a connection to the database.");
            e.printStackTrace();
        }
    }

    public void createTable() {
        if (con != null) {
            sql = "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(200), address VARCHAR(200))";
            try (Statement st = con.createStatement()) {
                st.executeUpdate(sql);
                System.out.println("Table created successfully.");
            } catch (SQLException e) {
                System.err.println("Failed to create the table.");
                e.printStackTrace();
            }
        } else {
            System.err.println("No active database connection.");
        }
    }

    public void insertUpdateDelete(String sql) throws SQLException {
        Statement st=con.createStatement();
        st.executeUpdate(sql);
        System.out.println("Operation Successful");
    }

    public void readData() throws SQLException {
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from users");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+
                    rs.getString(2)+" "+rs.getString(3));
        }
    }

    public static void main(String[] args) throws SQLException {
        CRUD crud = new CRUD();
        crud.connection();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1: Create Table\n" +
                           "Enter 2: Insert Data\n"+
                           "Enter 3: Read Data\n" +
                           "Enter 4: Update Data \n" +
                           "Enter 5: Delete Data ");
        int choice=input.nextInt();
        switch(choice){
            case 1: //creating table
                crud.createTable();
                break;
            case 2:  //insert data
                String InsertSql="insert into users(id,name,address) values('1','Ramesh','kalanki'),('3','ram','sitapaila')";
                crud.insertUpdateDelete(InsertSql);
                break;
            case 3:
                crud.readData();
                break;
            case 4:
                String UpdateSql= "update users set name='sujal' where id=1";
                crud.insertUpdateDelete(UpdateSql);
                break;
            case 5:
                String DeleteSql="delete from users where id=1";
                crud.insertUpdateDelete(DeleteSql);
                break;


        }
    }
}

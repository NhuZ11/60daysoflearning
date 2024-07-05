import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GuiForm extends JFrame implements ActionListener {
    JLabel head, lbl1, lbl2;
    JTextField name, phone;
    JButton submitButton;
    Connection con;

    public void connection() {
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/6java";
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection established successfully.");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Failed to establish a connection to the database.");
            e.printStackTrace();
        }
    }

    GuiForm() {
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        head = new JLabel("User Form");
        head.setBounds(200, 20, 200, 20);
        this.add(head);

        lbl1 = new JLabel("Name:");
        lbl1.setBounds(50, 80, 50, 20);
        this.add(lbl1);

        name = new JTextField();
        name.setBounds(150, 80, 200, 20);
        this.add(name);

        lbl2 = new JLabel("Phone:");
        lbl2.setBounds(50, 120, 50, 20);
        this.add(lbl2);

        phone = new JTextField();
        phone.setBounds(150, 120, 200, 20);
        this.add(phone);

        submitButton = new JButton("Submit");
        submitButton.setBounds(200, 160, 100, 20);
        submitButton.addActionListener(this); // Add the action listener
        this.add(submitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Retrieve and print the input values
            String nameInput = name.getText();
            String phoneInput = phone.getText();

            // Insert data into the database
            String sql = "INSERT INTO users (name, phone) VALUES (?, ?)";
            try {
                insert(sql, nameInput, phoneInput);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void insert(String sql, String name, String phone) throws SQLException {
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.executeUpdate();
            System.out.println("Operation Successful");
        }
    }

    public static void main(String[] args) {
        GuiForm guiForm = new GuiForm();
        guiForm.connection();
    }
}

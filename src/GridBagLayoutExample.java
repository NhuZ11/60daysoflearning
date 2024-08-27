import java.awt.*;
import javax.swing.*;

public class GridBagLayoutExample extends JFrame {

    public GridBagLayoutExample() {
        setTitle("GridBagLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a container with GridBagLayout
        Container container = getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // First component (Label "Name")
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        container.add(new JLabel("Name:"), gbc);

        // Second component (TextField for Name)
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        container.add(new JTextField(20), gbc);

        // Third component (Label "Email")
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        container.add(new JLabel("Email:"), gbc);

        // Fourth component (TextField for Email)
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        container.add(new JTextField(20), gbc);

        // Fifth component (Button "Submit")
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // Span two columns
        gbc.fill = GridBagConstraints.CENTER;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        container.add(new JButton("Submit"), gbc);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GridBagLayoutExample());
    }
}

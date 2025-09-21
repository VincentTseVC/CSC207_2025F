package guiDemo;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    public static void main(String[] args) {
        // Hello, my name is 6330.
        SwingUtilities.invokeLater(() -> {


            JLabel firstNameLabel = new JLabel("First Name:");
            JLabel lastNameLabel = new JLabel("Last Name:");

            JTextField firstNameField = new JTextField(10);
            JTextField lastNameField = new JTextField(10);

            JButton submit = new JButton("Submit");
            JButton cancel = new JButton("Cancel");

            submit.addActionListener(new ActionListener() {
                // callback methods
                @Override
                public void actionPerformed(ActionEvent e) {
                    String firstName = firstNameField.getText();
                    String lastName = lastNameField.getText();
                    JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName);
                }
            });

            // align horizontally
            JPanel firstNamePanel = new JPanel();
            firstNamePanel.add(firstNameLabel);
            firstNamePanel.add(firstNameField);

            JPanel lastNamePanel = new JPanel();
            lastNamePanel.add(lastNameLabel);
            lastNamePanel.add(lastNameField);

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(submit);
            buttonPanel.add(cancel);

            // vertically
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
            mainPanel.add(firstNamePanel);
            mainPanel.add(lastNamePanel);
            mainPanel.add(buttonPanel);

            // Hello, My name is 5213
            JFrame frame = new JFrame("Intro JFrame Example");
            frame.setMinimumSize(new java.awt.Dimension(300, 200));
            frame.setContentPane(mainPanel); // ***
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

        });
    }
}

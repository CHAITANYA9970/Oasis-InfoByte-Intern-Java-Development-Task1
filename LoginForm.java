import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private JFrame frame;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LoginForm() {
        frame = new JFrame("Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(30, 30, 80, 25);
        frame.add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setBounds(120, 30, 150, 25);
        frame.add(txtUsername);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(30, 70, 80, 25);
        frame.add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(120, 70, 150, 25);
        frame.add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 110, 100, 25);
        frame.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });

        frame.setVisible(true);
    }

    private void handleLogin() {
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        // Dummy validation for demonstration purposes
        if ("admin".equals(username) && "password".equals(password)) {
            JOptionPane.showMessageDialog(frame, "Login Successful");
            frame.dispose();
            new ReservationForm();  // Open Reservation Form
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid credentials");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancellationForm {
    private JFrame frame;
    private JTextField txtPNR;
    private JButton btnCancel;

    public CancellationForm() {
        frame = new JFrame("Cancellation");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblPNR = new JLabel("PNR Number:");
        lblPNR.setBounds(30, 30, 100, 25);
        frame.add(lblPNR);

        txtPNR = new JTextField();
        txtPNR.setBounds(140, 30, 120, 25);
        frame.add(txtPNR);

        btnCancel = new JButton("Cancel");
        btnCancel.setBounds(100, 70, 100, 25);
        frame.add(btnCancel);

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleCancellation();
            }
        });

        frame.setVisible(true);
    }

    private void handleCancellation() {
        String pnr = txtPNR.getText();

        // Dummy cancellation handling
        JOptionPane.showMessageDialog(frame, "Cancellation Successful for PNR " + pnr);
        frame.dispose();
    }

    public static void main(String[] args) {
        new CancellationForm();
    }
}

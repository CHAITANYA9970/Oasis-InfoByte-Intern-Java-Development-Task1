import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservationForm {
    private JFrame frame;
    private JTextField txtName, txtTrainNumber, txtJourneyDate, txtFrom, txtTo;
    private JComboBox<String> cmbClassType;
    private JButton btnSubmit;

    public ReservationForm() {
        frame = new JFrame("Reservation");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(30, 30, 80, 25);
        frame.add(lblName);

        txtName = new JTextField();
        txtName.setBounds(120, 30, 200, 25);
        frame.add(txtName);

        JLabel lblTrainNumber = new JLabel("Train Number:");
        lblTrainNumber.setBounds(30, 70, 100, 25);
        frame.add(lblTrainNumber);

        txtTrainNumber = new JTextField();
        txtTrainNumber.setBounds(140, 70, 180, 25);
        frame.add(txtTrainNumber);

        JLabel lblJourneyDate = new JLabel("Journey Date:");
        lblJourneyDate.setBounds(30, 110, 100, 25);
        frame.add(lblJourneyDate);

        txtJourneyDate = new JTextField();
        txtJourneyDate.setBounds(140, 110, 180, 25);
        frame.add(txtJourneyDate);

        JLabel lblFrom = new JLabel("From:");
        lblFrom.setBounds(30, 150, 80, 25);
        frame.add(lblFrom);

        txtFrom = new JTextField();
        txtFrom.setBounds(120, 150, 200, 25);
        frame.add(txtFrom);

        JLabel lblTo = new JLabel("To:");
        lblTo.setBounds(30, 190, 80, 25);
        frame.add(lblTo);

        txtTo = new JTextField();
        txtTo.setBounds(120, 190, 200, 25);
        frame.add(txtTo);

        JLabel lblClassType = new JLabel("Class Type:");
        lblClassType.setBounds(30, 230, 80, 25);
        frame.add(lblClassType);

        cmbClassType = new JComboBox<>(new String[]{"First Class", "Sleeper Class"});
        cmbClassType.setBounds(120, 230, 200, 25);
        frame.add(cmbClassType);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(150, 270, 100, 25);
        frame.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleReservation();
            }
        });

        frame.setVisible(true);
    }

    private void handleReservation() {
        String name = txtName.getText();
        String trainNumber = txtTrainNumber.getText();
        String journeyDate = txtJourneyDate.getText();
        String from = txtFrom.getText();
        String to = txtTo.getText();
        String classType = (String) cmbClassType.getSelectedItem();

        // Dummy reservation handling
        JOptionPane.showMessageDialog(frame, "Reservation Successful for " + name);
        frame.dispose();
    }

    public static void main(String[] args) {
        new ReservationForm();
    }
}

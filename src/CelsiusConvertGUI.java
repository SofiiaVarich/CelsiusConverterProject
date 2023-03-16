import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConvertGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;

    public CelsiusConvertGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //grab the text from the celsiusTestField
                //convert to a Doable
                //update the fahrenheitLabel
                int tempFahr = (int)((Double.parseDouble(celsiusTextField.getText()))
                        *1.8+32);
                fahrenheitLabel.setText(tempFahr + " Fahreinheit");
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new CelsiusConvertGUI("My Celsius Converter");
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI {

    private JFrame frame;
    private JTextField firstNumberTf;
    private JTextField secondNumberTf;
    private JButton calcBtn;
    private JLabel resultLabel;
    private JLabel totalresult;
    public CalculatorUI() {
        frame = new JFrame("Sum example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        firstNumberTf = new JTextField();
        secondNumberTf = new JTextField();
        calcBtn = new JButton("Sum number");
        resultLabel = new JLabel("Result: ");
        totalresult = new JLabel();

        firstNumberTf.setBounds(50, 50, 150, 25);
        secondNumberTf.setBounds(50, 100, 150, 25);
        calcBtn.setBounds(75, 150, 120, 30);
        resultLabel.setBounds(70, 200, 80, 30);
        totalresult.setBounds(160, 200, 80, 30);

        calcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(firstNumberTf.getText());
                int b = Integer.parseInt(secondNumberTf.getText());

                int total = a + b;

                totalresult.setText(String.valueOf(total));
            }
        });
        frame.add(firstNumberTf);
        frame.add(secondNumberTf);
        frame.add(calcBtn);
        frame.add(resultLabel);
        frame.add(totalresult);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorUI();
    }

}

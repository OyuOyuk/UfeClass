import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UltraCalculatorUI {

    private JFrame frame;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn10;
    private JButton plusBtn;
    private JButton minusBtn;
    private JButton divideBtn;
    private JButton multiplyBtn;
    private JButton equalBtn;
    private JButton pointBtn;
    private JButton historyBtn;
    private JLabel writtenLabel;
    private JScrollPane history;
    public UltraCalculatorUI() {
        frame = new JFrame("Sum example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn10 = new JButton("0");

        plusBtn = new JButton("+");
        minusBtn = new JButton("-");
        divideBtn = new JButton("/");
        multiplyBtn = new JButton("*");
        equalBtn = new JButton("=");
        pointBtn = new JButton(".");

        historyBtn = new JButton();
        JList historyList = new JList();
        writtenLabel = new JLabel("");
        history = new JScrollPane(historyList);

        Border border = BorderFactory.createLineBorder(Color.lightGray, 1, true);
        history.setBorder(border);
        history.setBounds(270, 10, 100, 300);
        writtenLabel.setBackground(Color.WHITE);
        writtenLabel.setBorder(border);
        writtenLabel.setBounds(10, 10, 230, 50);
        JButton[] buttons = {btn7, btn8, btn9, divideBtn,
                btn4, btn5, btn6, multiplyBtn,
                btn1, btn2, btn3, minusBtn,
                btn10, pointBtn, equalBtn, plusBtn};
        int counter = 0;
        for(int  y= 70; y <= 250; y = y + 60) {
            for(int  x= 10; x < 250; x= x + 60) {
                buttons[counter].setBounds(x, y, 50, 50);
                buttons[counter].setBackground(Color.WHITE);
                buttons[counter].setBorder(border);
                counter++;
            }
        }

        frame.add(writtenLabel);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btn10);
        frame.add(plusBtn);
        frame.add(minusBtn);
        frame.add(divideBtn);
        frame.add(multiplyBtn);
        frame.add(equalBtn);
        frame.add(pointBtn);
        frame.add(history);
        frame.setVisible(true);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + btn1.getText());
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + btn2.getText());
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + btn3.getText());
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + btn4.getText());
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + btn5.getText());
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + btn6.getText());
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + btn7.getText());
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + btn8.getText());
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + btn9.getText());
            }
        });
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + btn10.getText());
            }
        });
        plusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + " " + plusBtn.getText() + " ");

            }
        });
        minusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + " " + minusBtn.getText() + " ");

            }
        });
        divideBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + " " + divideBtn.getText() + " ");
            }
        });
        multiplyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + " " + multiplyBtn.getText() + " ");
            }
        });
        equalBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String equation = writtenLabel.getText();
                String[] equations = equation.split(" ");
                double result = Double.parseDouble(equations[0]);
                String nextAction = "";
                double saved = 0;
                for (int i = 0; i < equations.length; i++) {
                    if (equations[i].equals("+")){
                        nextAction = "+";
                    }else if (equations[i].equals("-")){
                        nextAction = "-";
                    }else if (equations[i].equals("*")){
                        nextAction = "*";
                    }else if (equations[i].equals("/")){
                        nextAction = "/";

                    }else{
                        if(nextAction.equals("+")){
                            result = result + Double.parseDouble(equations[i]);
                        }else if (nextAction.equals("-")){
                            result = result - Double.parseDouble(equations[i]);
                        }else if (nextAction.equals("*")){
                            result = result * Double.parseDouble(equations[i]);
                        }else if (nextAction.equals("/")){
                            result = result / Double.parseDouble(equations[i]);

                    }
                }

//                historyList.add(writtenLabel.getText() + " = " + result);

                if(result == Math.floor(result)){
                    writtenLabel.setText(String.valueOf((int) result));
                }else{
                    writtenLabel.setText(String.valueOf(result));
                }



            }
        }});
        pointBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writtenLabel.setText(writtenLabel.getText() + pointBtn.getText());
            }
        });
    }

    public static void main(String[] args) {
        new UltraCalculatorUI();
    }

}

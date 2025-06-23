import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterest {
    public static void main(String args[]) {
        InterestCalculator obj = new InterestCalculator();
    }
}

class InterestCalculator extends JFrame implements ActionListener {
    JLabel p;
    JTextField t1;
    JLabel t;
    JTextField t2;
    JLabel r;
    JTextField t3;
    JButton b1;
    JLabel result;

    public InterestCalculator() {
        setLayout(new FlowLayout());
        p = new JLabel("Enter Principal Amount:");
        t1 = new JTextField(10);
        t = new JLabel("Enter Time (in years):");
        t2 = new JTextField(10);
        r = new JLabel("Enter Rate of Interest:");
        t3 = new JTextField(10);
        b1 = new JButton("Calculate SI");
        result = new JLabel("Simple Interest:");

        add(p);
        add(t1);
        add(t);
        add(t2);
        add(r);
        add(t3);
        add(b1);
        add(result);

        b1.addActionListener(this);

        setTitle("Simple Interest Calculator");
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double principal = Double.parseDouble(t1.getText());
        double time = Double.parseDouble(t2.getText());
        double rate = Double.parseDouble(t3.getText());
        double simpleInterest = (principal * time * rate) / 100;
        result.setText("Simple Interest: " + simpleInterest);
    }
}

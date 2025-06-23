import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingAddition {
    public static void main(String args[])
    {
        Abc obj = new Abc();

    }
}

class Abc extends JFrame implements ActionListener{
    JLabel l1;
    JTextField t1;
    JLabel l2;
    JTextField t2;
    JButton b1;
    JLabel l3;

    public Abc(){setLayout(new FlowLayout());
        l1 = new JLabel("Enter first number:");
        t1 = new JTextField(10);
        l2 = new JLabel("Enter second number:");
        t2 = new JTextField(10);
        b1 = new JButton("Add");
        l3 = new JLabel("Result:");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);

        b1.addActionListener(this);

        setTitle("Addition");
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int sum = num1 + num2;
            l3.setText("Result: " + sum);
        
    }
}

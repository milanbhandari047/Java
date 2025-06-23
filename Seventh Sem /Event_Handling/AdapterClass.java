import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdapterClass extends JFrame implements ActionListener{
    public static void main(String[] args) {
        new AdapterClass();
    }

    JLabel l1 , l2,l3;

    JTextField t1, t2,t3;
    JButton b1;



public  AdapterClass(){
    l1 = new JLabel("Enter first number:");
    l1.setBounds(20,10,100,20);
    t1 = new JTextField(10);
    t1.setBounds(150,10,100,20);
    l2 = new JLabel("Enter second number:");
    l2.setBounds(20,40,100,20);
    t2 = new JTextField(10);
    t2.setBounds(150,40,100,20);
    l3 = new JLabel("Result:");
    l3.setBounds(20,100,100,20);
    b1 = new JButton("Add");
    b1.setBounds(20,70,100,20);
    b1.addActionListener(this);
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(b1);
    add(l3);
    setLayout(null);
    setSize(300,200);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e){
    
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int sum = num1 + num2;
        l3.setText("Result: " + sum);
        
    
}
}
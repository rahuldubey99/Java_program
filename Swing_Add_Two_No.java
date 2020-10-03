import javax.swing.*;
import java.awt.event.*;

public class Swing_Add_Two_No extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    public Swing_Add_Two_No(){}
    public Swing_Add_Two_No(String s){
        super(s);
    }
    public void setComponents(){
        l1 = new JLabel("Addition of two number");
        l2 = new JLabel("First number");
        l3 = new JLabel("Second number");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("ADD");
        setLayout(null);
        l1.setBounds(50,50,200,20);
        l2.setBounds(50,80,200,20);
        t1.setBounds(150,80,200,20);
        l3.setBounds(50,130,200,20);
        t2.setBounds(170,130,200,20);
        b1.setBounds(80,180,100,20);
        l4.setBounds(80, 240, 200, 20);
        b1.addActionListener(new Handler());
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1); 
    }
    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
           int a = Integer.parseInt(t1.getText());
           int b = Integer.parseInt(t2.getText());
           int s = a+b;
           l4.setText("Addition is"+s);

        }
    }
    public static void  main(String[] args){
        Swing_Add_Two_No jf = new Swing_Add_Two_No("Swing  Add Two Number");
        jf.setComponents();
        jf.setSize(400,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

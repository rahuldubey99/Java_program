package rahul;
// import javax.swing.JFrame;
import java.awt.*;
// import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

class mywindow extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private  Font fon = new Font("", Font.BOLD, 35);

    mywindow() {
        super.setTitle("My Clock");
        super.setSize(400, 400);
        super.setLocation(300, 50);
        this.createGui();
        this.startClock();
        super.setVisible(true);
    }

    public void createGui() {
        heading = new JLabel("My clock");
        clockLabel = new JLabel("Clock");
        heading.setFont(fon);
        clockLabel.setFont(fon);
        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(clockLabel);
    }

    public void startClock() {
        final Timer timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(final ActionEvent e) {
                 String dateTime = new Date().toLocaleString();
                clockLabel.setText(dateTime);

            }

        }); 
        timer.start(); 
    } 
    
}

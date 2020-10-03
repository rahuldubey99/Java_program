import javax.swing.*;
public class swingexample extends JFrame{
    swingexample(){}
    swingexample(final String s){
        super(s);
    }
    public static void main(final String[] args){
        final swingexample jf = new swingexample("Swing Example");
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

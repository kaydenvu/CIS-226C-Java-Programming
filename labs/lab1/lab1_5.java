import javax.swing.*;

public class lab1_5 extends JFrame
{
 public static void main(String[] args)
 {
 JFrame form1 = new JFrame();

 form1.setSize(100,100);

 form1.setVisible(true);

 JLabel label1 = new JLabel("Hello World!");

 form1.add(label1);

 form1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

 }
}
import javax.swing.JOptionPane; // name of package

public class lab1_3 // name of class is lab1_3
{
 public static void main(String[] args)
 {
  String n1 = JOptionPane.showInputDialog("Enter 1st floating-point value: ");

  String n2 = JOptionPane.showInputDialog("Enter 2nd floating-point value: ");

  double sum = Double.parseDouble(n1) + Double.parseDouble(n2);

  JOptionPane.showMessageDialog(null, "The average is " + sum/2, null, JOptionPane.PLAIN_MESSAGE);
 }
}
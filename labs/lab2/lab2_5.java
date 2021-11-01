import javax.swing.JOptionPane;

public class lab2_5

{
public static void main(String[] args)
{
 final double avagadro = 6.022e23; // constant

 double Mm = Double.parseDouble(
 JOptionPane.showInputDialog("Mass per mole:")
 );

 double Ma = Mm / avagadro;
 JOptionPane.showMessageDialog(null, "Mass per atom: " +
 Ma + "g");
}
}

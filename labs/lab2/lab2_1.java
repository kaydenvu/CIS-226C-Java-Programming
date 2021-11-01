import javax.swing.JOptionPane;
public class lab2_1
{
public static void main(String[] args)
{
 int w = 5;
 float h = 3.6f;
 short s = 10247;
 long l = 4568901020341456L;
 double PI = 3.14159;
 double radius = 5.1;
 byte b = 101;
 char grade = 'A';
 boolean complete = true;
 String str = "";
 str += (w * h) + "\n";
 str += (l / s) + "\n";
 str += (PI * radius) + "\n";
 str += (b + 1) + "\n";
 str += (grade) + "\n";
 str += (complete) + "\n";
 JOptionPane.showMessageDialog(null, str);
}
}

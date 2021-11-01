// Student: KaydenVu  
// File Name: exam1_2.java
import java.util.Scanner;
public class exam1_2
{
public static void main(String[] args)
{
double volume;
double rate=0;
Scanner in = new Scanner(System.in);
System.out.print("Enter the volume of Oxygen consumed: ");
volume = in.nextDouble();
if (volume < 50)
{
rate = 6.50;
}
else if (volume < 75)
{
rate = 8.50;
}
else if (volume < 100)
{
rate = 11.50;
}
else if (volume >= 100)
{
rate = 15.50;
}
System.out.println("$" + String.format("%.2f",rate));
}
}

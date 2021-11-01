// Student: KaydenVu 
// File Name: exam2_2.java

import java.util.Scanner;

public class exam2_2
{
public static void findSum(int n)
{
 int sum = n;
 for (int i=0; i<n; i++)
 {
  sum = sum + i;
 }
 System.out.println(sum);
}
 public static void main(String[] args) 
{
 Scanner in = new Scanner(System.in);
 System.out.print("Enter an integer: ");
 int x = in.nextInt();
 System.out.println(x);
 findSum(x);
}
}
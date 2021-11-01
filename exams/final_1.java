/* Student: KaydenVu
File Name:final_1.java */

public class final_1
{
 private static double Distance(int x, int y)
 {
  return Math.sqrt(x*x + y*y);
 }
 
 private static double Distance(int x, int y, int z)
 {
  return Math.sqrt(x*x + y*y + z*z);
 }

 public static void main(String[] args) 
 {
  System.out.println(Distance(27, 42));
  System.out.println(Distance(21, 17, 35));
 }
}

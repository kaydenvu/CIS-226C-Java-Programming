// Student: KaydenVu 
// File Name:exam1_1.java

public class exam1_1
{
 public static void main(String args[]) throws Exception
 {
  double n = 1;
  double sum = 0;
  while (n<=15)
   {
   sum = sum + (n/(n+1));
   n++;
   }
  System.out.println(sum);
 }
}

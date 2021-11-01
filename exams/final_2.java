// Student: KaydenVu  
// File Name:final_2.java

class final_2
{
 public static void main(String args[])
 {
  int x[] = { 12, 13, 14, 15, 16, 17, 18, 19, 20 };
  for (int i=0; i<11; i++)
  {
   try
   {
    System.out.println(i + " is " + x[i]);
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println(i + " is not a valid index.");
   }
  }
 }
}

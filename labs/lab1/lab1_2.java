public class lab1_2
{
 public static void main(String[] args)
 {
  System.out.print("The result is : "); // without new line

  System.out.println((1.5 + 4 * 3.6)/(6.7 - 3.5)); // with new line

  System.out.print("Pause..press [Enter] to continue"); // Start as a new line

  try
  {
   System.in.read();
  }
  catch (Exception e) {}
 }
}

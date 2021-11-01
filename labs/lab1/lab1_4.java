import java.util.Random;

public class lab1_4
{
 public static void main(String[] args)
 {
  Random rn = new Random(); //create an instance

  int n1 = rn.nextInt(100); //a random integer in range 0 to 99

  double n2 = rn.nextDouble(); //a random double

  System.out.println(n1);

  System.out.println(n2);
 }
}

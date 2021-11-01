public class lab2_4
{
public static void main(String[] args) 
{
 System.out.println("\tTab indent");
 System.out.println("\nA new line");
 System.out.println("\"How are you?\"");
 System.out.printf("%f\n", 987654321.12345);
 System.out.printf("%,f\n", 987654321.12345);
 System.out.printf("%,f\n", -987654321.12345);
 System.out.printf("%,(f\n", -987654321.12345);
 System.out.printf("% ,.2f\n% ,.2f\n", 987654321.12345, -1234567.12345);
}
}
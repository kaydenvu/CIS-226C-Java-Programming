// Student: KaydenVu
// File Name:bonus.java

class Apple
{
 int x = 5;
 
 Apple() { System.out.println("Message from " + getClass().getName()); }
}

class AppleBee extends Apple
{
 int x = super.x;
 public AppleBee()
 {
  super();
 }
}

class bonus
{
 public static void main(String args[])  
 {
  Apple a1 = new Apple();
  System.out.println(a1.x);
  AppleBee a2 = new AppleBee();
  System.out.println(a2.x);
 }
}

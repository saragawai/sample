import java.util.Scanner;

 public class Biggest_Number
 {
   public static void main(String args[])
   {
     int x,y,z;
     Scanner s =new Scanner(System.in);
     System.out.println("Enter The First Number:");
     x = s.nextInt();
     System.out.println("Enter Second Number:");
     y = s.nextInt();
     System.out.println("Enter Third Number:");
     z = s.nextInt();
     
     if(x>y && x>z)
     {
       System.out.println("Largest Number is:"+x);
     }
     else if(y>z)
     {
       System.out.println("Largest Number is:"+y);
     }
     else
     {
       System.out.println("Largest Number is:"+z);
     }
   }

 }
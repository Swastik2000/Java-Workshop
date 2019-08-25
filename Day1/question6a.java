public class question6a {

  public static void main(String[] args) {
   
   int a=2012;
   if ((a%4==0) || ((a%100==0) && (a%400==0)))
   {
   System.out.println("Yes a leap year");
   }
   else 
   {
   System.out.println("Not a leap year");
   } 
 }
}

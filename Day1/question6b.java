public class  question6b {

  public static void main(String[] args) {
   
   int a = 1900; 

        if (a % 100==0)
        {
            if (a % 400==0)
             System.out.println("The given year is a leap year");
            else 
            System.out.println("The given year is not a leap year");
        }
     else
     {
         if (a % 4==0)
         System.out.println("The given year is a leap year");
         else
         System.out.println("The given year is not a leap year");    
     }
 }
}

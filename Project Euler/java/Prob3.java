public class Prob3 {
   public static void main(String[] args) {
       long n= 600851475143L;
       int k;
       for(k=2;k <=n;k++)
       {
           if(n%k==0)
           {
               n/=k;
               k--;
           }
       }
       System.out.println(k);
   } 
}

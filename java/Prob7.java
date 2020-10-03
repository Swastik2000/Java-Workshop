public class Prob7 {
   public static boolean isPrime(int p)
  {
    boolean isprime=false;
    if(p<2)
    return false;
    
    if(p==2)
    {
      return true;
    }
    if(p%2==0)
    return false;
    for(int i=3;i*i<=p+1;i=i+2)
    {
      if(p%i==0){
      return false;
      }
    
    }
    return true;
  }
  public static void main(String[] args)
  {
    int counter=0;
    int x=1;
    while(counter < 10001)
    {x=x+1;
      if(isPrime(x)){
        counter++;
      } 
    }
    System.out.println(x);
  }
}

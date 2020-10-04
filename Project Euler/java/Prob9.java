public class Prob9 {
   public static void main(String[] args) {
    int a=0,b=0; double c=0;
    int s=1000;
    for(a=1;a<s/3;a++)
    {
      for(b=a;b<s/2;b++)//a<b<c,s=a+b+c
      {
        c=s-a-b;
        if(c*c==a*a+b*b){
        
        System.out.println((long)(a*b*c));
        break;}
      }
    }
  }
}

public class Prob10 {
   
public static void main(String[] args){
		long sum =2;
		for(int i=3;i<2000000;i=i +2){
			if(prime(i)==1)
			{
				sum=sum+i;
			}
		}System.out.println(sum);
	
}
public static int prime(int n)
	
{
		int f=1;
		if(n%2==0)
			return 0;
		for(long i=3;i*i<=n;i=i+2)
		{
			if(n%i==0)
				return 0;
		}
		return f;
	}
}

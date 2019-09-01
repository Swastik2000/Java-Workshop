
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=100,a=0,b=0,c=0;
		
		a=((n * (n + 1) / 2) * (2 * n + 1) / 3);
		System.out.println("Sum of the squares of the first 100 natural numbers is " +a);
		
		for ( int i =0;i<=100;i++)
		{
			b=b+i;
			
		}
		  c=b*b;
		System.out.println("Square of the sum of the first 100 natural numbers is " +c);
		
		System.out.println("Difference between the sum of the squares of the first 100 natural numbers and the square of the sum is "+(c-a));
	}

}

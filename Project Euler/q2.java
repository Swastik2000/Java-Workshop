
public class q2 {

	public static void main(String[] args) {
        int  a = 0, b = 1, c = 0,sum=0;
        
        System.out.print("Sum of the even-valued terms upto 4000000 is:");
        for(int i = 1; i <= 4000000; i++)
        {
           c=a+b;
           a=b;
           b=c;
           i=c;
           if(c<4000000 && c%2==0)
           {
        	   sum=sum+c;
        	   }
            
        } System.out.println(" "+sum);
    }

}

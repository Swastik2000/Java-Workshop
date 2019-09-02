
public class q2 {

	public static void main(String[] args) {
        int  a = 0, b = 1, sum=0,c;
        
        
        do
        {
           c=a+b;
           a=b;
           b=c;
           
           if(c%2==0)
           {
        	   sum=sum+c;
        	  
        	   }
          
        } while (c<4000000);
        System.out.println("Sum of the even-valued terms upto 4000000 is: "+sum);
    }

}

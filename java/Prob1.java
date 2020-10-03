public class Prob1
{
    public static void main(String args[])
    {
        int sum=0;
        
            for(int i=3;i<=1000;i++)
            {
                sum=sum+i;
            }
            for(int i=5;i<=1000;i++)
            {
                if(i%3!=0)
                {
                    sum=sum+i;
                }
            }
        
        System.out.println(sum);
    }
}

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub {
		int c=1;
		for(int i=2;;i++) {
			int l=0;
			for(int k=i;k>=1;k--) 
			{
				if(i%k==0) 
					l++;
			}
				if(l==2) {
	               if(c==10001)
	               {
					      System.out.println(i);
					      break;
	               }c++;
	               }
		}

	}
}
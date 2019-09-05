
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, c = 0;
		
		for (a = 1; a < 1000; a++) {
		    for (b = a; b < 1000; b++) {
		        c = 1000 - a - b;
		 
		        if (a * a + b * b == c * c) {
		            
		          System.out.println(a*b*c);
		        }
		    }
		}
	}

}

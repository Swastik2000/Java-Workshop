package assignment;

public class q4 {

  public static void main(String[] args) {
  String largest;
  int a=6,b=12,c=8,d=2,big1,big2,big3,big4;
  
  // Taken integers 6,12,8,2
  
  big1 =a>b ? 6:12;
  big2 =c>big1 ? 8:big1;
  big3 =d>big2 ? 2:big2;
  big4 =a>big3 ? 6:big3;
  System.out.println("Ans:" +big4);
  }

}

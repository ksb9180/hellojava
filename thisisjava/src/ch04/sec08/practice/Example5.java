package ch04.sec08.practice;

public class Example5 {
  public static void main(String[] args) throws Exception {
	  
	  for(int x = 1; x <= 10; x++) {
		  for(int y = 1; y <=10; y++) {
			  if ((4 * x) + (5 * y) == 60) {
				  System.out.println("(" + x + "," + y + ")");
			  }
		  }
	  }
  }
}

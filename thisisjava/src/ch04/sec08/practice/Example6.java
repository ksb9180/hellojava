package ch04.sec08.practice;

public class Example6 {
  public static void main(String[] args) throws Exception {
	  
	  for(int i = 1; i <=5; i++) {
		  for(int j = 1; j <= i; j++) {
			  System.out.print("*");
			  if (i == j) {
				  System.out.println();
			  }
		  }
	  }
  }
}

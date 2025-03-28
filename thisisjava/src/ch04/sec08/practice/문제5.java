package ch04.sec08.practice;

public class 문제5 {
  public static void main(String[] args) throws Exception {
	  for(int i = 1; i <= 10; i++) {
		  for(int j = i; j<= (i+9); j++) {
			  System.out.print(j + "\t");
		  }
		  System.out.println();
		  
	  }
  }
}

package ch04.sec08.practice;

public class Example3 {
  public static void main(String[] args) throws Exception {
	  
	  int sum = 0;
	  
	  for (int i = 1; i <= 100; i++) {
		  if (i % 3 == 0) {
			  sum += i;
		  }
	  }
	  System.out.println("3의 배수의 총합: " + sum);
  }
}

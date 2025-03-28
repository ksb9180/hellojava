package ch04.sec08.practice;

public class 문제1 {
  public static void main(String[] args) throws Exception {
	  for(int i = 1; i <= 100; i++) {
		  if(i%5 == 0 && i%7 == 0) {
			  System.out.println(i);
		  }
	  }
  }
}

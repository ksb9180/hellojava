package ch04.sec08.practice;

import java.util.Scanner;

public class 문제2 {
  public static void main(String[] args) throws Exception {
	  System.out.println("숫자를 입력하세요.");
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  
	  for(int i = 1; i <=num; i++) {
		  for(int j = 1; j <= i; j++) {
			  System.out.print(i);
			  if (i == j) {
				  System.out.println();
			  }
		  }
	  }
  }
}

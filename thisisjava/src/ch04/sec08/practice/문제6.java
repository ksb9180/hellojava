package ch04.sec08.practice;

import java.util.Scanner;

public class 문제6 {
  public static void main(String[] args) throws Exception {
	  int sum = 0;
	  
	  System.out.println("숫자를 입력하세요");
	  
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  
	  if (num % 2 != 0) {
		  for (int i = 1; i <= num; i +=2) {
			  sum += i;
		  }
	  } else if (num % 2 ==0) {
		  for (int j = 2; j <= num; j += 2) {
			  sum += j;
		  }
	  }
	  System.out.println("결과값: " + sum);
  }
}
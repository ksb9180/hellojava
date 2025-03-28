package ch04.sec08.practice;

import java.util.Scanner;

public class 문제4 {
  public static void main(String[] args) throws Exception {
	  int max = 0;
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("숫자를 입력하세요");
	  
	  for(int i = 1; i <=5; i++) {
		  System.out.print("숫자: ");
		  int num = sc.nextInt();
		  if (max < num) {
			  max = num;
		  }
	  }
	  System.out.println("최대값은 " + max + "입니다.");
  }
}
	  
//	  Scanner sc = new Scanner(System.in);  // Scanner 객체는 한 번만 생성
//      int max = Integer.MIN_VALUE;  // 최소값으로 초기화하여 어떤 값이든 비교 가능
//
//      System.out.println("숫자를 입력하세요");
//
//      for(int i = 1; i <= 5; i++) {
//          System.out.print("숫자: ");
//          int num = sc.nextInt();  // 사용자 입력 받기
//
//          if (num > max) {
//              max = num;  // 최대값 업데이트
//          }
//      }
//
//      System.out.println("최대값은 " + max + "입니다.");  // 최종 최대값 출력
//      sc.close();  // Scanner 닫기
  

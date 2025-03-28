package ch04.sec08.practice;

import java.util.Scanner;

public class Example7 {
  public static void main(String[] args) throws Exception {
	  boolean run = true;
	  //프로그램이 언제 종료될지를 결정하는 플래그 변수 역할을 함.
	  
	  int balance = 0; //현재 계좌의 잔액(금액)을 저장하는 변수
	  
	  Scanner scanner = new Scanner(System.in);
	  
	  while(run) {
		  System.out.println("----------------------------------");
		  System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		  System.out.println("----------------------------------");
		  System.out.print("선택> ");
		  
		  int num = Integer.parseInt(scanner.nextLine());
		  //scanner.nextLine()은 문자열이므로 Integer.parseInt를 사용해 정수로 변환
		  //nextInt()를 사용하면 코드가 더 간결하지만 입력 버퍼 문제가 발생할 수 있음.
		  //해결하려면 scanner.nextLine();을 추가해 버퍼를 비워야 함.
		  
		  switch(num) {
		  case 1:
			  System.out.print("예금액>");
			  balance += Integer.parseInt(scanner.nextLine());
			  break;
			  
		  case 2:
			  System.out.print("출금액>");
			  balance -= Integer.parseInt(scanner.nextLine());
			  break;
		  case 3:
			  System.out.print("잔고>");
			  System.out.println(balance);
			  break;
		  case 4:
			  run = false; //while문을 빠져나오기 위해 필요
			  break;
		  }
		  
		  System.out.println();
	  }
	  
	  System.out.println("프로그램 종료");
  }
}

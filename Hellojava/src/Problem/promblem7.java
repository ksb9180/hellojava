package Problem;

import java.util.Scanner;

public class promblem7 {
	
	public static void main(String[] args) {
		System.out.println("=================================");
		System.out.println("\t" + "[숫자맞추기게임 시작]");
		System.out.println("=================================");
		
		int randomNumber = (int) (Math.random() * 100) + 1;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(true) {
			if (randomNumber < num) {
				System.out.println("더 낮게");
			}
		}
		
		
		
	}

}

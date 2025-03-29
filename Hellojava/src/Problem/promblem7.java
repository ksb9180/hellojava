package Problem;

import java.util.Scanner;

public class promblem7 {
	
	public static void main(String[] args) {
		System.out.println("=================================");
		System.out.println("\t" + "[숫자맞추기게임 시작]");
		System.out.println("=================================");
		
		Scanner sc = new Scanner(System.in);
		
		boolean play = true;
				
		while(play) {
			int randomNumber = (int) (Math.random() * 100) + 1;
			boolean correct = false;
			
			while(!correct) {
				
				System.out.print(">>");
				int num = sc.nextInt();
				
				if (randomNumber < num) {
					System.out.println("더 낮게");
				} else if (randomNumber > num) {
					System.out.println("더 높게");
				} else {
					System.out.println("맞았습니다.");
					correct = true;
				}
			}
			
			System.out.print("게임을 종료하시겠습니까?(y/n) >>");
			sc.nextLine();
			String response = sc.nextLine();
			
			if (response.equals("y")) {
				play = false;
				System.out.println("=================================");
				System.out.println("\t" + "[숫자맞추기게임 종료]");
				System.out.println("=================================");
			}
			
		}
		
		sc.close();
		
	}

}

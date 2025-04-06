package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Friend[] friendArray = new Friend[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;

		while (true) {
			System.out.println("------------------------");
			System.out.println("1.추가 2.목록 3.수정 4.종료");
			System.out.println("------------------------");
			System.out.print("선택>");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				System.out.print("이름:");
				String name = sc.nextLine();
				System.out.print("전화번호:");
				String phone = sc.nextLine();
				System.out.print("이메일:");
				String email = sc.nextLine();

				Friend friend = new Friend(name, phone, email);
				friendArray[count] = friend;
				count++;
				break;

			case 2:
				for (int i = 0; i < count; i++) {
					friendArray[i].showInfo();
				}
				break;

			case 3:
				System.out.print("이름:");
				String target = sc.nextLine();
				boolean found = false;
				for (int i = 0; i < count; i++) {
					if (friendArray[i].getName().equals(target)) {
						System.out.print("전화번호:");
						String newPhone = sc.nextLine();
						friendArray[i].setHp(newPhone);
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("그런 이름의 친구는 없습니다");
				}
				break;

			case 4:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;

			default:
				System.out.println("잘못된 선택입니다.");
			}
		}
	}
}

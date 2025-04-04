package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {
		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");
		
		for(int i = 0; i < friendArray.length; i++) {
			// 친구정보 입력받기
			String temp = sc.nextLine();
			
			// 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array
			String[] tempArr = temp.split(" ");
			
			// Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
			Friend f = new Friend();
			f.setName(tempArr[0]);
			f.setHp(tempArr[1]);
			f.setSchool(tempArr[2]);
			
			// 배열에 추가하기 ( friendArray <- friend객체 )
			friendArray[i] = f;
		}
		
//		for (int i = 0; i < friendArray.length; i++) {
//			// 친구정보 입력받기
//			String info = sc.nextLine();
//
//			// 입력받은 친구정보를 공백으로 분리 String 클래스에 split(" ") -> array
//			String[] resultInfo = info.split(" ");
//
////        	// Friend 객체 생성하여 데이터 넣기 -> 생성자 호출 -> 객체 생성
////        	Friend friend = new Friend(resultInfo[0], resultInfo[1], resultInfo[2]);
////        	
////        	// 배열에 추가하기 ( friendArray <- friend객체 )
////        	friendArray[i] = friend;
//
//			// Friend 객체 생성과 배열 추가 동시에 하기
//			friendArray[i] = new Friend(resultInfo[0], resultInfo[1], resultInfo[2]);
//		}

		// 친구정보 출력
		for (int i = 0; i < friendArray.length; i++) {
			// 친구정보 출력 메소드 호출
			friendArray[i].showInfo();
		}
		sc.close();
	}
}

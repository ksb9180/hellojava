package ch05.sec05;

public class stringexample {
	
	public static void main(String[] args) {
		String name1 = new String("자바 프로그래밍");
		String name2 = new String("홍길동");
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
//		System.out.println(name1.charAt(0));
		System.out.println(name1.length());
		System.out.println(name2.length());
	}

}

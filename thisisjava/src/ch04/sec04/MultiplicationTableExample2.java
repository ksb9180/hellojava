package ch04.sec04;

public class MultiplicationTableExample2 {
	public static void main(String[] args) {
//		for (int m=2; m<=9; m++) {
//			System.out.println("*** " + m + "단 ***");
//			
//			for (int n=1; n<=9; n++) {
//				System.out.println(m + " x " + n + " = " + (m*n));
//			}
//		}
		for (int k=2; k<=9; k++) {
			System.out.print(k + "단" + "\t" + "\t");
		}
		System.out.println();
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				System.out.print(j + " x " + i + " = " + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}


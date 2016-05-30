package 시험;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("기능1 : 문자열을 두개 입력");
		System.out.println("기능2 : 두수와 연산자를 입력");
		System.out.println("기능3 : 프로그램 종료");
		System.out.println("원하는 기능을 입력하시오");
		Scanner input = new Scanner(System.in);
		Test2_1 ref = new Test2_1();

		int a = input.nextInt();

		if (a == 3)
			System.out.println("프로그램 종료");
		else if (a == 1) {
			ref.St_start();
			ref.method();
		} else if (a == 2) {
			ref.Int_start();
			ref.method(1);
		}
	}
}

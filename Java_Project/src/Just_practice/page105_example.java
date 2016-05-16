package Just_practice;

import java.util.*;

public class page105_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int integer;

		System.out.println("정수를 입력하시오.");
		integer = input.nextInt();

		if (integer % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		System.out.println("시스텀이 종료되었습니다.");
	}

}

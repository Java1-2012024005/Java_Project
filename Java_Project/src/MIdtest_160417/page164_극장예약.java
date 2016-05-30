package MIdtest_160417;

import java.util.*;

public class page164_극장예약 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, };
		int a = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println("  1  2  3  4  5  6  7  8  9  10");
		System.out.println("--------------------------------");
		while (true) {
			for (int i = 0; i < s.length; i++) {
				System.out.print("  " + s[(i)]);
			}
			System.out.println("");
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): ");
			a = input.nextInt();
			if (a == -1)
				break;
			else if (s[(a - 1)] == 1)
				System.out.println("이미 예약된 자리입니다.");
			else {
				s[(a - 1)] = 1;
				System.out.println("예약되었습니다.");
			}
		}

		System.out.println("종료되었습니다.");
	}

}

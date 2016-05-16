package Just_practice;

import java.util.*;

public class page107_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int targetsales = 1000;
		int mysales, bonus;
		Scanner input = new Scanner(System.in);

		System.out.println("실적을 입력하시오(단위 : 만원) ");
		mysales = input.nextInt();
		bonus = (mysales - targetsales) / 10;
		if (mysales > targetsales) {
			System.out.println("실적달성");
			System.out.println("보너스 : " + bonus);
		} else
			System.out.println("실적달성 실패");

	}

}

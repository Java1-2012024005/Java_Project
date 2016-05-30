package Just_practice;

import java.util.*;

public class page125_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num, i = 1;
		System.out.println("구구단 중에서 출력하고 싶은 단을 입력하시오.");
		num = input.nextInt();

		while (i < 10) {
			System.out.println(num + "*" + i + "=" + num * i);
			i++;
		}

	}

}

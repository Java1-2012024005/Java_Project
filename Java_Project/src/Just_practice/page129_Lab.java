package Just_practice;

import java.util.*;

public class page129_Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두개의 정수를 입력하시오(큰수, 작은수) : ");
		Scanner input = new Scanner(System.in);
		int num1, num2, a, b;
		num1 = input.nextInt();
		num2 = input.nextInt();
		a = num1;
		b = num2;
		int r;
		while (num2 != 0) {
			r = num1 % num2;
			num1 = num2;
			num2 = r;
		}
		System.out.println("최대 공약수는 " + num1);
		System.out.println("최소 공배수는 " + a * b / num1);
	}
}

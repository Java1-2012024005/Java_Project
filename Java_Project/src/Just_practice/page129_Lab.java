package Just_practice;

import java.util.*;

public class page129_Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ΰ��� ������ �Է��Ͻÿ�(ū��, ������) : ");
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
		System.out.println("�ִ� ������� " + num1);
		System.out.println("�ּ� ������� " + a * b / num1);
	}
}

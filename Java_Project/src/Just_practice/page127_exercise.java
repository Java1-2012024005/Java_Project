package Just_practice;

import java.util.*;

public class page127_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;

		do {
			System.out.println("�ùٸ� ���� �Է��Ͻÿ� [1-12] :");
			num = input.nextInt();
		} while (num < 1 || num > 12);
		System.out.println("����ڰ� �Է��� ����  "+num);
	}
}

package Just_practice;

import java.util.*;

public class page107_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int targetsales = 1000;
		int mysales, bonus;
		Scanner input = new Scanner(System.in);

		System.out.println("������ �Է��Ͻÿ�(���� : ����) ");
		mysales = input.nextInt();
		bonus = (mysales - targetsales) / 10;
		if (mysales > targetsales) {
			System.out.println("�����޼�");
			System.out.println("���ʽ� : " + bonus);
		} else
			System.out.println("�����޼� ����");

	}

}

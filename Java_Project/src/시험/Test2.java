package ����;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���1 : ���ڿ��� �ΰ� �Է�");
		System.out.println("���2 : �μ��� �����ڸ� �Է�");
		System.out.println("���3 : ���α׷� ����");
		System.out.println("���ϴ� ����� �Է��Ͻÿ�");
		Scanner input = new Scanner(System.in);
		Test2_1 ref = new Test2_1();

		int a = input.nextInt();

		if (a == 3)
			System.out.println("���α׷� ����");
		else if (a == 1) {
			ref.St_start();
			ref.method();
		} else if (a == 2) {
			ref.Int_start();
			ref.method(1);
		}
	}
}

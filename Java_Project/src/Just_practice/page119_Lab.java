package Just_practice;

import java.util.*;

public class page119_Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�.");
		int monthnum;
		monthnum = input.nextInt();
		switch (monthnum) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("���� ������ 31");
			break;
		case 2:
			System.out.println("���� ������ 28");
		default:
			System.out.print("���� ������ 30");
		}
	}
}

package Just_practice;

import java.util.*;

public class page106_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int fst_int, scd_int;

		System.out.println("ù��° ����");
		fst_int = input.nextInt();

		System.out.println("�ι�° ����");
		scd_int = input.nextInt();

		if (fst_int > scd_int)
			System.out.println("ū���� " + fst_int);
		else
			System.out.println("ū���� " + scd_int);
	}

}

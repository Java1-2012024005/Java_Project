package ����;

import java.util.*;

public class Test2_1 {

	String b, c, s1;
	int e, f;

	void St_start() {
		Scanner input = new Scanner(System.in);
		System.out.println("���ڿ� 2���� �Է��Ͻÿ�");
		b = input.next();
		c = input.next();

	}

	void Int_start() {
		Scanner input = new Scanner(System.in);
		System.out.println("�� 2���� �����ڸ� �Է��Ͻÿ�.");
		e = input.nextInt();
		f = input.nextInt();
		s1 = input.next();
	}

	void method() {
		System.out.println(b.concat(c));
	}

	void method(int i) {
		if (s1.equals("+"))
			System.out.println(e + "+" + f + "=" + (e + f));
		else if (s1.equals("-"))
			System.out.println(e + "-" + f + "=" + (e - f));
		else if (s1.equals("*"))
			System.out.println(e + "*" + f + "=" + (e * f));
		else if (s1.equals("/"))
			System.out.println(e + "/" + f + "=" + (e / f));
		else if (s1.equals("%"))
			System.out.println(e + "%" + f + "=" + (e % f));
	}

}

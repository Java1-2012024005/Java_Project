package 시험;

import java.util.*;

public class Test2_1 {

	String b, c, s1;
	int e, f;

	void St_start() {
		Scanner input = new Scanner(System.in);
		System.out.println("문자열 2개를 입력하시오");
		b = input.next();
		c = input.next();

	}

	void Int_start() {
		Scanner input = new Scanner(System.in);
		System.out.println("수 2개와 연산자를 입력하시오.");
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

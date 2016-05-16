package Just_practice;

import java.util.*;

public class page106_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int fst_int, scd_int;

		System.out.println("첫번째 정수");
		fst_int = input.nextInt();

		System.out.println("두번째 정수");
		scd_int = input.nextInt();

		if (fst_int > scd_int)
			System.out.println("큰수는 " + fst_int);
		else
			System.out.println("큰수는 " + scd_int);
	}

}

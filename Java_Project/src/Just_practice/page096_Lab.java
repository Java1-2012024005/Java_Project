package Just_practice;

import java.util.*;

public class page096_Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, area;
		System.out.println("반지름을 입력하시오");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		area = 3.14 * radius * radius;

		System.out.println(area);
	}

}

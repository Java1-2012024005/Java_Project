package Just_practice;

import java.util.*;

public class page098_Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w, h, area, perimeter;
		Scanner input = new Scanner(System.in);
		
		System.out.println("사각형의 가로를 입력하시오.");
		w = input.nextDouble();
		System.out.println("사각형의 세로를 입력하시오.");
		h = input.nextDouble();
		
		area = w * h;
		perimeter = 2*(w+h);
		
		System.out.println("사각형의 넓이는  "+area);
		System.out.println("사각형의 둘레는  "+perimeter);

	}

}

package Just_practice;

import java.util.*;

public class page109_Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int grade;

		System.out.println("성적을 입력하시오 : ");
		grade = input.nextInt();
		if (grade >= 90) {
			System.out.println("학점 A");
		} else if (grade >= 80) {
			System.out.println("학점 B");
		} else if (grade >= 70) {
			System.out.println("학점 C");
		} else if (grade >= 60) {
			System.out.println("학점 D");
		} else {
			System.out.println("학점 F");
		}
	}

}

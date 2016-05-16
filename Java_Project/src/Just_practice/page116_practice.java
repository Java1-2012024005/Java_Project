package Just_practice;

import java.util.*;

public class page116_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("성적을 입력하시오.");
		int grade;
		grade = input.nextInt();
		grade = grade/10;
		
		switch(grade)
		{
			case 10:
			case 9:
			System.out.println("A");
			break;
			
			case 8:
			System.out.println("B");
			break;
			
			case 7:
			System.out.println("C");
			break;
			
			case 6:
			System.out.println("D");
			break;
			
			default:
			System.out.println("F");
			break;
		}
		
	}

}

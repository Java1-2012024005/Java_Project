package Just_practice;

import java.util.*;

public class page117_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("월의 이름을 입력하시오.");

		String month;
		month = input.next();

		int monthnum;
		switch (month) {
		case "january":
			monthnum = 1;
			break;
		case "Fabruary":
			monthnum = 2;
			break;
		case "March":
			monthnum = 3;
			break;
		default:
			monthnum = 0;
			break;
		}
		System.out.println(monthnum);
	}

}
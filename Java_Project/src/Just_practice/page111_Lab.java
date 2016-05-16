package Just_practice;

import java.util.*;

public class page111_Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("현재시간은"+date);
		
		int currenthour = date.getHours();
		if(currenthour<11)
		System.out.println("Good morning");
		else if(currenthour<15)
			System.out.println("Good afternoon");
		else if(currenthour<20)
			System.out.println("Good evening");
		else 
			System.out.println("Good night");
	}

}

package ½ÃÇè;

import java.util.Scanner;

public class profess2_1 {
	Scanner input = new Scanner(System.in);
	
	
	void function1(){
		String str1, str2;
		System.out.print("Input String1");
		str1 = input.next();
		str2 = input.next();
		function3(str1,str2);
	}	
	
	void function2(){
		System.out.println("AM");
		function3(99);
	}
	
	void function3(String str_a, String str_b){
		System.out.println();
	}
	
	void function3(int x){
		System.out.println(x);
	}
}

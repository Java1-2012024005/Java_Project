package MIdtest_160417;
import java.util.*;
public class practice1 {

	public static void main(String[] args) {
		int[] s = {60, 90, 80, 100, 20, 60, 70};
		int z=0, i;
		Scanner input = new Scanner(System.in);
		System.out.print("탐색할 값을 입력하시오 : ");
		z = input.nextInt();
		
		for(i=0; i<s.length; i++)
		{
			if(s[i]==z)
				break;
		}
		System.out.println(z+"값은 "+(i+1)+"위치에 있습니다.");
	}
}

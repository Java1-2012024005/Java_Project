package MIdtest_160417;
import java.util.*;
public class practice1 {

	public static void main(String[] args) {
		int[] s = {60, 90, 80, 100, 20, 60, 70};
		int z=0, i;
		Scanner input = new Scanner(System.in);
		System.out.print("Ž���� ���� �Է��Ͻÿ� : ");
		z = input.nextInt();
		
		for(i=0; i<s.length; i++)
		{
			if(s[i]==z)
				break;
		}
		System.out.println(z+"���� "+(i+1)+"��ġ�� �ֽ��ϴ�.");
	}
}

package Sample_0328;

public class For_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int j = 100; j >= 10; j -= 10) {
			System.out.println(j);
		}
		int j = 10;
		for (; j >= 1;) {
			System.out.println(j * 10);
			j--;
		}
		while (j >= 1) {
			System.out.println(j * 10);
			j--;
		}

	}
}

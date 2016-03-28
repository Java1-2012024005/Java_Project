package Sample_0328;

public class For_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// example) 1 1 1 2 1 3 2 1 2 2 2 3 print!
		for (int l = 1; l <= 2; l++) {
			for (int m = 1; m <= 3; m++) {
				System.out.println(l + " " + m);
			}
		}
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + "X" + i + "=" + i * j + " ");
			}
			System.out.println(" ");
		}
	}

}

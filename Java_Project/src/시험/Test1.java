package 시험;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 8; i > 0; i--) { // 백의 자리 숫자를 차례대로 생성
			for (int j = 1; j < 7; j++) { // 일의 자리 숫자를 차례대로 생성
				if ((i == 8 || i == 7) && j == 5) { // 백의 자리가 7과 8인것은 일의자리 4까지만 프린트
					break;
				}

				if ((i == 6 || i == 5) && (j == 4 || j == 5)) { // 백의 자리가 5와 6인것은 일의자리 4와 5을 제외하고 프린트
					continue;
				}

				if ((i == 1) && (j == 4 || j == 5)) {  // 백의 자리가 1인 것은 4와 5를 제외하고 6은 6의 자리에 프린트
					System.out.print("\t");
					continue;
				}
				System.out.print(i);
				System.out.print(0);
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}
		System.out.println("<< 학번 : 2012024005 >>");
	}

}

package ����;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 8; i > 0; i--) { // ���� �ڸ� ���ڸ� ���ʴ�� ����
			for (int j = 1; j < 7; j++) { // ���� �ڸ� ���ڸ� ���ʴ�� ����
				if ((i == 8 || i == 7) && j == 5) { // ���� �ڸ��� 7�� 8�ΰ��� �����ڸ� 4������ ����Ʈ
					break;
				}

				if ((i == 6 || i == 5) && (j == 4 || j == 5)) { // ���� �ڸ��� 5�� 6�ΰ��� �����ڸ� 4�� 5�� �����ϰ� ����Ʈ
					continue;
				}

				if ((i == 1) && (j == 4 || j == 5)) {  // ���� �ڸ��� 1�� ���� 4�� 5�� �����ϰ� 6�� 6�� �ڸ��� ����Ʈ
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
		System.out.println("<< �й� : 2012024005 >>");
	}

}

package Sample_0509;

public class Outerclass {
	private int value = 10;

	class InnerClass {
		public void myMethod() {
			System.out.println("�ܺ�Ŭ������ private ���� �� : " + value);
		}
	}

	Outerclass() {
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}
}

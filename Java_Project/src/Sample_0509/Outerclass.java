package Sample_0509;

public class Outerclass {
	private int value = 10;

	class InnerClass {
		public void myMethod() {
			System.out.println("외부클래스의 private 변수 값 : " + value);
		}
	}

	Outerclass() {
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}
}

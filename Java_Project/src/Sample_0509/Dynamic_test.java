package Sample_0509;

abstract class Animal1
{
	//void sound()
		abstract void sound();
		//System.out.println("Animal Å¬·¡½ºÀÇ sound()"+c);
}

class Dog extends Animal1
{
	private int d=1;
	void sound()
	{
		System.out.println("¸Û¸Û"+d);
	}
}

class Cat extends Animal1
{
	void sound()
	{
		System.out.println("¾ß¿ë");
	}
	void eat()
	{
		System.out.println("ani eat");
	}
}

public class Dynamic_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 animal1 = new Animal1();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal1 obj;
		
		obj = animal1;
		obj.sound();
		
		obj = dog;
		obj.sound();
		
		obj = cat;
		obj.sound();
	}
	static void test(Animal temp)
	{
		temp.sound();
	}

}

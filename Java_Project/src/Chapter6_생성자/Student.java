package Chapter6_������;

public class Student {
	private int number;
	private String name;
	private int age;
	
	Student()
	{
		number=100;
		name="�躴��";
		age=24;
	}
	
	Student(int number, String name, int age)
	{
		this.number = number;
		this.name=name;
		this.age=age;
	}
	@Override
	
	public String toString()
	{
		return "Student [number="+number+name+age;
	}
}

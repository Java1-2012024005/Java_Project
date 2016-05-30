package Sample_160425;

public class student {
	private int number;
	private String name;
	private int age;
	
	student(){
		number = 100;
		name = "New Student";
		age = 18;
	}
	
	student(int number, String name, int age){
		this.number = number;
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "Stduent[number="+number+",name="+name+",age="+age+"]";
		
	}
}

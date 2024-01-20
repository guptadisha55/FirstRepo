
public class Dog {
	
	String name ;
	int leg ;
	int tail ;
	int age ;
	static int eye ;
	
	static{
		System.out.println("static block");
		eye = 300;
	}
	
	public Dog() {
		this("dd");
		System.out.println("default constructor");
	}
	
	public Dog(String name1) {
		System.out.println("i am parametric " + name1);
	}
	
	public void eat() {
		int input = 10;
		System.out.println(" Dog is eating");
		System.out.println(input);
	}
	
	public void run() {
		this.eat();
		System.out.println("runing");
		System.out.println(tail);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		System.out.println(eye);
		return 4;
	}
	
	public static void display() {
		System.out.println("display");
		int o =100;
	}
	

}

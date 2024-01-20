
public class Service {
	
	public static void main(String[] args) {
		System.out.println(Dog.eye);
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		Dog.eye=2;
		Dog.eye =10;
		Dog.display();
		
		dog1.leg=3;
		dog2.leg=1;
		
		System.out.println(dog1.leg);
		System.out.println(dog2.leg);
		System.out.println(dog1.eye);
		System.out.println(dog2.eye);
	}

}

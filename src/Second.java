
public class Second extends First {
	
	int rollno;
	String surname;
	
	public Second() {
		super();
		System.out.println("dc");
	}
	
	public Second(String surname) {
		System.out.println("pc");
	}
	
	public void add() {
		System.out.println("goo");
	}
	
	public int add(int num1, String see) {
		System.out.println("free");
		return num1;
	}
	

	
	
	public void add(int l) {
		System.out.println(l);
	}

	
	public void add(String str, int numb, boolean tyre) {
		System.out.println("str");
	}
	
	public static void main(String[] args) {
		Second s = new Second();
		s.rollno= 1;
		s.add('A');
		System.out.println(s.sum);
	}

}


public class First {
	
	int sum = 11;
	String name = "Disha";
	final int marks ;
	
	public First() {
		marks=100;
		System.out.println("Default constructor");
	}
	
	public First(String name1,int mark) {
		this.marks = mark;
		System.out.println("parameteric constructor");
	}

	public void add() {
		System.out.println("goo");
	}
	
	public int add(int num1, String see) {
		System.out.println("free");
		return num1;
	}
	
	public final void sum() {
		System.out.println("fianl method");
	}
}

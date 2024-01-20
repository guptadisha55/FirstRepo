
public class InvalidAge extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidAge() {
		
	}
	
	public InvalidAge(String message) {
		super(message);
	}
}

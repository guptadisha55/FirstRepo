
public class AnnualDay {
	
	public static void main(String[] args) {
		System.out.println("1");
		String rollno = "14";
		System.out.println(Integer.parseInt(rollno));
		try {
			int a = 17;
			if(a<18) {
				throw new InvalidAge("not valid for vote");
			}
			System.out.println("2");
		}catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e1){
			System.out.println(e1.getMessage());
		}finally {
			System.out.println("4");
		}
		
		
	}

}

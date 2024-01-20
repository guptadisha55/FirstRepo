
public class PracticeString {
	
	public static void main(String[] args) {
		String s = "Disha";
		String s1 = " Gupta";
		
		String s2 = s.concat(s1);
		System.out.println(s2);
		
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.substring(2));
		System.out.println(s1.substring(1, 6));
		System.out.println(s2.contains(s));
		System.out.println(s2.equals(s1));
		System.out.println(s.isEmpty());
		
		
	}

}

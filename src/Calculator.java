
public class Calculator {

	public static void main(String[] args) {
		int i = 0;
		long b = 67256246l;
		double d = 3.454d;
		short s = 33;
		float f = 3.3f;
		boolean c = false;
		char a = 'a';

		String name = "disha";
		int[] no = { 1, 2, 3, 4, 5 };
		int[] form = new int[10];
		form[0] = 100;

		int firstNum = 10;
		int secondNum = 20;
		int thirdNum = 11;
		int result = firstNum + secondNum;// -, * , /, %(reminder)
		System.out.println(result);
		
		
		//// control statement
		
		
		if (firstNum > secondNum && firstNum > thirdNum) {
			System.out.println("first is greater");
		} else if (secondNum > firstNum && secondNum > thirdNum) {
			System.out.println("Sec is greater");
		} else {
			System.out.println("thirdNum is greater");
		}

		int userInput = 11;
		switch (userInput) {
		case 1:
			System.out.println("broadband selected");
			break;
		case 2:
			System.out.println("activation");
			break;
		default:
			System.out.println("invalid input");
		}

		// loop

		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}

		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			k++;
		}

		int z = 11;
		do {
			System.out.println(z);
			z++;
		} while (z < 10);

		System.out.println("**********");
		for (int bb = 10; bb > 0; bb--) {
			if (bb % 2 == 0) {
				System.out.println(bb + "is even");
			} else {
				System.out.println(bb + "is odd");
			}
		}

		int cat = 1;
		while (cat <= 10) {
			cat++;
			if (cat == 5) {
				continue;
			}
			System.out.println(cat);
		}

	}
}

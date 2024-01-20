
public class MiniAndMaxArray {
	
	public static void min(int[] input) {
		int min = input[0];
		for(int i = 1; i <input.length;i++) {
			if(min>input[i]) {
				min=input[i];
			}
		}
		System.out.println(min);
	}
	
	public static void max(int[] input) {
		int max = input[0];
		for(int j = 1; j<input.length;j++) {
			if(max<input[j]) {
				max=input[j];
			}
		}
		System.out.println("*********");
		System.out.println(max);
	}

	public static void main(String[] args) {

		  int[] a = new int[5]; 
		  int b[] = { 1, 2, 3, 4, 5 };
		  
		  for(int i = 0; i<5;i++) {
		  	 a[i] = i; 
		  } 
		  for(int k :a){ 
			  //System.out.println(k);
		  }
		  
		  for(int j : b) { 
			//System.out.println(j); 
		  }
		 
		
		  int[] input = {33,4,5,2,7878,908,34,11};
		  MiniAndMaxArray.min(input);
		  MiniAndMaxArray.max(input);
		
	}
}

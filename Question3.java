//Question 3: Karson Mathews
public class Question3 {
	public static void main(String[] args) {
		
		//Looping string backwards with simple for loop
		String str = "hat";
		int length = str.length();
		for (int i =length-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}

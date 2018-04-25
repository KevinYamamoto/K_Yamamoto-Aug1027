
public class HW {

	public static void main(String[] args) {
		System.out.println("Choose one:");
		System.out.println("I - Tests if word is a Palindrome");
		System.out.println(invertable("level"));
	}
	public static boolean invertable(String word) {
		boolean invert = true;
		int middle = word.length()/2;
		if (word.length()%2==1) {
			for (int x = 0;x<middle;x++) {
				if (word.charAt(middle+1)!=word.charAt(middle-1)) {
					invert = false;
				}
			}
		}
		else {
			//declare 2 variables
			for (int x = 1; x<middle; x++) {
				if (word.charAt(middle)!=word.charAt(middle-1)) {
					invert = false;
				}
			}
		}
		return invert;
	}
}

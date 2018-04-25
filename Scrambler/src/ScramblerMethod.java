public class ScramblerMethod{
	public static String scrambleIt(String word) {
		String word2 ="";
		if (word.length()<=1) {
			return word;
		}
		else {for (int x=0;x<word.length()-1;x++) {
			if (word.charAt(x)=='A') {
			  if(word.charAt(x+1) != 'A') {
				 word2 = word2.substring(0,x) + word.substring(x+1, x+2) + word.substring(x,x+1)+word.substring(x+2);
			  }
			}
		}
		return word2;
	}
	}
}
import java.util.Arrays;
public class Split {

	public static void main(String[] args) {
		// Your task Part 0
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
//			it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really")
//			it will split at the word "really" and return an array of ["I "," like "," red apples!"]
		//play around with String.split! 
		//What happens if you "I reallyreally likeapples".split("really") ?
		System.out.println((sandwichSplitter("applespineapplesbreadlettustomatobreadbaconmayobreadhambreadcheese")));
	}
	public static String ingredients(String sandwich) {
		String[] ingredients= sandwich.split("bread");
		String food= (Arrays.toString(ingredients));
		return food.substring(1,food.length()-1);
	}
	public static String sandwichSplitter(String sandwich) {
		int num = 0;
		for (int x=0;x<sandwich.length()-5;x++) {
			if (sandwich.substring(x,x+5).equals("bread")) {
				num++;
			}
		}
		if (num<3) {
		String[] whole = sandwich.split("bread");
		String inside = whole[1];
		String[] ingredients = inside.split(" ");
		String food= (Arrays.toString(ingredients));
		return food.substring(1,food.length()-1);
	}
		else {
			String[] whole = sandwich.split("bread");
			String inside ="";
			for (int x=1;x<num+1;x++) {
				inside += whole[x];
			}
			String[] ingredients = inside.split(" ");
			String food= (Arrays.toString(ingredients));
			return food.substring(1,food.length()-1);
		}
	}
}

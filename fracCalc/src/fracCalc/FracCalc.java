package fracCalc;
import java.util.*;
public class FracCalc {
	private int w1;
	private int num1;
	private int den1;
	private int w2;
	private int num2;
	private int den2;
	private String wholeAsAString;
	private String denAsAString;
	private String numAsAString;
	private String input;
	public void client() {
		boolean quit = false;
		Scanner Client = new Scanner(System.in);
		input = Client.nextLine();
		if (input.equals("quit")) {
    		quit = true;
    		Client.close();
    	}
    	else{
    		System.out.println(FracToString(input));
    		}
	}
	public void split() {
		String operator1;
		String operator2;
		String[] split;
		split = input.split(" ");
		operator1 = split[1];
		String[] operand1 = split[0].split("_");
		w1 = Integer.parseInt(operand1[0]);
		String[] frac1 = operand1[1].split("/");
		num1 = Integer.parseInt(frac1[0]);
		den1 = Integer.parseInt(frac1[1]);
		String[] operand2 = split[0].split("_");
		operator2 = split[2];
		w2 = Integer.parseInt(operand2[0]);
		String[] frac2 = operand2[1].split("/");
		num2 = Integer.parseInt(frac2[0]);
		den2 = Integer.parseInt(frac2[1]);
	}
	public void toMixedNum() {
	
	}
	/*public void toImproperFrac() {
		int numer1 = num1;
		int denom1 = den1;
		if (w1!=0) {
			int num1 = (((w1*den1)+numer1));
			int den1 = (denom1);
    	}
		int numer2 = num2;
		int denom2 = den2;
		if (w2!=0) {
			int num2 = (((w2*den2)+numer2));
			int den2 = (denom2);
    	}
	}
	*/
	private int toInt(String str) {
		int solve;
		solve = Integer.parseInt(str);
		return solve;
	}
	public void simplify() {
	
	}
	public String FracToString(String in) {
		int whole2 = w2;
	return "whole:"+0+" numerator:"+num2+" denominator:"+den2;
	}
}

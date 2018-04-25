/* Kevin Yamamoto
 * September 6, 2017
 * Our self written math library... it contains a series of methods to do basic math functions.
 */
public class Calculate 
{
	//Part1
		//square the input
		public static int square(int operand)
		{
			return operand*operand;
		}
		//cube the input
		public static int cube(int operand)
		{
			return operand*operand*operand;
		}
		//average two inputs
		public static double average(double operand1,double operand2)
		{
			return (operand1+operand2)/2;
		}
		//average three inputs
		public static double average(double operand1,double operand2,double operand3)
		{
			return (operand1+operand2+operand3)/3;
		}
		//converts radians to degrees
		public static double toDegrees(double radians)
		{
			return ((radians/(2*3.14159))*360);
		}
		//converts degrees to radians
		public static double toRadians(double degrees)
		{
			return((degrees/360)*(2*3.14159));
		}
		//returns discriminant of input
		public static double discriminant(double operanda, double operandb, double operandc)
		{
			return (operandb*operandb)-(4*operanda*operandc);
		}
		//converts mixed numbers to improper fractions
		public static String toImproperFrac(int wholenum, int numerator, int denominator)
		{
			int top = (((wholenum*denominator)+numerator));
			int bottom = (denominator);
			return top+"/"+bottom;
		}
		//converts improper fractions to mixed numbers
		public static String toMixedNum(int numerator, int denominator)
		{
			int number = (numerator/denominator);
			int top = (numerator % denominator);
			int bottom = (denominator);
			return number+"_"+top+"/"+bottom;
		}
		//foils input
		public static String foil(int operand1,int operand2,int operand3,int operand4,String operandvar)
		{
			int a = (operand1*operand3);
			int b = ((operand1*operand4)+(operand2*operand3));
			int c = (operand2*operand4);
			if ((operand2*operand4)>=0){
			return a+operandvar+"^2"+" + "+b+ operandvar+" + "+c;
			}
			int d = ((operand2*operand4)*-1);
			return a+operandvar+"^2"+" + "+b+ operandvar+" - "+d;
		}
	//Part 2
		//tests if x is divisible by y
		public static boolean isDivisibleBy(int operandx,int operandy)
		{
			if ((operandx % operandy)==0) 
			{
				return true;
			}
				return false;
		}
		//calculates absolute value of operand
		public static double absValue(double operand)
		{
			if (operand>=0) {
				return operand;
			}
			return operand*-1;
		}
		//returns largest of two numbers
		public static double max(double operanda,double operandb)
		{
			if (operanda > operandb) {
				return operanda;
			}
			return operandb;
		}
		//returns largest of three numbers
		public static double max(double operanda,double operandb,double operandc)
		{
			if (operanda > operandb){
				if (operanda > operandc) {
					return operanda;
				}
				else if (operandb > operandc) {
					return operandb;
				}
			}
			return operandc;
		}
		//returns smallest of 2 numbers
		public static int min(int operanda,int operandb)
		{
			if (operanda > operandb) {
				return operandb;
			}
			else return operanda;
		}
		//rounds operand to 2 decimal places
		public static double round2(double operand)
		{
			if (operand>=0) 
			{
				if (((operand*1000)%10)>=5) 
				{
					return (((10-(operand*1000)%10))+(operand*1000))/1000;
				}
				return ((operand*1000)-((operand*1000)%10))/1000;
			}
			if (((operand*1000)%10)<=-5) 
			{
				return (((-10-(operand*1000)%10))+(operand*1000))/1000;
			}
				return ((operand*1000)-((operand*1000)%10))/1000;
		}
	//Part 3
		//raises value to exponent power
		public static double exponent(double base,int exponent)
		{
			if (base==0) {
				return 0;
			}
			else if (exponent==0) {
				return 1;
			}
			else if (exponent>0){
			double basebase=base;
			for (int i=0; i<exponent;i++) 
			{
				base = base*basebase;
			}
			return base/basebase;
			}
			else {
			double basebase=base;
			for (int i=0; i>exponent;i--)
			{
			base = base*basebase;
			}
			return basebase/base;
			}
		}
		//returns factorial of value passed
		public static int factorial(int factorial)
		{
			int base = factorial;
			for (int i=factorial;i>=1;i--) 
			{
				factorial= factorial*i;
			}
			return factorial/base;
		}
		//tests if a number is prime
		public static boolean isPrime(int number) 
		{
			if (number<0) {
				return false;
			}
			for (int i=2;i<100;i++) {
				if (Calculate.isDivisibleBy(number,i)==true) {
					return false;
				}
			}
			return true;
		}
		//finds greatest common factor of two variables
		public static int gcf(int x,int y) 
		{
			if (x==0) {
				return y;
			}
			else if (y==0) {
				return x;
			}
			else if (x==y) {
				return x;
			}
			else if (x>y) {
				int i=y;
				while (i>0){
					if (((x%i)==0)&&((y%i)==0)) {
						return i;
					}
					i--;
				}
			}
			else if (y>x) {
				int i=x;
				while (i>0){
					if (((y%i)==0)&&((x%i)==0)) {
						return i;
					}
					i--;
				}
			}
			return 1;
		}
		//calculates the square root of a number
		public static double sqrt(double n) {
			if ((n<=100)&&(n>0)) {
				double x = 10;
				for (int i=0;i<1000;i++) 
				{
					x= (0.5*((n/x)+x));
				}
				return Calculate.round2(x);
			}
			else if (n>100) 
			{
				double y = 15;
				for (int i=0;i<100000;i++) 
				{
					y= (0.5*((n/y)+y));
				}
				return Calculate.round2(y);
			}
			return 0;
		}
	//Part 4
		//finds the roots of a quadratic equation
		public static String quadForm(int a,int b,int c) {
		int discriminant = (Calculate.square(b)-(4*a*c));
		double discriminanta =((-1*b)+Calculate.sqrt(discriminant))/(2*a);
		double discriminantb =((-1*b)-Calculate.sqrt(discriminant))/(2*a);
		String Stringdiscriminanta = "" + discriminanta;
		String Stringdiscriminantb = "" + discriminantb;
		if (discriminant <0) {
			return "no real roots";
		}
		else if (discriminant > 0){
				return Stringdiscriminanta+" and "+Stringdiscriminantb;
			}
		else if (discriminant == 0) {
			if((discriminanta==(int)discriminanta)) {
				return Stringdiscriminanta;
			 }
		}
		return Stringdiscriminantb;
		}
}

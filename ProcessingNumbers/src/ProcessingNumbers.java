import java.util.*;
public class ProcessingNumbers {
//doesnt work :(
	public static void main(String[] args) {
		System.out.println("Enter some numbers.");
		Scanner userInput=new Scanner(System.in);
		int max = 0;
		int min = 0;
		boolean done = false;
		int sum = 0;
		//What if user wants to input more than 100 numbers?
		//Using a set a amount can lead to problems.
		int[] list = new int[100];
		for (int i=0;i<list.length;i++) {
			list[i]=userInput.nextInt();
			max = Math.max(max, list[i]);
			min = Math.min(min, list[i]);
		}
		//need more of ur code inside loop to make the program run properly.
		while (!done) {
			/*ur for loop is redundant in this case, bc u already are using a while.
			either use the for or while loop. If using a for loop u don't need the done
			variable 
			*/
			for (int x=0;x<list.length;x++) {
				if (list[x]%2==0) {
					sum +=list[x];
				}
			}
			done = true;
		}
		System.out.println("Your max is "+max+".");
		System.out.println("Your min is "+min+".");
		System.out.println("The sum of your even numbers is "+sum+".");
		if (userInput.next().length()==0) {
			userInput.close();
		}
	}

}

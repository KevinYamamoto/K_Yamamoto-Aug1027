package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{
	public static void main(String[] args)
	{
		Spreadsheet chart = new Spreadsheet();
	    Scanner input = new Scanner(System.in);
	  
	    String command=input.nextLine();
	    while(!command.equals("quit")) {
	    		System.out.println(chart.processCommand(command));
	    		command=input.nextLine();
	    	}
	}
}



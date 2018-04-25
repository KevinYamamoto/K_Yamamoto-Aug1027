package textExcel;

public class Spreadsheet implements Grid
{
	private Cell[][] spreadsheet = new Cell[getRows()][getCols()];
	public Spreadsheet() {
		clearAll();
	}
	
	public void clearAll() {
		for (int x=0;x<getRows();x++) {
			for (int y=0;y<getCols();y++) {
				spreadsheet[x][y]= new EmptyCell();
			}
		}
	}
	@Override
	public String processCommand(String command)
	{
		String[] list = command.split(" ", 3);
		
		if (command.toLowerCase().equals("clear")) {
			clearAll();
		}
		
		else if ((command.length()<=3)) {
			SpreadsheetLocation loc = new SpreadsheetLocation(command);
			return spreadsheet[loc.getRow()][loc.getCol()].fullCellText() ;
			
		}

		else if (list[0].toLowerCase().equals("clear")) {
			SpreadsheetLocation loc = new SpreadsheetLocation(list[1]);
			spreadsheet[loc.getRow()][loc.getCol()]= new EmptyCell();
		}
		else {
			SpreadsheetLocation loc = new SpreadsheetLocation(list[0]);
			if(list[2].contains("\"")){
				spreadsheet[loc.getRow()][loc.getCol()] = new TextCell(list[2]);
			}
			else if(list[2].contains("%")){
				spreadsheet[loc.getRow()][loc.getCol()] = new PercentCell(list[2]);
			}
			else if(list[2].contains("+")||list[2].contains("-")||list[2].contains("/")||list[2].contains("*")) {
				spreadsheet[loc.getRow()][loc.getCol()] = new FormulaCell(list[2]);
			}
		}
		return getGridText();
		
	}
	@Override
	public int getRows()
	{
		return 20;
	}

	@Override
	public int getCols()
	{
		return 12;
	}

	@Override
	public Cell getCell(Location loc)
	{
		return (spreadsheet[loc.getRow()][loc.getCol()]);
	}

	@Override
	public String getGridText()
	{
		String lineOne= "   ";
		String rest="";
		char col = 'A';
		for (char c='A';c<'M';c++) {
			lineOne+="|"+c+"         ";
		}
		lineOne+="|";
		
		for (int x=0;x<20;x++) {
			if(x<9) {
			rest+= Integer.toString(x+1)+"  |";
			}
			
			else {
			rest+= Integer.toString(x+1)+" |";	
			}
			for (int y=0;y<12;y++) {
				rest+=spreadsheet[x][y].abbreviatedCellText()+"|";
				}
			rest += "\n";
			}
		lineOne+= "\n"+rest;
		
		return lineOne;
	}
}
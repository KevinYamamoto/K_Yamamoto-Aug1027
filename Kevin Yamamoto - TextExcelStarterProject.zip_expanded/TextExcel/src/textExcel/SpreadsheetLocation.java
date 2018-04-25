package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int row;
	private char col;
	public SpreadsheetLocation(String coord) {
		row = Integer.parseInt(coord.substring(1));
		col = (coord.toUpperCase().charAt(0));
	}
    @Override
 // gets row of this location
    public int getRow()
    {
        // TODO Auto-generated method stub
        return row-1;
    }

    @Override
 // gets column of this location
    public int getCol()
    {
        // TODO Auto-generated method stub
        return col-65;
    }
}

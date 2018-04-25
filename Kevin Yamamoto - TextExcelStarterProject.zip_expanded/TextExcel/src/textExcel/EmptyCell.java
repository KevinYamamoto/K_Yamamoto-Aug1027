package textExcel;

public class EmptyCell implements Cell{

	
	// text for spreadsheet cell display, must be exactly length 10
	public EmptyCell() {
	}
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return "          ";
	}

	@Override
	// text for individual cell inspection, not truncated or padded
	public String fullCellText() {
		// TODO Auto-generated method stub
		return "";
	}
	
}

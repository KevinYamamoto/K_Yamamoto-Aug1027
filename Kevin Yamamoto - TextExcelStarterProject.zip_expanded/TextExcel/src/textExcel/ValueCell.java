package textExcel;

public class ValueCell extends RealCell{
	
	
	public ValueCell(String content) {
		super(content);
	}
	public String abbreviatedCellText() {
		String result=getDoubleValue()+"";
		if(result.length()<10) {
		for(int x=result.length();x<10;x++) {
			result+= " ";
		}
	}
	else {
		result = result.substring(0,10);
	}
	return result;
	}
	
	public String fullCellText() {
		
		return super.fullCellText();
	}
	public double getDoubleValue() {
		return Double.parseDouble(getContent());
	}

}

package textExcel;

public class PercentCell extends RealCell{
	public PercentCell(String content) {
		super(content.substring(0, content.length()-1));
	}
	public String abbreviatedCellText() {
		
		String result=(int)getDoubleValue()+"%";
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
		double num = getDoubleValue();
		return num/100+"";
	}
	public double getDoubleValue() {
		return Double.parseDouble(getContent());
	}

}

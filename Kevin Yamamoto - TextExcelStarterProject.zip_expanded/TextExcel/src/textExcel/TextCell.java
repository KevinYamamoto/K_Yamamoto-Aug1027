package textExcel;

public class TextCell implements Cell{
	private String content;
	public TextCell(String content) {
		this.content=content.substring(1, content.length()-1);
	}
	@Override
	public String abbreviatedCellText() {
		String result=content;
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

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return "\""+content+"\"";
	}
}
package textExcel;

public class RealCell implements Cell{
	private String content;

	public RealCell(String content) {
		this.content=content;
	}
	@Override
	public String abbreviatedCellText() {
		
		return null;
	}

	@Override
	public String fullCellText() {
		
		return content;
	}
	public double getDoubleValue() {
		return Double.parseDouble(content);
	}
	public String getContent() {
		return content;
	}
}

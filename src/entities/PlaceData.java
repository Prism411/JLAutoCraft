package entities;

public class PlaceData {
	private int toPlaceNumber;
	private String toPlaceName;
	private String toName;
	
	public PlaceData(int toPlaceNumber, String toPlaceName, String toName) {
		this.toPlaceNumber = toPlaceNumber;
		this.toPlaceName = toPlaceName;
		this.toName = toName;
	}
	public int getToPlaceNumber() {
		return toPlaceNumber;
	}
	public void setToPlaceNumber(int toPlaceNumber) {
		this.toPlaceNumber = toPlaceNumber;
	}
	public String getToPlaceName() {
		return toPlaceName;
	}
	public void setToPlaceName(String toPlaceName) {
		this.toPlaceName = toPlaceName;
	}
	public String getToName() {
		return toName;
	}
	public void setToName(String toName) {
		this.toName = toName;
	}
	@Override
	public String toString() {
		return "PlaceData [toPlaceNumber=" + toPlaceNumber + ", toPlaceName=" + toPlaceName + ", toName=" + toName
				+ "]";
	}
	
	
	

}

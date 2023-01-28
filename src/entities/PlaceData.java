package entities;

public class PlaceData {
	private PlaceType pT;
	private int toPlaceNumber;
	private String toPlaceName;
	private String toName;
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
	public PlaceType getpT() {
		return pT;
	}
	public void setpT(PlaceType pT) {
		this.pT = pT;
	}
	@Override
	public String toString() {
		return "PlaceData [pT=" + pT + ", toPlaceNumber=" + toPlaceNumber + ", toPlaceName=" + toPlaceName + ", toName="
				+ toName + "]";
	}
	public PlaceData(PlaceType pT, int toPlaceNumber, String toPlaceName, String toName) {
		this.pT = pT;
		this.toPlaceNumber = toPlaceNumber;
		this.toPlaceName = toPlaceName;
		this.toName = toName;
	}
	
	
	

}

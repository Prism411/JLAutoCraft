package entities;

public class Craft {
	private int ManagementNumber;
	private int craftNumber;
	private PlaceType placeType;
	private String toCraftName;
	private String mcName;
	private String mcContact;
	
	private int craftYear;
	public Craft(int managementNumber, int craftType, PlaceType placeType, String toCraftName, String mcName,
			String mcContact, int craftYear) {
		this.ManagementNumber = managementNumber;
		this.craftNumber = craftType;
		this.placeType = placeType;
		this.toCraftName = toCraftName;
		this.mcName = mcName;
		this.mcContact = mcContact;
		this.craftYear = craftYear;
	}
	public int getManagementNumber() {
		return ManagementNumber;
	}
	public void setManagementNumber(int managementNumber) {
		ManagementNumber = managementNumber;
	}
	public int getCraftType() {
		return craftNumber;
	}
	public void setCraftType(int craftType) {
		this.craftNumber = craftType;
	}
	public PlaceType getPlaceType() {
		return placeType;
	}
	public void setPlaceType(PlaceType placeType) {
		this.placeType = placeType;
	}
	public String getToCraftName() {
		return toCraftName;
	}
	public void setToCraftName(String toCraftName) {
		this.toCraftName = toCraftName;
	}
	public String getMcName() {
		return mcName;
	}
	public void setMcName(String mcName) {
		this.mcName = mcName;
	}
	public String getMcContact() {
		return mcContact;
	}
	public void setMcContact(String mcContact) {
		this.mcContact = mcContact;
	}
	public int getCraftYear() {
		return craftYear;
	}
	public void setCraftYear(int craftYear) {
		this.craftYear = craftYear;
	}
	
	
	

}

package entities;
@SuppressWarnings("unused")
public class Craft {

	
	//MUDAM SEMPRE!!!
	private PlaceType toplaceType; //tipo para quem é endereçado	
	private String toCraftName; //Nome para quem será enviado (MC/TIO/PRIMA)
	private String toPlaceName;  //Lugar ORGANIZAÇÃO QUE SERÁ ENVIADO (CAPITULO ETC..) + numero
	private int toPlaceNumber;
	private int craftNumber; //Numero do Oficio
	private String Reason;    // Assunto
	private String meetingTime;  //Horario de chegada 
	private String craftDate; //data do oficio
	
	//muda as VEZES
	private String Adress; //Endereço da Reuniao
	private String sponsorShop; //nome da loja patrocinadora do local + numero

	
	//Mudam a cada 6 meses (ou nunca mudam!!!) INSIDE INFO
	private int ManagementNumber; //Numero da gestão
	private String pccName;  //nome do presidente do conselho Consultivo
	private String escrvName; //Nome do Escrivão
	private String mcName; //Nome do Mestre Conselheiro
	private String mcContact; //contato do mestre Conselheiro
	private String fromChapterName; //nome do capitulo que sera enviado
	private int craftYear; //ano do Oficio
	

	

	
	public int getManagementNumber() {
		return ManagementNumber;
	}
	public void setManagementNumber(int managementNumber) {
		ManagementNumber = managementNumber;
	}
	public int getCraftNumber() {
		return craftNumber;
	}
	public void setCraftNumber(int craftNumber) {
		this.craftNumber = craftNumber;
	}
	public int getCraftYear() {
		return craftYear;
	}
	public void setCraftYear(int craftYear) {
		this.craftYear = craftYear;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
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
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public String getMeetingTime() {
		return meetingTime;
	}
	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}
	public String getPccName() {
		return pccName;
	}
	public void setPccName(String pccName) {
		this.pccName = pccName;
	}
	public String getEscrvName() {
		return escrvName;
	}
	public void setEscrvName(String escrvName) {
		this.escrvName = escrvName;
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
	public String getFromPlacename() {
		return fromPlacename;
	}
	public void setFromPlacename(String fromPlacename) {
		this.fromPlacename = fromPlacename;
	}
	public String getCraftDate() {
		return craftDate;
	}
	public void setCraftDate(String craftDate) {
		this.craftDate = craftDate;
	}
	

	public Craft(int managementNumber, int craftNumber, int craftYear, String adress, PlaceType placeType,
			String toCraftName, String placeName, String reason, String meetingTime, String pccName, String escrvName,
			String mcName, String mcContact, String fromPlacename, String CraftDate) {
		this.ManagementNumber = managementNumber;
		this.craftNumber = craftNumber;
		this.craftYear = craftYear;
		this.Adress = adress;
		this.placeType = placeType;
		this.toCraftName = toCraftName;
		this.placeName = placeName;
		this.Reason = reason;
		this.meetingTime = meetingTime;
		this.pccName = pccName;
		this.escrvName = escrvName;
		this.mcName = mcName;
		this.mcContact = mcContact;
		this.fromPlacename = fromPlacename;
		this.craftDate = CraftDate;
	}
	
	
	
	
	

}

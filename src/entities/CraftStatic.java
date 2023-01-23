package entities;
@SuppressWarnings("unused")
public class CraftStatic {
	
	//Mudam a cada 6 meses (ou nunca mudam!!!) INSIDE INFO

	private int ManagementNumber; //Numero da gestão
	private String pccName;  //nome do presidente do conselho Consultivo
	private String escrvName; //Nome do Escrivão
	private String mcName; //Nome do Mestre Conselheiro
	private String mcContact; //contato do mestre Conselheiro
	private String fromChapterName; //nome do capitulo do usuario
	private String fromChapterNumber; //numero do capitulo do usuario
	
	public CraftStatic(int managementNumber, String pccName, String escrvName, String mcName,
			String mcContact, String fromChapterName, String fromChapterNumber) {
		this.ManagementNumber = managementNumber;
		this.pccName = pccName;
		this.escrvName = escrvName;
		this.mcName = mcName;
		this.mcContact = mcContact;
		this.fromChapterName = fromChapterName;
		this.fromChapterNumber = fromChapterNumber;
	}
	public int getManagementNumber() {
		return ManagementNumber;
	}
	public void setManagementNumber(int managementNumber) {
		ManagementNumber = managementNumber;
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
	public String getFromChapterName() {
		return fromChapterName;
	}
	public void setFromChapterName(String fromChapterName) {
		this.fromChapterName = fromChapterName;
	}
	public String getFromChapterNumber() {
		return fromChapterNumber;
	}
	public void setFromChapterNumber(String fromChapterNumber) {
		this.fromChapterNumber = fromChapterNumber;
	}
	@Override
	public String toString() {
		return "CraftStatic [ManagementNumber=" + ManagementNumber +", pccName=" + pccName
				+ ", escrvName=" + escrvName + ", mcName=" + mcName + ", mcContact=" + mcContact + ", fromChapterName="
				+ fromChapterName + ", fromChapterNumber=" + fromChapterNumber + "]";
	}
	
	
	
	
	
	

}

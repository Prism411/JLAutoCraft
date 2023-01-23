package entities;
@SuppressWarnings("unused")
public class craftAdress {
	
	private String Adress; //Endereço da Reuniao
	private String sponsorShop; //nome da loja patrocinadora do local
	private int SponsorShopNumber; //numero da loja patrocinadora 
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getSponsorShop() {
		return sponsorShop;
	}
	public void setSponsorShop(String sponsorShop) {
		this.sponsorShop = sponsorShop;
	}
	public int getSponsorShopNumber() {
		return SponsorShopNumber;
	}
	public void setSponsorShopNumber(int sponsorShopNumber) {
		SponsorShopNumber = sponsorShopNumber;
	}
	public craftAdress(String adress, String sponsorShop, int sponsorShopNumber) {
		this.Adress = adress;
		this.sponsorShop = sponsorShop;
		this.SponsorShopNumber = sponsorShopNumber;
	}
	@Override
	public String toString() {
		return "craftAdress [Adress=" + Adress + ", sponsorShop=" + sponsorShop + ", SponsorShopNumber="
				+ SponsorShopNumber + "]";
	}
	
	

}

package entities;

import java.text.SimpleDateFormat;

@SuppressWarnings("unused")
public class CraftAuto {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private int craftNumber; //Numero do Oficio
	private String craftDate; //dia que o oficio é criado
	private String craftYear; //ano que o oficio é criado
	private String craftMonth; //mes que o oficio é criado
	
	public CraftAuto(SimpleDateFormat sdf, int craftNumber, String craftDate, String craftYear, String craftMonth) {
		this.sdf = sdf;
		this.craftNumber = craftNumber;
		this.craftDate = craftDate;
		this.craftYear = craftYear;
		this.craftMonth = craftMonth;
	}
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	public int getCraftNumber() {
		return craftNumber;
	}
	public void setCraftNumber(int craftNumber) {
		this.craftNumber = craftNumber;
	}
	public String getCraftDate() {
		return craftDate;
	}
	public void setCraftDate(String craftDate) {
		this.craftDate = craftDate;
	}
	public String getCraftYear() {
		return craftYear;
	}
	public void setCraftYear(String craftYear) {
		this.craftYear = craftYear;
	}
	public String getCraftMonth() {
		return craftMonth;
	}
	public void setCraftMonth(String craftMonth) {
		this.craftMonth = craftMonth;
	}

}

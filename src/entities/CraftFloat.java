package entities;

import java.io.IOException;

import services.CraftCreator;
import services.Loader;
import services.Reader;

@SuppressWarnings("unused")
public class CraftFloat {
	
	private PlaceType toplaceType; //tipo para quem é endereçado	
	private int toPlaceNumber; //numero do lugar loja bethel etc...
	private String toName; //Nome para quem será enviado (MC/TIO/PRIMA)
	private String toPlaceName;  //Lugar ORGANIZAÇÃO QUE SERÁ ENVIADO (CAPITULO ETC..)
	private String Reason;    // Assunto
	private String meetingTime;  //Horario de chegada 
	private String dayCraft; //dia que será realizado
	private String monthCraft; //mes que será realizado
	public CraftFloat(PlaceType toplaceType, int toPlaceNumber, String toName, String toPlaceName, String reason,
			String meetingTime, String dayCraft, String monthCraft) {

		this.toplaceType = toplaceType;
		this.toPlaceNumber = toPlaceNumber;
		this.toName = toName;
		this.toPlaceName = toPlaceName;
		this.Reason = reason;
		this.meetingTime = meetingTime;
		this.dayCraft = dayCraft;
		this.monthCraft = monthCraft;
	}
	public PlaceType getToplaceType() {
		return toplaceType;
	}
	public void setToplaceType(PlaceType toplaceType) {
		this.toplaceType = toplaceType;
	}
	public int getToPlaceNumber() {
		return toPlaceNumber;
	}
	public void setToPlaceNumber(int toPlaceNumber) {
		this.toPlaceNumber = toPlaceNumber;
	}
	public String getToName() {
		return toName;
	}
	public void setToName(String toName) {
		this.toName = toName;
	}
	public String getToPlaceName() {
		return toPlaceName;
	}
	public void setToPlaceName(String toPlaceName) {
		this.toPlaceName = toPlaceName;
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
	public String getDayCraft() {
		return dayCraft;
	}
	public void setDayCraft(String dayCraft) {
		this.dayCraft = dayCraft;
	}
	public String getMonthCraft() {
		return monthCraft;
	}
	public void setMonthCraft(String monthCraft) {
		this.monthCraft = monthCraft;
	}
	

	
	

}

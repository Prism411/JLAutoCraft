package gui.Controllers;

public class LoopCreatorController {
	
	private static String toName = "",toPlaceName= "",reason= "",meetingTime= "",dayCraft= "",monthCraft= "";
	private static int toPlaceNumber = 0;
	public String getToName() {
		return toName;
	}
	public void setToName(String toName) {
		LoopCreatorController.toName = toName;
	}
	public String getToPlaceName() {
		return toPlaceName;
	}
	public void setToPlaceName(String toPlaceName) {
		LoopCreatorController.toPlaceName = toPlaceName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		LoopCreatorController.reason = reason;
	}
	public String getMeetingTime() {
		return meetingTime;
	}
	public void setMeetingTime(String meetingTime) {
		LoopCreatorController.meetingTime = meetingTime;
	}
	public String getDayCraft() {
		return dayCraft;
	}
	public void setDayCraft(String dayCraft) {
		LoopCreatorController.dayCraft = dayCraft;
	}
	public String getMonthCraft() {
		return monthCraft;
	}
	public void setMonthCraft(String monthCraft) {
		LoopCreatorController.monthCraft = monthCraft;
	}
	public int getToPlaceNumber() {
		return toPlaceNumber;
	}
	public void setToPlaceNumber(int toPlaceNumber) {
		LoopCreatorController.toPlaceNumber = toPlaceNumber;
	}
	public LoopCreatorController(String toName, String toPlaceName, String reason, String meetingTime, String dayCraft,
			String monthCraft, int toPlaceNumber) {
		LoopCreatorController.toName = toName;
		LoopCreatorController.toPlaceName = toPlaceName;
		LoopCreatorController.reason = reason;
		LoopCreatorController.meetingTime = meetingTime;
		LoopCreatorController.dayCraft = dayCraft;
		LoopCreatorController.monthCraft = monthCraft;
		LoopCreatorController.toPlaceNumber = toPlaceNumber;
	}
	

}

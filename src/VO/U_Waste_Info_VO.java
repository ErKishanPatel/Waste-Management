package VO;
import java.io.Serializable;
public class U_Waste_Info_VO implements Serializable {
	private int wasteId;
	private String wasteInfo;
	private String wasteDes;
	private Area_VO ar;
	public int getWasteId() {
		return wasteId;
	}
	public void setWasteId(int wasteId) {
		this.wasteId = wasteId;
	}
	public String getWasteInfo() {
		return wasteInfo;
	}
	public void setWasteInfo(String wasteInfo) {
		this.wasteInfo = wasteInfo;
	}
	public String getWasteDes() {
		return wasteDes;
	}
	public void setWasteDes(String wasteDes) {
		this.wasteDes = wasteDes;
	}
	public Area_VO getAr() {
		return ar;
	}
	public void setAr(Area_VO ar) {
		this.ar = ar;
	}
	
}

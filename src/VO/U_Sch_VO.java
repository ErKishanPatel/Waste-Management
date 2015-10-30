package VO;

import java.io.Serializable;

public class U_Sch_VO implements Serializable{
	private  int scId;
	private Street_VO street;
	private Schedule_VO sch;
	public int getScId() {
		return scId;
	}
	public void setScId(int scId) {
		this.scId = scId;
	}
	public Street_VO getStreet() {
		return street;
	}
	public void setStreet(Street_VO street) {
		this.street = street;
	}
	public Schedule_VO getSch() {
		return sch;
	}
	public void setSch(Schedule_VO sch) {
		this.sch = sch;
	}
	

}

package VO;

import java.io.Serializable;

public class C_Assign_Area_VO implements Serializable {
	private int assignaId;
	private String vanNo;	
	private Area_VO lm;
	private C_Staff_VO stf;
	public int getAssignaId() {
		return assignaId;
	}
	public void setAssignaId(int assignaId) {
		this.assignaId = assignaId;
	}
	public String getVanNo() {
		return vanNo;
	}
	public void setVanNo(String vanNo) {
		this.vanNo = vanNo;
	}
	public Area_VO getLm() {
		return lm;
	}
	public void setLm(Area_VO lm) {
		this.lm = lm;
	}
	public C_Staff_VO getStf() {
		return stf;
	}
	public void setStf(C_Staff_VO stf) {
		this.stf = stf;
	}
	
}

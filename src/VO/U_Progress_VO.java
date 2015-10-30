package VO;

import java.io.Serializable;

public class U_Progress_VO implements Serializable {
	private  int prId;
	private Area_VO area;
	public int getPrId() {
		return prId;
	}
	public void setPrId(int prId) {
		this.prId = prId;
	}
	public Area_VO getArea() {
		return area;
	}
	public void setArea(Area_VO area) {
		this.area = area;
	}
	
	

}

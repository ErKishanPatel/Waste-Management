package VO;
import java.io.Serializable;
public class U_Garbage_allocate_VO implements Serializable {
	private int allocationId;
	
	private String Des;
	private Area_VO ar;
	public int getAllocationId() {
		return allocationId;
	}
	public void setAllocationId(int allocationId) {
		this.allocationId = allocationId;
	}
	public String getDes() {
		return Des;
	}
	public void setDes(String des) {
		Des = des;
	}
	public Area_VO getAr() {
		return ar;
	}
	public void setAr(Area_VO ar) {
		this.ar = ar;
	}
	
}

package VO;
import java.io.Serializable;

public class Dust_VO implements Serializable {
	private int dustId;
	private String dustNo;
	private String dustName;
	public int getDustId() {
		return dustId;
	}
	public void setDustId(int dustId) {
		this.dustId = dustId;
	}
	public String getDustNo() {
		return dustNo;
	}
	public void setDustNo(String dustNo) {
		this.dustNo = dustNo;
	}
	public String getDustName() {
		return dustName;
	}
	public void setDustName(String dustName) {
		this.dustName = dustName;
	}
	
}
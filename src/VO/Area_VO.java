package VO;
import java.io.Serializable;

public class Area_VO implements Serializable {
	private int areaId;
	private String areaName;
	private String areaDes;
	private Zone_VO mc;
	private Ward_VO jh;
	
	
	public Zone_VO getMc() {
		return mc;
	}
	public void setMc(Zone_VO mc) {
		this.mc = mc;
	}
	public Ward_VO getJh() {
		return jh;
	}
	public void setJh(Ward_VO jh) {
		this.jh = jh;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getAreaDes() {
		return areaDes;
	}
	public void setAreaDes(String areaDes) {
		this.areaDes = areaDes;
	}

}

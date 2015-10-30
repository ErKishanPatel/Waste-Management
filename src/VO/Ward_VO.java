package VO;
import java.io.Serializable;
public class Ward_VO implements Serializable {
	private int wardId;
	private String wardName;
	private String wardDes;
	private Zone_VO mc;
	
	public Zone_VO getMc() {
		return mc;
	}
	public void setMc(Zone_VO mc) {
		this.mc = mc;
	}
	public int getWardId() {
		return wardId;
	}
	public void setWardId(int wardId) {
		this.wardId = wardId;
	}
	public String getWardName() {
		return wardName;
	}
	public void setWardName(String wardName) {
		this.wardName = wardName;
	}
	public String getWardDes() {
		return wardDes;
	}
	public void setWardDes(String wardDes) {
		this.wardDes = wardDes;
	}

}

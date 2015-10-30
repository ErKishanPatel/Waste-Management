package VO;
import java.io.Serializable;

public class Street_VO implements Serializable {
	private int StreetId;
	private String streetName;
	private String streetDes;
	private Zone_VO mc;
	private Ward_VO jh;
	private Area_VO lm;
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
	public Area_VO getLm() {
		return lm;
	}
	public void setLm(Area_VO lm) {
		this.lm = lm;
	}
	public int getStreetId() {
		return StreetId;
	}
	public void setStreetId(int streetId) {
		this.StreetId = streetId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getStreetDes() {
		return streetDes;
	}
	public void setStreetDes(String streetDes) {
		this.streetDes = streetDes;
	}
	

}

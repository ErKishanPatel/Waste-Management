package VO;
import java.io.Serializable;

public class Noti_VO implements Serializable {
	private int notiId;
	private String module;
	private String notiDes;
	public int getNotiId() {
		return notiId;
	}
	public void setNotiId(int notiId) {
		this.notiId = notiId;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getNotiDes() {
		return notiDes;
	}
	public void setNotiDes(String notiDes) {
		this.notiDes = notiDes;
	}
	
}
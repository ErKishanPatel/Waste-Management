package VO;
import java.io.Serializable;

public class U_Reg_VO implements Serializable{
	private int uId;
	private String fname;
	private String lname;
	private String ad;
	private String city;	
	private Long c_no;	
	private LoginVO login;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getC_no() {
		return c_no;
	}
	public void setC_no(long c_no2) {
		this.c_no = c_no2;
	}
	public LoginVO getLogin() {
		return login;
	}
	public void setLogin(LoginVO login) {
		this.login = login;
	}
	
}
	
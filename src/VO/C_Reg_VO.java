package VO;
import java.io.Serializable;

  public class C_Reg_VO implements Serializable {

	private int companyId;
	private String companyName;
	private String ad;
	private String city;
	private int pin;
	private int c_contact;
	private int p_contact;
	
	private String reg_no;
	private LoginVO login;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getC_contact() {
		return c_contact;
	}
	public void setC_contact(int c_contact) {
		this.c_contact = c_contact;
	}
	public int getP_contact() {
		return p_contact;
	}
	public void setP_contact(int p_contact) {
		this.p_contact = p_contact;
	}
	public String getReg_no() {
		return reg_no;
	}
	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}
	public LoginVO getLogin() {
		return login;
	}
	public void setLogin(LoginVO login) {
		this.login = login;
	}
	
  }
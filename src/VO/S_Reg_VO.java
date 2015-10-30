package VO;
import java.io.Serializable;
public class S_Reg_VO implements Serializable {
	 private int govt_staffId;
		private String deptName;		
		private String post;
		private String e_name;
		private String ad;		
		private long c_contact;		
		private String reg_no;
		private LoginVO login;
		public int getGovt_staffId() {
			return govt_staffId;
		}
		public void setGovt_staffId(int govt_staffId) {
			this.govt_staffId = govt_staffId;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public String getPost() {
			return post;
		}
		public void setPost(String post) {
			this.post = post;
		}
		public String getE_name() {
			return e_name;
		}
		public void setE_name(String e_name) {
			this.e_name = e_name;
		}
		public String getAd() {
			return ad;
		}
		public void setAd(String ad) {
			this.ad = ad;
		}
		public long getC_contact() {
			return c_contact;
		}
		public void setC_contact(long c_contact) {
			this.c_contact = c_contact;
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

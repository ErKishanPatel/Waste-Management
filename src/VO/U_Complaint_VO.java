package VO;

import java.io.Serializable;

public class U_Complaint_VO implements Serializable{
	
	private int compId;
	private String complaint;
	private String complaintDes;
	public LoginVO login;
	public LoginVO getLogin() {
		return login;
	}
	public void setLogin(LoginVO login) {
		this.login = login;
	}
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	public String getComplaintDes() {
		return complaintDes;
	}
	public void setComplaintDes(String complaintDes) {
		this.complaintDes = complaintDes;
	}
}


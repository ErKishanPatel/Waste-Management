package VO;

import java.io.Serializable;

import controller.U_Wsate_Info_Controller;

public class AttachmentMappingVO implements Serializable {
	private int attachmentMappingID;
	private String attachmentName;
	private String path;
	private C_Reg_VO c_reg;
	private U_Waste_Info_VO u_waste;
	public int getAttachmentMappingID() {
		return attachmentMappingID;
	}
	public void setAttachmentMappingID(int attachmentMappingID) {
		this.attachmentMappingID = attachmentMappingID;
	}
	public String getAttachmentName() {
		return attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public C_Reg_VO getC_reg() {
		return c_reg;
	}
	public void setC_reg(C_Reg_VO c_reg) {
		this.c_reg = c_reg;
	}
	public U_Waste_Info_VO getU_waste() {
		return u_waste;
	}
	public void setU_waste(U_Waste_Info_VO u_waste) {
		this.u_waste = u_waste;
	}

	
	
}

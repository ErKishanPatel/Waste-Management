package VO;

import java.io.Serializable;

public class Subcat_VO implements Serializable{
	private int subcatId;
	private String subcatName;
	private String subcatDes;
	private Category_VO mc;
	
	
	public Category_VO getMc() {
		return mc;
	}
	public void setMc(Category_VO mc) {
		this.mc = mc;
	}
	public int getSubcatId() {
		return subcatId;
	}
	public void setSubcatId(int subcatId) {
		this.subcatId = subcatId;
	}
	public String getSubcatName() {
		return subcatName;
	}
	public void setSubcatName(String subcatName) {
		this.subcatName = subcatName;
	}
	public String getSubcatDes() {
		return subcatDes;
	}
	public void setSubcatDes(String subcatDes) {
		this.subcatDes = subcatDes;
	}

}

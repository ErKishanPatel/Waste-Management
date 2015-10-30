package VO;

import java.io.Serializable;

public class Road_Side_Unit_VO implements Serializable {
	private int roadId;
	private double longi;
	private double lati;
	private Zone_VO mc;
	private Ward_VO jh;
	private Area_VO lm;
	private Street_VO st;
	private Dust_VO dt;
	public int getRoadId() {
		return roadId;
	}
	public void setRoadId(int roadId) {
		this.roadId = roadId;
	}
	public double getLongi() {
		return longi;
	}
	public void setLongi(double longi) {
		this.longi = longi;
	}
	public double getLati() {
		return lati;
	}
	public void setLati(double lati) {
		this.lati = lati;
	}
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
	public Street_VO getSt() {
		return st;
	}
	public void setSt(Street_VO st) {
		this.st = st;
	}
	public Dust_VO getDt() {
		return dt;
	}
	public void setDt(Dust_VO dt) {
		this.dt = dt;
	}
	
	
	
	
	
}
package VO;
import java.io.Serializable;

public class Schedule_VO implements Serializable {
	private int scheduleId;
	private String scheduleName;
	private String scheduleDes;
	private Street_VO mc;
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getScheduleName() {
		return scheduleName;
	}
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	public String getScheduleDes() {
		return scheduleDes;
	}
	public void setScheduleDes(String scheduleDes) {
		this.scheduleDes = scheduleDes;
	}
	public Street_VO getMc() {
		return mc;
	}
	public void setMc(Street_VO mc) {
		this.mc = mc;
	}
}

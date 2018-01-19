package tk.mybatis.springboot.model;

import java.util.Date;

import tk.mybatis.springboot.util.DateUtils;


public class DateFormat extends DAppointment{
	private String newuptime;
	private String newbacktime;
	public String getNewuptime() {
		return newuptime;
	}
	public void setNewuptime(Date uptime) {
		this.newuptime = DateUtils.DataToString(uptime);
	}
	public String getNewbacktime() {
		return newbacktime;
	}
	public void setNewbacktime(Date backtime) {
		this.newbacktime = DateUtils.DataToString(backtime);
	}
	 
	
	 
	
	 

}

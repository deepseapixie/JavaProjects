package chatroom;

public class Time {
	private int hour;
	private int minute;
	
	public Time(int hour, int minute){		
		this.hour = hour;
		this.minute = minute;
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public String toString(){
		String time = "";
		
		if (hour <= 9){
			time = time + "0" + hour;
		}
		else {
			time = time + hour;
		}
		
		if (minute <= 9){
			time = time + "0" + minute;
		}
		else {
			time = time + minute;
		}
		
		return time;
	}
}

package chatroom;

public class Representative {
	private String name;
	private String caller;
	
	public Representative(String name) {
		this.setName(name);
	}
	
	public void AddCaller(String name){
		setCaller(name);
	}

	public String getCaller() {
		return caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package entities;

import java.util.Date;

public class Campaign {

	private int id;
	private String name;
	private Date time;

	public Campaign() {

	}

	public Campaign(int id, String name, Date time) {

		this.id = id;
		this.name = name;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getTime() {
		return time;
	}
	

}

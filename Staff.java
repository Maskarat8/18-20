package conko1;

import java.util.Date;

public class Staff extends Employee{
	private String title;

	public Staff(
			String name, 
			String adress, 
			String phoneNumber, 
			String email,
			String office,
			double salary,
			String title) {
		super(name, 
			adress, 
			phoneNumber, 
			email,
			office,
			salary);
		this.title = title;
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return super.toString() +
				"\n" + "Title: " + title;
	}
	
}

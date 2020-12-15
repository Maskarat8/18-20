package conko1;

public class Student extends Person {
	
	public static final int FRESHMAN = 9;
	public static final int SOPHMORE = 10;
	public static final int JUNIOR = 11;
	public static final int SENIOR = 12;
	
	private int classStatus;

	public int getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(int classStatus) {
		this.classStatus = classStatus;
	}
	
	
	
	public Student( String name, String adress, String phoneNumber, String email, int classStatus) {
		super( name,  adress,  phoneNumber,  email);
		this.classStatus = classStatus;
	}
	
	public String toString() {
		return super.toString() + "\n" + "Class Status: " + classStatus;
	}
	
}

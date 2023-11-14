
public class Patient {

	private String name;
	private int age;
	private String gender;
	private String phoneNumber;
	private String date;
	
	public Patient(String name, int age, String gender, String phoneNumber, String date) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phoneNumber=phoneNumber;
		this.date=date;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	public String getDate() {
		return date;
	}
	
	public String toString() {
		return "<html>Name:		"+name+"<br /><br/> Age:		"+age+"<br/><br/>Gender:		"+gender+
				"<br /><br/>Phone Number:		"+phoneNumber+"<br/><br/>Date of visit:		<html>"+date;
	}
}

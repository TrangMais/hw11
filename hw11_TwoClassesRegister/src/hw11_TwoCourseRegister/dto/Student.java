package hw11_TwoCourseRegister.dto;

// Data Transfer Object
public class Student {
	// access modifier public/private/protected/default
	public String name;
	public String phone;
	public String dateOfBirth;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	public Student(String name, String phone, String dateOfBirth) {
		super();
		this.name = name;
		this.phone = phone;
		this.dateOfBirth = dateOfBirth;
	}
	
}

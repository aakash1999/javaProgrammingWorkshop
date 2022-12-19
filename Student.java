package student;

public class Student {
	
	private String name;
	private String dob;
	private String rollNo;
	private String classNumber;
	private String phoneNumber;
	private String address;
	
	//Constructor(default constructor)
	public Student() {
		System.out.println("I am a default constructor");
	}
	
	public Student(String name, String dob, String rollNo, String classNumber, String phoneNumber, String address) {
		this.name = name;
		this.dob = dob;
		this.rollNo = rollNo;
		this.classNumber = classNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
	}
	
	
	void study(String subject) {
		System.out.println("The student " + this.name + " is studying " + subject);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}

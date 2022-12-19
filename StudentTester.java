package student;

public class StudentTester {

	public static void main(String[] args) {
		
		Student student1 = new Student(); //ctrl + F11
//		student1.name = "Aakash";
//		student1.dob = "27-01-1999";
//		student1.classNumber = "02";
//		student1.phoneNumber = "919239123";
//		student1.address = "Goa";
//		student1.rollNo = "12123";
		
//		System.out.println(student1.name);
//		System.out.println(student1.address);
		
		student1.study("Java");
		
		Student student2 = new Student("Vicky", "12-10-1980", "112345", "5", "909032", "Kolkata");
//		System.out.println("The name of the student is : " + student2.name);
		System.out.println(student2.getName());
		student2.setName("Messi");
		System.out.println(student2.getName());
		student2.study("Maths");
		
		
	}

}

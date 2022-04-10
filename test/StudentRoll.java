package test;

public class StudentRoll {

	String name;
	int rollNo;
	
	static int counter=0;

	public StudentRoll(String name) {
	    this.name = name;
		this.rollNo = SetRollNo();
	}
	
	static int SetRollNo() {
		counter++;
		return counter;
	}
	
	void displayStudentData() {
		
		System.out.println("Student Name : "+ this.name);
		System.out.println("Student Roll No : "+this.rollNo);
		
		
	}
	
	
	
	
}

	
	

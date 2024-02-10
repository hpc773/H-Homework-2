package homework_2;

public class Homework_2 {

	public static void main(String[] args) {
		System.out.println("hello test");
		
		Student student1 = new Student(1, "Skylar", 4);
		
		StudentManager teacher = new StudentManager();
		
		teacher.addStudent(student1);
		teacher.searchStudentByID(1);
		
	
	}

}

package homework_2;
import java.util.Scanner;

public class Homework_2 {

	public static void main(String[] args) {
		//System.out.println("hello test");
		StudentManager studentManager = new StudentManager();
		boolean fileReadStatus = studentManager.readFromFile("files/studentData.txt"); 
		System.out.println(fileReadStatus);
		//studentManager.printStudentArray();
		
		Student student1 = new Student(3, "Skylar", 4);
		
		StudentManager teacher = new StudentManager();
		
		teacher.addStudent(student1);
		teacher.searchStudentByID(3);
		teacher.updateStudentGradeById(3, 3);
		teacher.searchStudentByID(3);
		
	
	}

}

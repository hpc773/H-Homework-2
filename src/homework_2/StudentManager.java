package homework_2;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StudentManager {
	private Student[] students = new Student[5];
	public boolean addStudent(Student stu) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = stu;
				return true;
			}
		}
		return false;
	}
	
	//fileReader
	public boolean readFromFile(String fileName) {
	try {
		Scanner fileIn = new Scanner(new FileInputStream(fileName));
		
		while(fileIn.hasNextLine()) {
			int id = fileIn.nextInt();
			String fName = fileIn.next();
			String lName = fileIn.next();
			String name = fName + " " + lName;
			double grade = fileIn.nextDouble();
			Student stu = new Student(id, name, grade);
			
			addStudent(stu);
			//System.out.println(stu.toString());
			fileIn.nextLine();
			
			}
		return true;
			
			}
	catch(FileNotFoundException e) {
		e.printStackTrace();
		return false;
			
		}
	
		}
		
	
	public void printStudentArray() {
		for(Student student : students) {
			if(student != null) {
				System.out.println(student);
			}
		}
	}
	}


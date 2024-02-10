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
	
	public void displayStudents() { 
		int check = 0; 
		//Loop iterates through students toStringing each one 
		for (Student student : students) {
			if (student != null){
				
				toString();
				check++;
			}
			// if the loop runs once and finds check to equal 0 then there are no students in the array.
			else if (check ==0){
				System.out.println(" There are no students in the Student array");
			}
		}
		
		
	}
	
	
	public boolean searchStudentByID(int id) {
		int i = 0;	
		while(students[i]!=null) { //iiterates through students array
				if(students[i].getId() == id && students[i]!= null) { //checks to see if current element is equal to passed in id
					System.out.println(students[i].toString()); // if yes display details
					return true;
				}
				i++;
			}
		
		return false; //if no return false

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

	


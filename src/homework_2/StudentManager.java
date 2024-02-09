package homework_2;

public class StudentManager {
	
	private Student[] students;
	
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
		if(students != null) {
			for(int i = 0;i < students.length;i++) { //iterates through student array
				if(students[i].getId() == id) { //checks to see if current element is equal to passed in id
					System.out.println(students[i].toString()); // if yes display details
					return true;
				}
			}
		}
		return false; //if no return false

	}

}

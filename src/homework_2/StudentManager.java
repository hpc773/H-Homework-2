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

}

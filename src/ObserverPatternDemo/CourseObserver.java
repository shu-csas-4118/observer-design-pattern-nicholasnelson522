package ObserverPatternDemo;
import java.util.ArrayList;

public class CourseObserver implements IObserver
 {
	
	public IdNumberObserver() 
	{
		
	}
	public void update(Student student) 
	
		System.out.println("The Students courses are: " + student.getIdNumber());
		printCourses(student.getCourses());
	}
	public void printCourses(ArrayList<Course> courses)
	{
		for (Course c: courses)
		{
			printCourseDetails(c);
		}
	}
	public void printCourseDetails(Course course) 
	{
	
		System.out.println("Course name: " + course.getName());
		System.out.println("Course number: " + course.getNumber());
		System.out.println("Credits: " + course.getCredits());
		System.out.print("Professor: " + course.getProfessor());
		
	}
	

}

package ObserverPatternDemo;

public class ObserverPatternDemo
 {

	public static void main(String[] args)
	 {
		//First we must create a student and some courses to be used in testing the Observers. 
		
		Student student = new Student("Nicholas", "Nelson", 123456, "nelsonni@shu.edu");
		
		Course c1 = new Course ("Intro Into Program Design I", 1114, 3, "Marco Morazan");
		Course c2 = new Course ("Intro Into Program Design II", 1115, 3, "Marco Morazan");
		Course c3 = new Course ("Software Engineering I", 4117, 3, "Thomas Marlowe");
		Course c4 = new Course ("Software Engineering II", 4118, 3, "Garett Chang");
		
		//Then we need to create our observers.
		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		EmailObserver emailObserver = new EmailObserver();
		CourseObserver courseObserver = new CourseObserver();
		
		//And then attach them to our student. 
		student.attachObserver(idObserver);
		student.attachObserver(firstNameObserver);
		student.attachObserver(emailObserver);
		student.attachObserver(courseObserver);
		
		//Finally we test each of them with the functions for them. 
	    System.out.println("FirstnameObserver only.")
		student.setFirstName("Garrett");
		
		System.out.println("IdObserver only.")
		student.setIdNumber(54321);
		
		System.out.println("EmailObserver only.")
		student.setEmail("nicholas.nelson@student.shu.edu");
		
		System.out.println("CourseObserver only.")
		student.addCourse(c1);
		student.addCourse(c2);
		student.addCourse(c3);
		student.addCourse(c4);
		
		student.removeCourse(c1);
		student.removeCourse(c4);
		
		
	}

}

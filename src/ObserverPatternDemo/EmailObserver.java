package ObserverPatternDemo;

public class EmailObserver implements IObserver
 {
	
	public EmailObserver() 
	{
		
	}
	
	public void update(Student student) 
	
		System.out.println("The student's email is " + student.getEmail());
	}

}

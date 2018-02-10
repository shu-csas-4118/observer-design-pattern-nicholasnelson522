package ObserverPatternDemo;

import java.util.ArrayList;

public class Student 
{
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private ObserverManager observers;
	
	public Student(String firstName, String lastName, int idNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.email = email;
		this.observers = new ObserverManager();
	}
	
	public Student()
	 {
		this.observers = new ObserverManager();
	}
	
	public String getFirstName() 
	{
		return this.firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
		notifyAllObservers("firstname");
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName)
	 {
		this.lastName = lastName;
		notifyAllObservers("lastname");
	}
	
	public int getIdNumber()
	 {
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber)
	 {
		this.idNumber = idNumber;
		notifyAllObservers("idNumber);
	}	
	
	public void setEmail(String email)
	 {
		this.email = email;
		notifyAllObservers("email");
	}
	
	public String getEmail() 
	{
		return this.email;
	}
	
	public ArrayList<Course> getCourse()
	{
		return courses;
	}
	
	public void addCourse(Course c)
	{
		courses.add(c);
		notifyAllObservers("course");
	}
		public void removeCourse(Course c)
	{
		courses.remove(c);
		notifyAllObservers("course");
	}
	
	public void attachObserver(String oType, IObserver observer)
	 {
		this.observers.addIObserver(oType, observer);
	}
	
	public void notifyAllObservers(String oType) 
	{
		for(IObserver observer: this.observers) 
		{
			observers.notifyAllObservers(oType, this);
		}
	}
	
	
}

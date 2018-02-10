package ObserverPattenDemo

public class Course 
{
	private String name; 
	private int number;
	private int credits;
	private String professor; 

public Course(String name, int number, int credits, String professor)
{
	this.setName(name);
	this.setNumber(number);
	this.setCredits(credits);
	this.setProfessor(professor);
}

public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}

public int getNumber()
{
	return number;
}

public void setNumber(int number)
{
	this.number = number;
}

public int getCredits() 
{
	return credits;
}

public void setCredits(int credits) 
{
	this.credits = credits;
}

public String getProfessor() 
{
	return professor;
}

public void setProfessor(String professor) 
{
	this.professor = professor;
}

}
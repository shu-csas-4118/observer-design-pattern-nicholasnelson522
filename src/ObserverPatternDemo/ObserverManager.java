package ObserverPatternDemo;

import java.util.ArrayList;
import java.util.Hashtable;

public class ObserverManager 
{
	private Hashtable<String, ArrayList<IObserver>> observerTable;
	Public ObserverManager()
	{
		Hashtable observerTable = new Hashtable<String, ArrayList<IObserver>>();
	}
	public void addIObserver(String oType, IObserver observer)
	{
		ArrayList<IObserver> types = this.observerTable.get(oType);
		if (types == null)
		{
			types = new ArrayList<>();
		}
		else{}
		
			types.add(observer);
			observerTable.put(oType, 0);
			
	}
	public void notifyAllObservers(String oType, Student student)
	{
		ArrayList<IObserver> types = this.observerTable.get(oType);
		for (IObserver x : types)
		{
			x.update(student);
		}
		
	}
	
}

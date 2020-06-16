import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Hashtable;
class aldi
{
	public String name;
	public aldi (String name)
	{
		this.name = name;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof aldi))
		{
			return super.equals(obj);
		}
		else
		{
			aldi comp = (aldi)obj;
			return comp.hashCode() == obj.hashCode();
		}
	}
}
public class AldhiyaSet 
{

    public static void main (String[] args)
    {
    	HashSet<aldi> set = new HashSet<aldi>();
    	ArrayList<aldi> list = new ArrayList<aldi>();
    	
    	aldi a = new aldi("A");
    	aldi b = new aldi("B");
    	aldi c = new aldi("C");
    	
    	set.add(a);
    	set.add(b);
    	set.add(c);
    	
    	list.add(a);
    	list.add(b);
    	list.add(c);
    	
    	System.out.println("Print List");
    	for(aldi h : list)
    	{
    		System.out.println(h.name);
    	}
    	System.out.println("");
    	System.out.println("Print Set");
    	for(aldi h : set)
    	{
    		System.out.println(h.name);	
    	}
    	System.out.println("");
    	System.out.println("Print Map");
    	for(aldi h : set)
    	{
    		System.out.println(h.name);
    	}
    }
    
    
}
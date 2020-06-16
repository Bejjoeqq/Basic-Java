import java.util.ArrayList;

class human
{
	public String name;
	
	public human(String name)
	{
		this.name = name;
	}
}
public class AldhiyaCollection
{
   public static void main (String[] args) 
   {
ArrayList<human> listbaru = new ArrayList<human>();
   		for(int i=0;i<2;i++)
{
	listbaru.add(new human("human " +i));
}
   		for(int i=0;i<listbaru.size();i++)
   		{System.out.println(listbaru.get(i).name);
   		}
   }
    
}
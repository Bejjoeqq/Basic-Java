import java.util.HashMap;
import java.util.Iterator;
public class AldhiyaMap 
{

    public static void main (String[] args)
    {
    	HashMap<String, String> map = new HashMap<String, String>();
    	
    	map.put("Nama","Aldhiya");
    	map.put("No.Urut","02");
    	map.put("Kelas","XI-RPL");
    	
    	System.out.println("Sebelum Diubah");
    	Iterator<String> ite = map.keySet().iterator();
    	while(ite.hasNext())
    	{
    		System.out.println(map.get(ite.next()));
    	}
    	System.out.println("");
    	System.out.println("Setelah Diubah");
    	map.put("No.Urut","01");
    	map.put("Nama","Aditya");
    	for(String key : map.keySet())
    	{
    		System.out.println(map.get(key));
    	}
    }
    
    
}
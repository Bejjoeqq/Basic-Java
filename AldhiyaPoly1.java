class bangun extends Object
{
	public String toString()
	{
		return "Mempunyai berbgai bentuk";
	}
}
class persegip extends bangun
{
	public  String toString()
	{
		return "Mempunyai sisi panjang & lebar";
	}
}
class balok extends persegip
{
	public  String toString()
	{
		return  "Mempunyai sisi panjang, lebar & tinggi";
	}
}
public class AldhiyaPoly1 
{
    public static void main (String[] args) 
    {
    	System.out.println("Balok---->");
    	cetakobj(new balok());
    	System.out.println("");
    	
    	
    	System.out.println("Persegi Panjang---->");
    	cetakobj(new persegip());
    	System.out.println("");
    	
    	
    	System.out.println("Bangun Datar & Ruang---->");
    	cetakobj(new bangun());
    	System.out.println("");
    }		
	public static void cetakobj(Object obj)
	{
		System.out.println(obj);
	}
}
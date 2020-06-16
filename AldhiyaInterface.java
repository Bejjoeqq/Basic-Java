interface hewan
{
	void makan();
  	void bernafas();
}
class harimau implements hewan
{
	public void makan()
	{
		System.out.println("harimau sedang makan");
	}
	public void bernafas()
	{
		System.out.println("harimau sedang bernafas");
	}
	public void melahirkan()
	{
		System.out.println("harimau sedang melahirkan");
	}
	public void mencengkran()
	{
		System.out.println("harimau sedang mencengkram");
	}
}
class ayam implements hewan
{
	public void makan()
	{
		System.out.println("ayam sedang makan");
	}
	public void bernafas()
	{
		System.out.println("ayam sedang bernafas");
	}
	public void bertelur()
	{
		System.out.println("ayam sedang bertelur");
	}
	public void mematuk()
	{
		System.out.println("ayam sedang mematuk");
	}
}
public class AldhiyaInterface 
{

    public static void main (String[] args) 
    {
    	harimau a = new harimau();
    	a.makan();
    	a.bernafas();
    	a.melahirkan();
    	a.mencengkran();
		System.out.println("");
    	ayam b = new ayam();
    	b.makan();
    	b.bernafas();
    	b.bertelur();
    	b.mematuk();
    	
    }
    
    
}
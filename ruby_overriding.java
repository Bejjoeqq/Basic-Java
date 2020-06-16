class hewan
{
	public void aktivitas()
	{
		System.out.println("");
	}
	public void makan()
	{
		System.out.println("");
	}
}
class ular extends hewan
{
	public void aktivitas()
	{
		System.out.println("Ular sedang melata");
	}
	public void makan()
	{
		System.out.println("Ular sedang menyemprot bisa pada mangsa");
	}
}
class singa extends hewan
{
	public void aktivitas()
	{
		System.out.println("Singa sedang berlari");
	}
	public void makan()
	{
		System.out.println("Singa sedang menerkam mangsanya");
	}
}
class kelinci extends hewan
{
	public void aktivitas()
	{
		System.out.println("Kelinci sedang melompat");
	}
	public void makan()
	{
		System.out.println("Kelinci langsung memakan sayuran");
	}
}
public class ruby_overriding
{
    public static void main (String[] args) 
    {
    	ular ularnya=new ular();
    	ularnya.aktivitas();
    	ularnya.makan();
    	System.out.println ("");
    	
    	singa singanya=new singa();
    	singanya.aktivitas();
    	singanya.makan();
    	System.out.println ("");
    	
    	kelinci kelincinya=new kelinci();
    	kelincinya.aktivitas();
    	kelincinya.makan();

    }
}
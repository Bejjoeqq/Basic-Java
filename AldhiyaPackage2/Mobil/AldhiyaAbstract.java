abstract class makluk
{
	public abstract void berdiri();

    public void carahdp()
   	{
   		System.out.println("Butuh Makanan");
   		System.out.println("Butuh Oksigen");
   		System.out.println("Butuh Air");
   	}	
}
class manusia extends makluk
{
	private String duakaki;
	public manusia(String duakaki)
	{
		this.duakaki = duakaki;
		
	}
	public void berdiri()
	{
		System.out.println("Manusia Berdiri Dengan :"+duakaki);
	}
}

class hewan extends makluk
{
	private String duakaki,empatkaki;
	public hewan(String duakaki,String empatkaki)
	{
		this.duakaki = duakaki;
		this.empatkaki = empatkaki;
		
	}
	public void berdiri()
	{
		System.out.println("Ayam Berdiri Dengan :"+duakaki);
		System.out.println("Kambing Berdiri Dengan :"+empatkaki);
	}
}
class tumbuhan extends makluk
{
	private String akar;
	public tumbuhan(String akar)
	{
		this.akar = akar;
		
	}
	public void berdiri()
	{
		System.out.println("Tumbuhan Berdiri Dengan :"+akar);
	}
}
public class AldhiyaAbstract 
{
	public void cekmakluk(makluk mhidup)
	{
		mhidup.berdiri();
		mhidup.carahdp();
	}
    public static void main (String[] args) 
    {
    	AldhiyaAbstract makluk1 = new AldhiyaAbstract();
    	makluk1.cekmakluk(new manusia ("Dua Kaki"));
    	System.out.println("--------------------------------------");
    	makluk1.cekmakluk(new hewan ("Empat Kaki","Dua Kaki"));
    	System.out.println("--------------------------------------");
    	makluk1.cekmakluk(new tumbuhan ("Akar"));
    		System.out.println("---------------------------------------");
    }    
}
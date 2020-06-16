class mobil
{
	private String merek;
	private String warna;
	private int pintu;
	private String jenis;
	public void tampil()
	{
		System.out.println("Merek Mobil  = "+gmerek());
		System.out.println("Warna Mobil  = "+gwarna());
		System.out.println("Jumlah Pintu = "+gpintu());
		System.out.println("Jenis Mobil  = "+gjenis());
	}
	public void input(String merek, String warna, int pintu, String jenis)
	{
		smerek(merek);
		swarna(warna);
		spintu(pintu);
		sjenis(jenis);
	}
	public String gmerek()
	{
		return merek;
	}
	public void smerek(String m)
	{
		this.merek = m;
	}
	public String gwarna()
	{
		return warna;
	}
	public void swarna(String w)
	{
		this.warna = w;
	}
	public int gpintu()
	{
		return pintu;
	}
	public void spintu(int p)
	{
		this.pintu = p;
	}
	public String gjenis()
	{
		return jenis;
	}
	public void sjenis(String j)
	{
		this.jenis = j;
	}
}
class  toyota extends mobil
{
	public void tampilkan()
	{
		double silinder = 4.0;
		String bbm = "Solar";
		String kategori = "Off-Road";
		
    	mobil m = new mobil();
    	m.input("Avanza","Metalic",4,"Ekonomis");
    	m.tampil();
    	System.out.println("Silinder     = "+silinder);
    	System.out.println("Jenis BBM    = "+bbm);
    	System.out.println("Kategori     = "+kategori);
	}
}
class  honda extends mobil
{
	public void tampilkan()
	{
		double silinder = 4.0;
		String bbm = "Solar";
		String kategori = "Off-Road";
		
    	mobil m = new mobil();
    	m.input("Jazz","Silver",4,"Ekonomis");
    	m.tampil();
    	System.out.println("Silinder     = "+silinder);
    	System.out.println("Jenis BBM    = "+bbm);
    	System.out.println("Kategori     = "+kategori);
	}
}
public class AldhiyaCapsul3 
{
    public static void main (String[] args) 
    {
    	System.out.println("Toyota -->");
    	toyota t = new toyota();
    	t.tampilkan();
    	System.out.println("");
    	System.out.println("Honda -->");
    	honda h = new honda();
    	h.tampilkan();
    }
}
class smotor
{
	private String merek;
	private String warna;
	private String jenis;
	public void tampil()
	{
		System.out.println("Merek Sepeda Motor  = "+gmerek());
		System.out.println("Warna Sepeda Motor  = "+gwarna());
		System.out.println("Jenis Sepeda Motor  = "+gjenis());
	}
	public void input(String merek, String warna, String jenis)
	{
		smerek(merek);
		swarna(warna);
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
	public String gjenis()
	{
		return jenis;
	}
	public void sjenis(String j)
	{
		this.jenis = j;
	}
}
class  kawasaki extends smotor
{
	public void tampilkan()
	{
		double silinder = 4.0;
		String bbm = "Solar";
		String kategori = "Biasa";
		
    	smotor m = new smotor();
    	m.input("Vario","Black","Matic");
    	m.tampil();
    	System.out.println("Silinder            = "+silinder);
    	System.out.println("Jenis BBM           = "+bbm);
    	System.out.println("Kategori            = "+kategori);
	}
}
class  honda extends smotor
{
	public void tampilkan()
	{
		double silinder = 4.0;
		String bbm = "Solar";
		String kategori = "Kopling";
		
    	smotor m = new smotor();
    	m.input("Satria","Silver","Manual");
    	m.tampil();
    	System.out.println("Silinder            = "+silinder);
    	System.out.println("Jenis BBM           = "+bbm);
    	System.out.println("Kategori            = "+kategori);
	}
}
public class AldhiyaCapsul4
{
    public static void main (String[] args) 
    {
    	System.out.println("Honda -->");
    	kawasaki t = new kawasaki();
    	t.tampilkan();
    	System.out.println("");
    	System.out.println("Kawasaki -->");
    	honda h = new honda();
    	h.tampilkan();
    }
}
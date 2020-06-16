abstract class kendaraan
{
	public abstract void berjalan();

    public void cara()
   	{
   		System.out.println("Butuh Minyak");
   		System.out.println("Butuh Roda");
   		System.out.println("Butuh Mesin");
   	}	
}
class mobil extends kendaraan
{
	private String empat;
	public mobil(String empat)
	{
		this.empat = empat;
		
	}
	public void berjalan()
	{
		System.out.println("Mobil Berjalan Dengan :"+empat);
	}
}

class Motor extends kendaraan
{
	private String dua;
	public Motor(String dua)
	{
		this.dua = dua;
		
	}
	public void berjalan()
	{
		System.out.println("Motor Berjalan Dengan :"+dua);
	}
}
class Truk extends kendaraan
{
	private String enam;
	public Truk(String enam)
	{
		this.enam = enam;
		
	}
	public void berjalan()
	{
		System.out.println("Truk Berjalan Dengan :"+enam);
	}
}
public class AldhiyaProjectAbstrack
{
	public void cek(kendaraan k)
	{
		k.berjalan();
		k.cara();
	}
    public static void main (String[] args) 
    {
    	AldhiyaProjectAbstrack a = new AldhiyaProjectAbstrack();
    	a.cek(new mobil ("Empat Roda"));
    	System.out.println("--------------------------------------");
    	a.cek(new Motor ("Dua Roda"));
    	System.out.println("--------------------------------------");
    	a.cek(new Truk ("Enam Roda"));
    }    
}
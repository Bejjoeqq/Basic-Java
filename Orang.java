/**
 * @(#)Orang.java
 *
 *
 * @author 
 * @version 1.00 2017/8/24
 */


public class Orang {
	String nama;
	String namaa;
	int tinggi;
	int tinggii;
	int berat;
	int beratt;
	String warna;
	String warnak;
	String kelamin;
	Boolean kacamata;
	
	void menangis()
	{
			System.out.println("Hik....hik....hik....");
	}
	void tertawa()
	{
			System.out.println("wkwkwkwkwk");
	}
			
 
 }
    
class Objectorang
{
	public static void main (String[] args)  {
		Orang ngan = new Orang();
		ngan.nama = "Duta";
		ngan.namaa = "Aldi";
		ngan.tinggi = 176;
		ngan.tinggii = 165;
		ngan.berat = 56;
		ngan.beratt = 60;
		ngan.warna = "Hitam";
		ngan.warnak = "Coklat";
		ngan.kelamin = "pria";
		ngan.kacamata = true;
		
		System.out.println("Nama = "+ngan.nama);
		System.out.println("Tinggi = "+ngan.tinggi);
		System.out.println("Berat = "+ngan.berat);
		System.out.println("W.Rambut = "+ngan.warna);
		System.out.println("W.Kulit = "+ngan.warnak);
		System.out.println("Berkacamata = "+ngan.kacamata);
		System.out.println("");
		System.out.println("cara tertawa =");
		ngan.tertawa();
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Nama = "+ngan.namaa);
		System.out.println("Tinggi = "+ngan.tinggii);
		System.out.println("Berat = "+ngan.beratt);
		System.out.println("W.Rambut = "+ngan.warna);
		System.out.println("W.Kulit = "+ngan.warnak);
		System.out.println("Berkacamata = "+ngan.kacamata);
		System.out.println("");
		System.out.println("cara menangis =");
		ngan.menangis();
	}
}
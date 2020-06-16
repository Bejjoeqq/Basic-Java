class kendaraan
{
	private String roda;
	private String bahanbakar;
	//method input data yang bersifat private
	public void sdata(String bb)
	{
		this.bahanbakar = bb;
	}
	public void sdat(String bs)
	{
		this.roda = bs;
	}
	void  berbelok()
    {
    	System.out.println("Sedang berbelok");
    }
    void berhenti()
    {
    	System.out.println("Sedang berhenti");
    }
    public void PrintData()
    {
    	System.out.println("Banyak Roda = "+this.roda);
    	System.out.println("Jenis Bahan Bakar = "+this.bahanbakar);
    }
}
class sepedamotor extends kendaraan
{
	void maju()
	{
		System.out.println("Sedang maju");
	}
}
class mobil extends kendaraan
{
	void mundur()
	{
		System.out.println("Sedang mundur");
	}
	
}
class truck extends mobil
{
	private String berat;
	void memutar()
	{
		System.out.println("Sedang memutar");
	} 
	void mengangkut()
	{
		System.out.println("Sedang mengangkut");
	}
	public void dat(String bc)
	{
		this.berat = bc;
	} 
	public void PrintDat()
    {
    	System.out.println("Berat = "+this.berat);
    }
}
public class AldhiyaCapsul2 
{
    public static void main (String[] args) 
    {
    //pembuatan objek kendaraan
    kendaraan k = new kendaraan();
    	
    k.sdat("Dua-Tiga-Empat");
    k.sdata("BBM");
    	
    System.out.println("Objek Kendaraan ----->");
    System.out.println("");
    k.PrintData();
    System.out.println("");
    k.berbelok();
    k.berhenti();
    
    System.out.println("");
    
    //pembuatan objek sepeda motor
    sepedamotor sm = new sepedamotor();
    	
    sm.sdat("Dua");
    sm.sdata("Premium");
    	
    System.out.println("Objek Sepeda Motor ----->");
    System.out.println("");
    sm.PrintData();
    System.out.println("");
    sm.berbelok();
    sm.berhenti();
    sm.maju();
    
    System.out.println("");
    
    //pembuatan objek mobil
    mobil m = new mobil();
    	
    m.sdat("Empat");
    m.sdata("Solar");
    	
    System.out.println("Objek Mobil ----->");
    System.out.println("");
    m.PrintData();
    System.out.println("");
    m.berbelok();
    m.berhenti();
    m.mundur();
    
    System.out.println("");
    
    //pembuatan objek kendaraan
    truck kt = new truck();
    	
    kt.sdat("Enam");
    kt.sdata("Pertamax");
    kt.dat("2000KG");
    	
    System.out.println("Objek Truck ----->");
    System.out.println("");
    kt.PrintData();
    kt.PrintDat();
    System.out.println("");
    kt.berbelok();
    kt.berhenti();
    kt.memutar();
    kt.mengangkut();
    System.out.println("");
    }    
}
interface bdatar
{
	double luas();
  	double keliling();
  	String display();
}
class persegipanjang implements bdatar
{
	private final double panjang,lebar;
	public persegipanjang (double p, double l)
	{
		panjang = p;
		lebar = l;
	}
	public double gpanjang()
	{
		return panjang;
	}
	
	public double glebar()
	{
		return lebar;
	}
	
	public double luas()
	{
		return (panjang*lebar);
	}
	
	public double keliling()
	{
		return (2*(panjang+lebar));
	}
	public String display()
	{
		return ("Persegi Panjang"
				+"\no Panjang	: "+(float)gpanjang()
				+"\no Lebar		: "+(float)glebar()
				+"\no Luas		: "+(float)luas()
				+"\no Keliling	: "+(float)keliling());
	}
}
class persegi implements bdatar
{
	private final double sisi;
	public persegi (double s)
	{
		sisi = s;
	}
	public double gsisi()
	{
		return sisi;
	}
	
	public double luas()
	{
		return (sisi*sisi);
	}
	
	public double keliling()
	{
		return (sisi+sisi+sisi+sisi);
	}
	public String display()
	{
		return ("Persegi"
				+"\no Sisi		: "+(float)gsisi()
				+"\no Luas		: "+(float)luas()
				+"\no Keliling	: "+(float)keliling());
	}
}
class segitiga implements bdatar
{
	private final double alas,tinggi;
	public segitiga (double a, double t)
	{
		alas = a;
		tinggi = t;
	}
	public double galas()
	{
		return alas;
	}
	
	public double gtinggi()
	{
		return tinggi;
	}
	
	public double luas()
	{
		return ((alas*tinggi)/2);
	}
	
	public double keliling()
	{
		double d;
		d = (double )Math.sqrt((alas*alas)+(tinggi*tinggi));
		return (alas+tinggi+d);
	}
	public String display()
	{
		return ("Segitiga"
				+"\no Alas		: "+(float)galas()
				+"\no Tinggi	: "+(float)gtinggi()
				+"\no Luas		: "+(float)luas()
				+"\no Keliling	: "+(float)keliling());
	}
}
public class AldhiyaBangunDatar 
{

    public static void main (String[] args) 
    {
    	bdatar b[] = new bdatar[3];
    	persegipanjang pp = new persegipanjang(5,10);
    	persegi p = new persegi(5);
    	segitiga s = new segitiga(3,4);
    	b[0] = pp;
    	b[1] = p;
    	b[2] = s;
    	
    	for(bdatar b1 :b)
    	{
    		System.out.println("/n"+b1.display());
    	}
    }
    
}
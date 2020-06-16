interface bdatar
{
	double v();
  	double lp();
  	String display();
}
class balok implements bdatar
{
	private final double panjang,lebar,tinggi;
	public balok (double p, double l, double t)
	{
		panjang = p;
		lebar = l;
		tinggi = t;
	}
	public double gpanjang()
	{
		return panjang;
	}
	
	public double glebar()
	{
		return lebar;
	}
	public double gtinggi()
	{
		return tinggi;
	}
	public double lp()
	{
		return (2*(panjang*lebar + lebar*tinggi + panjang*tinggi));
	}
	
	public double v()
	{
		return (panjang*lebar*tinggi);
	}
	public String display()
	{
		return ("Balok"
				+"\no Panjang	: "+(float)gpanjang()
				+"\no Lebar		: "+(float)glebar()
				+"\no Tinggi	: "+(float)gtinggi()
				+"\no Luas		: "+(float)lp()
				+"\no Volume	: "+(float)v());
	}
}
class kerucut implements bdatar
{
	private final double jari,tinggi1;
	public kerucut (double j, double ti)
	{
		jari = j;
		tinggi1 = ti;
	}
	public double gj()
	{
		return jari;
	}
	public double gti()
	{
		return tinggi1;
	}
	public double lp()
	{
		return (3.14*jari*(tinggi1+jari/2));
	}
	
	public double v()
	{
		return (1/3*3.14*jari*jari*tinggi1);
	}
	public String display()
	{
		return ("Persegi"
				+"\no Jari		: "+(float)gj()
				+"\no Tinggi	: "+(float)gti()
				+"\no Luas		: "+(float)lp()
				+"\no Volume	: "+(float)v());
	}
}
class limas implements bdatar
{
	private final double panjang1,lebar1,tinggi2;
	public limas (double p1, double l1, double t1)
	{
		panjang1 = p1;
		lebar1 = l1;
		tinggi2 = t1;
	}
	public double gp1()
	{
		return panjang1;
	}
	public double gl1()
	{
		return lebar1;
	}
	public double gti()
	{
		return tinggi2;
	}
	
	public double lp()
	{
		return ((panjang1*lebar1)+(4*(panjang1*tinggi2/2)));
	}
	
	public double v()
	{
		return (1/3*panjang1*lebar1*tinggi2);
	}
	public String display()
	{
		return ("Limas"
				+"\no Panjang	: "+(float)gp1()
				+"\no Lebar		: "+(float)gl1()
				+"\no Tinggi	: "+(float)gti()
				+"\no Luas		: "+(float)lp()
				+"\no Volume	: "+(float)v());
	}
}
public class AldhiyaBangunRuang
{

    public static void main (String[] args) 
    {
    	System.out.println("asdasdasd");
    	bdatar b[] = new bdatar[3];
    	balok pp = new balok(10,10,10);
    	kerucut p = new kerucut(10,10);
    	limas s = new limas(10,10,10);
    	b[0] = pp;
    	b[1] = p;
    	b[2] = s;
    	
    	for(bdatar b1 :b)
    	{
    		System.out.println("/n"+b1.display());
    	}
    }
    
}
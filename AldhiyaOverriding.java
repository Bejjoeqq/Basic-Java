class binatang
{
	public void bergerak()
	{
		System.out.println("Binatang dapat bergerak");
	}
	public void berkembangbiak()
	{
		System.out.println("Binatang dapat berkembangbiak");
	}
}
class mamalia extends binatang
{
	public void bergerak()
	{
		System.out.println("Mamalia sedang bergerak");
	}
	public void berkembangbiak()
	{
		System.out.println("Mamalia sedang berkembangbiak");
	}
	public void menyusui()
	{
		System.out.println("Mamalia Sedang menyusui");
	}
}
class reptil extends binatang
{
	public void bergerak()
	{
		System.out.println("Reptil sedang bergerak");
	}
	public void berkembangbiak()
	{
		System.out.println("Reptil sedang berkembangbiak");
	}
	public void memangsa()
	{
		System.out.println("Reptil Sedang mencari mangsa");
	}
}
public class AldhiyaOverriding 
{
    public static void main (String[] args) 
    {
    	binatang b = new binatang();
    	mamalia m = new mamalia();
    	reptil r = new reptil();
    	
    	System.out.println("Object Binatang --->");
    	b.bergerak();
    	b.berkembangbiak();
    	
    	System.out.println("");
    	System.out.println("Object Mamalia --->");
    	m.bergerak();
    	m.berkembangbiak();
    	m.menyusui();
    	
    	System.out.println("");
    	System.out.println("Object Reptil --->");
    	r.bergerak();
    	r.berkembangbiak();
    	r.memangsa();
    }
}
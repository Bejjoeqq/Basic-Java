/**
 * @(#)AldhiyaCapsul.java
 *
 *
 * @author 
 * @version 1.00 2017/10/12
 */

class identitas
{
	public String nama;
	public String kelas;
	private String prodi;
	private int nilai;

	public void setnilai(int nilaiku)
	{
		nilai = nilaiku;
	}

	public int getnilai()
	{
		return nilai;
	}
	
	public void setprodi(String prodiku)
	{
		prodi = prodiku;
	}
	public String getprodi()
	{
		return prodi;
	}
}
public class AldhiyaCapsul 
{
	public static void main (String[] args) 
	{
		identitas biodata = new identitas();
		biodata.nama = "Aldhiya Rozak";
		biodata.kelas = "XI";
		biodata.setprodi("RPL");
		biodata.setnilai(98);
		System.out.println("Nama = "+biodata.nama);
		System.out.println("Kelas = "+biodata.kelas);
		System.out.println("Prodi = "+biodata.getprodi());
		System.out.println("Nilai = "+biodata.getnilai());
	}
    
}
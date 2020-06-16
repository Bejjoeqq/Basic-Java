/**
 * @(#)Aldhiyawaris.java
 *
 *
 * @author 
 * @version 1.00 2017/8/31
 */

class pegawai 
{
	String nama;
	int gaji;
    
    void  masuk()
    {
    	System.out.println("Masuk kerja pukul 08:00");
    }
    
    void keluar()
    {
    	System.out.println("Keluar kerja pukul 16:00");
    }
}


class manager extends pegawai
{
	void memimpin()
	{
		System.out.println("Memimpin departemen");
	}
	
}

class buru extends pegawai
{
	void mengangkut()
	{
		System.out.println("Membersihkan kantor");
	}
}




public class Aldhiyawaris {

    public static void main (String[] args) {
    
    
    //pembuatan objek pegawai
    pegawai pegawai1 = new pegawai();
    	
    pegawai1.nama = "Nama Pegawai";
    pegawai1.gaji = 2500000;
    	
    System.out.println("Objek pegawai1 -->");
    System.out.println("Nama = "+pegawai1.nama);
    System.out.println("Gaji = "+pegawai1.gaji);
    pegawai1.masuk();
    pegawai1.keluar();
    
    System.out.println("");
    
    
    //pembuatan objek manager
    manager manager1 = new manager();
    
    manager1.nama = "Aldi";
    manager1.gaji = 4500000;
    
    System.out.println("Objek manager1 -->");
    System.out.println("Nama = "+manager1.nama);
    System.out.println("Gaji = "+manager1.gaji);
    manager1.masuk();
    manager1.keluar();
    manager1.memimpin();
    
    System.out.println("");
    
    
    //pembuatan objek buru
    buru buru1 = new buru();
    
    buru1.nama = "Bejjo";
    buru1.gaji = 1500000;
    
    System.out.println("Objek buru1 -->");
    System.out.println("Nama = "+buru1.nama);
    System.out.println("Gaji = "+buru1.gaji);
    buru1.masuk();
    buru1.keluar();
    buru1.mengangkut();
    }
    
    
}
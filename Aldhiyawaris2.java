/**
 * @(#)Aldhiyawaris2.java
 *
 *
 * @author 
 * @version 1.00 2017/8/31
 */

class hewan 
{
	String nama;
	String makanan;
	String tempat;
    
    void  makan()
    {
    	System.out.println("Sedang makan");
    }
    
    void tidur()
    {
    	System.out.println("Sedang tidur");
    }
    public void PrintData()
    {
    System.out.println("Nama = "+nama);
    System.out.println("Makanan = "+makanan);
    System.out.println("Tempat = "+tempat);
    }
}


class ikan extends hewan
{
	void berenang()
	{
		System.out.println("Sedang berenang");
	}
}

class lumba extends ikan
{
	void menari()
	{
		System.out.println("Sedang Menari");
	}
}

class burung extends hewan
{
	void terbang()
	{
		System.out.println("Sedang terbang");
	}
	
}

class singa extends hewan
{
	void mengaum()
	{
		System.out.println("Sedang mengaum");
	}
}

class beo extends burung
{
	void menyanyi()
	{
		System.out.println("Sedang menyanyi");
	}
}

class merpati extends burung
{
	void mengirim()
	{
		System.out.println("Sedang mengirim surat");
	}
}

public class Aldhiyawaris2 {

    public static void main (String[] args) {
    
    
    //pembuatan objek hewan
    hewan hewan1 = new hewan();
    	
    hewan1.nama = "Jenis Hewan";
    hewan1.makanan = "Jenis Makanan";
    hewan1.tempat = "Jenis Tempat";
    	
    System.out.println("Objek hewan1 -->");
    
    hewan1.PrintData();
    hewan1.makan();
    hewan1.tidur();
    
    System.out.println("");
    
    //pembuatan objek ikan
    ikan ikan1 = new ikan();
    
    ikan1.nama = "Jenis Ikan";
    ikan1.makanan = "Jenis Makanan Ikan";
    ikan1.tempat = "Laut";
    
    ikan1.PrintData();
    ikan1.makan();
    ikan1.tidur();
    ikan1.berenang();
    
    System.out.println("");
    
    //pembuatan objek lumba
    lumba lumba1 = new lumba();
    
    lumba1.nama = "Dolphin";
    lumba1.makanan = "Rumput Laut";
    lumba1.tempat = "Laut";
    
    lumba1.PrintData();
    lumba1.makan();
    lumba1.tidur();
    lumba1.berenang();
    lumba1.menari();
    
    System.out.println("");
    
    //pembuatan objek burung
    burung burung1 = new burung();
    
    burung1.nama = "Jenis Burung";
    burung1.makanan = "Jenis Makanan Burung";
    burung1.tempat = "Udara";
    
    burung1.PrintData();
    burung1.makan();
    burung1.tidur();
    burung1.terbang();
    
    System.out.println("");
    
    
    //pembuatan objek beo
    beo beo1 = new beo();
    
    beo1.nama = "Icha";
    beo1.makanan = "Biji-Bijian";
    beo1.tempat = "Udara";
    
    beo1.PrintData();
    beo1.makan();
    beo1.tidur();
    beo1.terbang();
    beo1.menyanyi();
    
    System.out.println("");
    
    //pembuatan objek merpati
    merpati merpati1 = new merpati();
    
    merpati1.nama = "Dina";
    merpati1.makanan = "Biji-Bijian";
    merpati1.tempat = "Udara";
    
    merpati1.PrintData();
    merpati1.tidur();
    merpati1.terbang();
    merpati1.mengirim();
    
    System.out.println("");
    
    //pembuatan objek singa
    singa singa1 = new singa();
    
    singa1.nama = "Leon";
    singa1.makanan = "Daging";
    singa1.tempat = "Darat";
    
    singa1.PrintData();
    singa1.makan();
    singa1.tidur();
    singa1.mengaum();
    
    }
    
    
}
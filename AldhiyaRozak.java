/**
 * @(#)AldhiyaRozak.java
 *
 *
 * @author 
 * @version 1.00 2017/8/10
 */


public class AldhiyaRozak {
	
   String hewan;
   String jenis;
   String jkelamin;
   String jbulu;
   String wbulu;
   String wmata;
   String berat;
   
   void makan()
   {
   	System.out.println("Sedang Makan");
   }
   void minum()
   {
   	System.out.println("Sedang Minum");
   }
   void lompat()
   {
   	System.out.println("Sedang Lompat");
   }
   void lari()
   {
   	System.out.println("Sedang Lari");
   }
   void menggigit()
   {
   	System.out.println("Sedang Menggigit");
   }
   void menyusui()
   {
   	System.out.println("Sedang Menyusui");
   }
   void tidur()
   {
   	System.out.println("Sedang Tidur");
   }
}

 class ObjectAldhiyaRozak
 {


   public static void main (String[] args) 
   {
   
   AldhiyaRozak hewanku = new AldhiyaRozak();
   hewanku.hewan = "Kucing";
   hewanku.jenis = "Angora";
   hewanku.jkelamin = "Betina";
   hewanku.jbulu = "Lebat";
   hewanku.wbulu = "Putih Dan Coklat";
   hewanku.wmata = "Biru";
   hewanku.berat = "900 Gram";
   
   System.out.println("***************************");
   System.out.println("*        SMK TELKOM       *");
   System.out.println("*-------------------------*");
   System.out.println("* Nama    : Aldhiya Rozak *");
   System.out.println("* Kelas   : XI RPL        *");
   System.out.println("* No.Urut : 02            *");
   System.out.println("***************************");
   
   System.out.println("Hewan         : "+hewanku.hewan);
   System.out.println("Jenis         : "+hewanku.jenis);
   System.out.println("Jenis Kelamin : "+hewanku.jkelamin);
   System.out.println("Jenis Bulu    : "+hewanku.jbulu);
   System.out.println("Warna Bulu    : "+hewanku.wbulu);
   System.out.println("Warna Mata    : "+hewanku.wmata);
   System.out.println("Berat         : "+hewanku.berat);
   System.out.println("");
   System.out.print("Yang Dilakukan Hewanku : ");
   hewanku.makan();
   
   }
    
 }
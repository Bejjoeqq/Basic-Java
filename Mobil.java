/**
 * @(#)Mobil.java
 *
 *
 * @author 
 * @version 1.00 2017/8/10
 */


public class Mobil {
	
   String merek;
   String warna;
   String type;
   
   void maju()
   {
   	System.out.println("Sedang Melaju");
   }
   void mundur()
   {
   	System.out.println("Sedang Mundur");
   }
   void berhenti()
   {
   	System.out.println("Sedang Berhenti");
   }
}

 class ObjectMobil
 {


   public static void main (String[] args) 
   {
   
   Mobil mobilku = new Mobil();
   mobilku.merek = "Toyota";
   mobilku.warna = "Silver";
   mobilku.type = "Bus";
   
   System.out.println("***************************");
   System.out.println("*        SMK TELKOM       *");
   System.out.println("*-------------------------*");
   System.out.println("* Nama    : Emya Tarigan  *");
   System.out.println("* Kelas   : XI RPL        *");
   System.out.println("* No.Urut : 07            *");
   System.out.println("***************************");
   
   System.out.println("Merek Mobil : "+mobilku.merek);
   System.out.println("Warna Mobil : "+mobilku.warna);
   System.out.println("Type Mobil  : "+mobilku.type);
   System.out.println("");
   System.out.println("Keadaan Mobil : ");
   mobilku.berhenti();
   
   }
    
 }
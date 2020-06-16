public class AldhiyaStringBuffer 
{

   public static void main (String[] args) 
   	{
   		System.out.println("--Test Methos Buffer String--");
   		String kata = new String("Aldhiya");
   		StringBuffer katabaru = new StringBuffer(kata);
   		
   		System.out.println("Kata Awal	: "+katabaru);
   		System.out.println("Kata Length : "+katabaru.length());
   		System.out.println("Kapasitas	: "+katabaru.capacity());
   		
   		katabaru.setCharAt(0,'Z');
   		katabaru.setCharAt(4,'L');
   		katabaru.setCharAt(6,'A');
   		
   		System.out.println("Kata CharAl		: "+katabaru);
   		System.out.println("Kata Insert		: "+katabaru.insert(5," dan "));
   		System.out.println("Kata Delete		: "+katabaru.delete(5,9));
   		System.out.println("Kata Reserve	: "+katabaru.reverse());
   		System.out.println("Kata Append		: "+katabaru.append(">>Append"));
   }
    
    
}
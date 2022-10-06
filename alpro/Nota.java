import java.util.Scanner;
public class Nota{
	public static void main (String[] args){
		/*Nota dari sebua warung makan.
		Masukan program adalah: jumlah Nasi Sayur, Lauk Pauk, Kerupuk dan Minuman.
		Harga: 
		Nasi Sayur Rp. 7500,
		Lauk Pauk Rp. 2000, 
		Kerupuk Rp.500 dan 
		Minuman Rp. 1500
		Simpan dengan nama Nota.java
		CONTOH TAMPILAN (tidak perlu tepat
		*/
		//variabel
		int nasiSayur, laukPauk, Kerupuk, Minuman;
		String Nama;
		nasiSayur =7500;
		laukPauk = 2000;
		Kerupuk =500;
		Minuman =1500;
		int nasi, lauk, kerupuk, minuman, Total;
		int Nasii, Laukk, Kerupukk, Minumann;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("========================================================");
		System.out.println("========= Nota Warung Makan Mak Sri Sejahrtera =========");
		System.out.println("========================================================");
		System.out.println("Harga Yang Kami Patok:"); 
		System.out.println("");
		System.out.println("  Nasi Sayur Rp. 7500");
		System.out.println("  Lauk Pauk  Rp. 2000"); 
		System.out.println("  Kerupuk    Rp. 500  ");
		System.out.println("  Minuman    Rp. 1500");
		System.out.println("");
		System.out.print  ("  Nasi Sayur = "); nasi = sc.nextInt();
		System.out.print  ("  Lauk Pauk  = "); lauk = sc.nextInt();
		System.out.print  ("  Kerupuk    = "); kerupuk = sc.nextInt();
		System.out.print  ("  Minuman    = "); minuman = sc.nextInt();
		System.out.println("");
		System.out.println("--------------------------------------------------------");
		Nasii = nasi * nasiSayur;
		Laukk = lauk * laukPauk;
		Kerupukk = kerupuk * Kerupuk;
		Minumann = minuman * Minuman;
		
		System.out.println("    1. Nasi Sayur = Rp. " + Nasii);
		System.out.println("    2. Lauk Pauk  = Rp. " + Laukk);
		System.out.println("    3. Kerupuk    = Rp. " + Kerupukk);
		System.out.println("    4. Minuman    = Rp. " + Minumann);
		System.out.println("    ----------------------------------- + ");
		System.out.println("");
		Total = Nasii + Laukk + Kerupukk + Minumann;
		System.out.println("         Totalnya = Rp. " + Total);
		System.out.println("");
		System.out.println("========================================================");
		System.out.println("========= Nota Warung Makan Mak Sri Sejahtera ==========");
		System.out.println("========================================================");
		System.out.println("=== Terima Kasih Sudah Makan Di Warung Makan Mak Sri ===");
		System.out.println("========================================================");
		System.out.println("========= Nota Warung Makan Mak Sri Sejahtera ==========");
		System.out.println("===== Tempat Makan Yang Enak Dan Nyaman Di Lampura =====");
		System.out.println("=====******** Design By : Yudha Developer *********=====");
		System.out.println("========================================================");
		
	}
}
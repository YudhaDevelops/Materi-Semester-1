import java.util.Scanner;
public class SeriParalelInput {
    public static void main(String[] args) {
        //Catatan untuk nama bisa di masukkan nama pamggiln saja yang muat sampai 5huruf
		//karna sudah saya seting sedemikian sehingga pada bagian laporannya
        //Deklarasi dulu
        double r1, r2, rSeri, RParalel, R1, R2;
		String Nama;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("======================================================");
		System.out.println("= Hallo Saya Adalah Mesin Penghitung Seri Dan Paralel=");
		System.out.println("======================================================");
		System.out.println("===============Perhitungan R Untuk Seri===============");
		System.out.println("======================================================");
		System.out.print  ("Namanya Siapa : "); Nama = sc.nextLine();
		System.out.print  ("Masukan R1 Dulu gan : "); r1 = sc.nextDouble();
		System.out.print  ("OOOh Ya Jangan Lupa Masukin R2nya Ya Gan: ");r2 = sc.nextDouble();
        System.out.println("Jadi Tadi Telah Diketahui bahwa r1 Adalah " + r1 );
        System.out.println("Dan r2nya Adalah " + r2);
        System.out.println("Jika Kita lihat Rumus Rangkaian Seri Adalah ");
		System.out.println("R Seri = R1 + R2 maka:");
        rSeri = r1 + r2;
        System.out.println("R Seri Adalah = " + rSeri );
	
		System.out.println("");
		System.out.println("");
		System.out.println("Kemudian Kita Lanjut Ya Untuk Perhitungan Paralel");
		System.out.println("=============Perhitungan R Untuk Paralel==============");
		System.out.println("======================================================");
		System.out.print  ("Masukan R1nya Lagi Ya gan : "); R1 = sc.nextDouble();
		System.out.print  ("OOOh Ya Jangan Lupa Masukin R2nya Ya Gan: "); R2 = sc.nextDouble();
        System.out.println("Jadi Tadi Telah Diketahui bahwa r1 Adalah " + R1);
        System.out.println(" Dan r2nya Adalah " + R2);
        System.out.println("Jika Kita lihat Rumus Rangkaian Seri Adalah ");
		System.out.println("R Paralel =(r1 * r2) / (r1 + r2) maka: ");
        RParalel = (r1 * r2) / (r1 + r2);
        System.out.println("R Paralel Adalah = " + RParalel);
		
		//laporan
		System.out.println("");
		System.out.println("======================================================");
		System.out.println("====================== Laporan =======================");
		System.out.println("======================================================");
		System.out.println("===============Perhitungan R Untuk Seri===============");
		System.out.println("=Nama Yang Dimasukkan : " + Nama + "                        =");
		System.out.println("=Diketahui R1nya Adalah : " + r1 + "                       =");
		System.out.println("=Diketahui R2nya Adalah : " + r2 + "                       =");
		System.out.println("=Hasil Nya Dari R Seri Adalah : " + rSeri + "         ");
		System.out.println("======================================================");
		System.out.println("=============Perhitungan R Untuk Paralel==============");
		System.out.println("=Nama Yang Dimasukkan : " + Nama + "                        =");
		System.out.println("=Diketahui R1nya Adalah : " + R1 + "                       =");
		System.out.println("=Diketahui R2nya Adalah : " + R2 + "                       =");
		System.out.println("=Hasil Nya Dari R Seri Adalah : " + RParalel+"        ");
		System.out.println("======================================================");
		
		
    }
}

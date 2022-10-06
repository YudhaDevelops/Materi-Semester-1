import java.util.Scanner;
public class SWAB{
	public static void main(String [] args){
		
		String pilihan, gelasA, gelasB;	
		String coffe, mocca;
		
		gelasA="Coffe";
		gelasB="Mocca";
		System.out.println("Halo Saya Menginformasikan Bahwa Gelas A adalah Coffe");
		System.out.println("Dan Juga Bahwa Gelas B adalah Macca");		
		//jika saya pindah Coffe sari gelas a ke gelas b maka
		System.out.println("Kamu mau memindahkan isinya?");
		System.out.println("Ketik \"Mau\" Jika Ingin Memindahnya");
		System.out.println("Dan Ketik \"Tidak\" Jika kamu tidak mau memindahnya");
		Scanner input = new Scanner(System.in);
		pilihan = input.nextLine();
		
		if (pilihan.equals("Mau")){
			System.out.println("Gelas A : " +gelasB);
			System.out.println("Gelas B : " +gelasA);
		}
		else if (pilihan.equals("Tidak")){
			System.out.println("Gelas A : " + gelasA);
			System.out.println("Gelas B : " + gelasB);
		}
		else{
			System.out.println("Maaf jawaban anda tidak sesuai" );
		}
	}
}

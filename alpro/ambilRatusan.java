import java.util.Scanner;
public class ambilRatusan{
	public static void main(String[] args) {
		int  bilangan;

		Scanner nominal = new Scanner(System.in);
		System.out.print("Masukkan Nominal Ratusan : ");
		bilangan = nominal.nextInt();
		String angka = Integer.toString(bilangan);

		if (bilangan >=100 && bilangan<1000){
			System.out.println("Ambil Ratusan = " + angka.substring(0, 1));
			System.out.println("Sisa Nominal " + angka.substring(1));
		}
		else if (bilangan>=100 && bilangan<10000){
			System.out.println("Ambil Ratusan = " + angka.substring(0, 2));
			System.out.println("Sisa Nominal " + angka.substring(2, 4));
		}
		else if (bilangan>=100 && bilangan<100000){
			System.out.println("Ambil Ratusan = " + angka.substring(0, 3));
			System.out.println("Sisa Nominal " + angka.substring(3, 5));
		}
		else if (bilangan>=100 && bilangan<1000000){
			System.out.println("Ambil Ratusan = " + angka.substring(0, 4));
			System.out.println("Sisa Nominal " + angka.substring(4, 6));
		}
		else if (bilangan>=100 && bilangan<10000000){
			System.out.println("Ambil Ratusan = " + angka.substring(0, 5));
			System.out.println("Sisa Nominal " + angka.substring(5, 7));
		}
		else if (bilangan>=100000000){
			System.out.println("angka Anda melebihi 1.000.000!");	
		}
		else {
			System.out.println("Masukkan angka ratusan");
		}

	}
}
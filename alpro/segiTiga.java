import java.lang.Math;
import java.util.Scanner;
public class segiTiga{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double alas, tinggi, miring;
		double luas, keliling;

		System.out.println("");
		System.out.println("---PROGRAM PERHITUNGAN SEGITGA--");
		System.out.println("-----------WITH JAVA------------");
		System.out.println("--------------------------------");
		System.out.println("");
		System.out.print("Masukkan Alas   = ");
		alas = input.nextDouble();
		System.out.print("Masukkan Tinggi = ");
		tinggi = input.nextDouble();
		System.out.println("");

		//proses
		luas = (alas * (tinggi / 2));
		miring = Math.sqrt((alas * alas) + (tinggi * tinggi));
		keliling = (alas + tinggi + miring);

		System.out.println("Dengan Alas      = " + alas);
		System.out.println("Dengan Tinggi    = " + tinggi);
		System.out.println("Maka Luasnya     = " + luas);
		System.out.println("Maka Kelilingnya = " + keliling);
		System.out.println("--------------------------------");

	}
}
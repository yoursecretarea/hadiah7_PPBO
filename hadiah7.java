import java.util.Scanner;

public class hadiah7{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		harga a = new harga();
		String nama,alamat;
		char blok;
		int tipe;
		double bayar,harga;
		harga=0;
		System.out.print("Nama : ");
		nama = inp.nextLine();
		
		System.out.print("Alamat : ");
		alamat = inp.nextLine();
		
		System.out.print("Tipe Rumah(36/37) : ");
		tipe = inp.nextInt();
		
		System.out.print("Blok(A/B) : ");
		blok = inp.next().charAt(0);
		
		System.out.println("Harga = Rp. "+a.proses(tipe, blok));
		
		System.out.print("Bayar = Rp. ");
		bayar = inp.nextDouble();
		
		System.out.println("Kembalian Rp. "+a.kembali(bayar));
	}
}
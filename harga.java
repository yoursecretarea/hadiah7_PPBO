import java.util.Scanner;
public class harga extends hadiah7{
	Scanner inp = new Scanner(System.in);
	double harga,kembalian;
	
	double proses(int tipe, char blok){
		if(tipe==36){
			if(blok=='A'){
				harga=500000;
			}else if(blok=='B'){
				harga=300000;
			}else {
				System.out.println("Salah Input!!");
			}
		} else if(tipe==37){
			if(blok=='A'){
				harga=800000;
			}else if(blok=='B'){
				harga=600000;
			}else {
				System.out.println("Salah Input!!");
			}
	} else {
		System.out.println("Salah Input!!");
	} return harga;
} 

double kembali(double bayar){
	return kembalian = bayar-harga;
	
	}
}
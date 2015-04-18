package id.co.sigma;

public class Main {

	public static void main(String[] args) {
		int angka1 = 1;
		int angka2 = 2;
		
		// pemanggilan objek
		Tambah tambah = new Tambah();
		Kurang kurang = new Kurang();
		Kali kali = new Kali();
		Bagi bagi = new Bagi();
		
		// hasil ditampung dulu di 1 variabel tertentu baru dipanggil di bawah
		int hasilTambah = tambah.doTambah(angka1, angka2);
		int hasilKurang = kurang.doKurang(angka1, angka2);
		int hasilKali = kali.doKali(angka1, angka2);
		float hasilBagi = bagi.doBagi(angka1, angka2);
		
		// tampilkan hasil
		System.out.println("Hasil dari " + angka1 + "+" + angka2 + "=" + hasilTambah);
		System.out.println("Hasil dari " + angka1 + "-" + angka2 + "=" + hasilKurang);
		System.out.println("Hasil dari " + angka1 + "*" + angka2 + "=" + hasilKali);
		System.out.println("Hasil dari " + angka1 + "/" + angka2 + "=" + hasilBagi);
	}
}

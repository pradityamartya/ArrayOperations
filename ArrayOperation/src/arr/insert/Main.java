// Memanggil package
package arr.insert;

//Memanggil library Arrays untuk menggunakan toString()
import java.util.Arrays;

//Membuat class bernama Main
public class Main {
	public static void main(String[] args) {

	     // Array awal
	     int[] num = {1, 4, 9, 25, 36};
	     
	     // Menampilkan array sebelum insertion
	     System.out.println("Before Insertion : " + Arrays.toString(num));
	
	     // Nilai yang akan disisipkan
	     int newNum = 16;
	
	     // Posisi penyisipan (indeks ke-3)
	     int pos = 3;
	
	     // Membuat array baru dengan ukuran satu elemen lebih besar
	     int[] result = new int[num.length + 1];
	
	     // Menyalin elemen sebelum posisi penyisipan
	     for (int i = 0; i < pos; i++) {
	         result[i] = num[i];
	     }
	
	     // Menyisipkan elemen baru pada posisi yang ditentukan
	     result[pos] = newNum;
	
	     // Menyalin sisa elemen setelah posisi penyisipan di mana elemen digeser satu indeks ke kanan
	     for (int i = pos; i < num.length; i++) {
	         result[i + 1] = num[i];
	     }
	
	     // Menampilkan hasil array setelah insertion
	     System.out.println("After Insertion  : " + Arrays.toString(result));
	 }
}
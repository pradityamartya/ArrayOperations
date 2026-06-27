// Memanggil package
package arr.delete;

//Memanggil library Arrays untuk menggunakan toString()
import java.util.Arrays;

//Membuat class bernama Main
public class Main {
    public static void main(String[] args) {

        // Array awal
        int[] num = {1, 4, 9, 16, 25, 36};
        
        // Menampilkan array sebelum deletion
        System.out.println("Before Deletion : " + Arrays.toString(num));

        // Posisi elemen yang akan dihapus (indeks ke-3, yaitu 16)
        int pos = 3;

        // Membuat array baru dengan ukuran satu elemen lebih kecil
        int[] result = new int[num.length - 1];

        // Menyalin elemen sebelum posisi yang dihapus
        for (int i = 0; i < pos; i++) {
            result[i] = num[i];
        }

        // Menyalin sisa elemen setelah posisi yang dihapus di mana elemen digeser satu indeks ke kiri
        for (int i = pos + 1; i < num.length; i++) {
            result[i - 1] = num[i];
        }

        // Menampilkan hasil array setelah deletion
        System.out.println("After Deletion  : " + Arrays.toString(result));
    }
}
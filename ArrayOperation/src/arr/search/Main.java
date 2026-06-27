// Memanggil package
package arr.search;

// Membuat class bernama Main
public class Main {

    public static void main(String[] args) {

        // Membuat array yang berisi beberapa nama
        String[] name = {"Steven", "James", "Peter", "Cole", "Henry"};

        // Menetapkan data nama yang ingin dicari
        String target = "Peter";

        // Variabel untuk menandai apakah data ditemukan atau tidak
        boolean found = false;

        System.out.println("=== Linear Search ===");
        System.out.println();
        System.out.println("Searching for : " + target);
        System.out.println();

        // Melakukan pencarian dengan memeriksa setiap elemen array satu per satu
        for (int i = 0; i < name.length; i++) {

            // Menampilkan data yang sedang diperiksa
            System.out.println("Checking index " + i + " : " + name[i]);

            // Membandingkan elemen saat ini dengan data yang dicari
            if (name[i].equals(target)) {

                // Jika data ditemukan, tampilkan indeksnya
                System.out.println("\nData found at index " + i);

                // Mengubah nilai found menjadi true
                found = true;

                // Menghentikan proses pencarian karena data sudah ditemukan
                break;
            }
        }

        // Menampilkan pesan jika data tidak ditemukan
        if (!found) {
            System.out.println("\nData not found.");
        }
    }
}
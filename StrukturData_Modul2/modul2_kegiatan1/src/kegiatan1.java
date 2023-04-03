import java.util.ArrayList;

public class kegiatan1 {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();

        // Isi ArrayList hewanList dengan hewan-hewan yang disebutkan pada soal
        hewan.add("Angsa"); // Index 0
        hewan.add("Bebek"); // Index 1
        hewan.add("Cicak"); // Index 2
        hewan.add("Domba"); // Index 3
        hewan.add("Elang"); // Index 4
        hewan.add("Gajah"); // Index 5

        // Tambahkan elemen "Badak" dan "Bebek"
        hewan.add("Badak");
        hewan.add("Bebek");
        System.out.println("Hewan :"+hewan);

        // Hitung jumlah elemen "Bebek"
        int jumlahBebek = 0;
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Bebek")) {
                jumlahBebek++;
            }
        }
        System.out.println("Jumlah elemen Bebek: " + jumlahBebek);

        // Cari posisi index elemen "Bebek"
        int indexBebek = -1;
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Bebek")) {
                indexBebek = i;
                break;
            }
        }if (indexBebek != -1) {
            System.out.println("Index elemen Bebek: " + indexBebek);
        } else {
            System.out.println("Elemen Bebek tidak ditemukan pada ArrayList");
        }

        // Hapus posisi "Bebek" yang pertama
        hewan.remove("Bebek");
        // Cetak isi ArrayList hewan setelah menghapus "Bebek"
        System.out.println(hewan);


        // Tampilkan elemen pada index ke-0 dan ke-2
        System.out.println("\nHewan indeks ke-0 :"+hewan.get(0));
        System.out.println("Hewab indeks ke-2 :"+hewan.get(2));
        // Hapus elemen pada index ke-0
        hewan.remove(0);
        System.out.println(hewan);


        // Ubah elemen pada index ke-0 menjadi "Ular"
        hewan.set(0, "Ular");
        // Tambahkan elemen "Itik" pada index ke-2
        hewan.add(2, "Itik");
        System.out.println("\n"+hewan);


        // Hapus elemen di antara index ke-1 dan ke-5
        hewan.subList(2, 5).clear();
        System.out.println(hewan);

        System.out.println("\nElemen pertama: " + hewan.get(0));
        System.out.println("Elemen terakhir: " + hewan.get(hewan.size() - 1));

        //menampilkan jumlah elemen pada array
        System.out.println("\nJumlah elemen :"+hewan.size());

        //mencari index badak
        int indexBadak= -1;
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Badak")) {
                indexBadak = i;
                break;
            }
        }if (indexBadak != -1) {
            System.out.println("\nIndex elemen Badak: " + indexBadak);
        } else {
            System.out.println("Elemen Bebek tidak ditemukan pada ArrayList");
        }

    }
    }




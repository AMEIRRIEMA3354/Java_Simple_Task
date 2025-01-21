import java.util.Scanner;

public class contoh {
    static String[] NamaPelajar = {"Ali", "Abu", "Aminah"}; // Senarai pelajar
    static String[] subjek = {"Bahasa Malaysia", "Bahasa Inggeris"}; // Senarai subjek
    static double[][] pngPelajar = new double[NamaPelajar.length][subjek.length]; // Array 2D untuk menyimpan PNG

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan nilai PNG bagi setiap subjek untuk setiap pelajar
        for (int i = 0; i < NamaPelajar.length; i++) { // Gelung untuk setiap pelajar
            System.out.println("Masukkan PNG untuk pelajar " + NamaPelajar[i] + ":");
            for (int j = 0; j < subjek.length; j++) { // Gelung untuk setiap subjek
                System.out.print(" - " + subjek[j] + ": ");
                pngPelajar[i][j] = input.nextDouble(); // Simpan PNG dalam array 2D
            }
            System.out.println(); // Baris baru selepas setiap pelajar
        }

        // Memaparkan nilai PNG yang dimasukkan
        System.out.println("Rekod PNG Pelajar:");
        for (int i = 0; i < NamaPelajar.length; i++) {
            System.out.println("Pelajar " + NamaPelajar[i] + ":");
            for (int j = 0; j < subjek.length; j++) {
                System.out.println(" - " + subjek[j] + ": " + pngPelajar[i][j]);
            }
            System.out.println();
        }

        input.close(); // Tutup Scanner
    }
}

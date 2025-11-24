/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMEIR IHTISHAM
 */
import java.util.ArrayList;
import java.util.Scanner;

public class LatihanBigO {
    public static void main(String[] args) {
        
        ArrayList<String> menu = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        // --- INPUT PENGGUNA ---
        System.out.println("Sistem Pengurusan Menu");
        System.out.print("Masukkan menu pertama: ");
        
        // 1. Baca input dari pengguna
        String kemasukanData = input.nextLine(); // ✅ Guna nextLine() untuk baca penuh nama menu
        
        // 2. Tambah input ke dalam ArrayList (Operasi ADD O(1))
        menu.add(kemasukanData); 
        
        System.out.println("\nSenarai Awal: " + menu);
        System.out.println("Saiz Awal: " + menu.size());
        
        // --- Operasi ADD ---
        System.out.println("\n--- Operasi ADD ---");
        
        // Tambah menu kedua (di akhir, O(1))
        menu.add("Bolognese");
        
        // ✅ Pembetulan: Semak saiz sebelum tambah pada indeks tertentu.
        // Jika anda menggunakan menu.add(2, ...), ia akan menyebabkan ralat jika saiznya 1.
        // Guna menu.size() untuk memastikan indeks adalah betul.
        menu.add(menu.size(), "Char Koey Teow Udang"); // Tambah di akhir (O(1))
        
        // Tambah menu pada indeks 1 (di tengah, O(N))
        menu.add(1, "Nasi Goreng Ayam Cili"); //Tambah pada indeks 1 (O(N) kerana anjakan)
        
        System.out.println("Menu Terkini: " + menu);
        
        // --- Operasi GET ---
        System.out.println("\n--- Operasi GET (O(1)) ---");
        // Kita ambil menu pada indeks 2 (O(1))
        String menuKetiga = menu.get(2);
        System.out.println("Makanan pada indeks ke-2: " + menuKetiga);
        
        // --- Operasi SET ---
        System.out.println("\n--- Operasi SET (O(1)) ---");
        // Gantikan elemen pada indeks 1
        String menuLama = menu.set(1, "Char Koey Teow Special");
        System.out.println("Menu yang diganti: " + menuLama); 
        System.out.println("Senarai selepas SET: " + menu); 
        
        // --- Operasi REMOVE ---
        System.out.println("\n--- Operasi REMOVE (O(N)) ---");
        // Buang menu pertama (O(N) kerana semua elemen dianjak ke kiri)
        String menuDibuang = menu.remove(0);
        System.out.println("Menu yang dibuang: " + menuDibuang);
        System.out.println("Senarai selepas REMOVE: " + menu); // Perlu tukar dari SET kepada REMOVE
        
        // --- Operasi SIZE ---
        System.out.println("\n--- Operasi SIZE (O(1)) ---");
        int saizAkhir = menu.size();
        System.out.println("Saiz akhir senarai: " + saizAkhir);
        
        // --- Tutup Scanner ---
        input.close();
    }
}
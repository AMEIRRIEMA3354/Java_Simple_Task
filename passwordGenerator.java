/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMEIR IHTISHAM
 */
import java.security.SecureRandom;
public class passwordGenerator {
    public static void main(String[] args){
        int[] number = {1,2,3,4,5,6,7,8,9,0};
        String hurufBesar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        hurufKecil = "abcdefghijklmnopqrstuvwxyz",
        simbol = "!@#$%^&*()+-*/=<>£€{}[];:',./?";
        
        String aksara = number + hurufBesar + hurufKecil + simbol;
        SecureRandom Rawak = new SecureRandom();
        int panjang = 12;
        
        StringBuilder password = new StringBuilder(panjang);
        //Membolehkan satu objek diubahsuai 12kali
        //new digunakan utk bgtau berapa kapasiti yg nk simpan data tu
        
        for(int x = 0;x < 12;x++){
            int indeksRawak = Rawak.nextInt(aksara.length());
            //generate nombor rawak utk jd indeks bg watak dlm string aksara
            //hasilkan nombor bulat
            
            char charRawak = aksara.charAt(indeksRawak);
            //ambil char
            //nyatakan nombor/simbol/huruf yang berada di kedudukan indeksRawak
            
            password.append(charRawak);
            //tambah watak rawak ke penghujung kata laluan
        }
        
        System.out.println("Kata Laluan: " +password.toString());
        
    }
}

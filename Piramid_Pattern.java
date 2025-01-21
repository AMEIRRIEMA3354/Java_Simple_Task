/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMEIR IHTISHAM
 */
import java.util.Scanner;
public class Piramid_Pattern {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan Baris bagi Piramid:");
           int baris = input.nextInt();
           
           for(int tinggi = 1;tinggi <= baris; tinggi++){
               //jika tinggi lebih kecil daripada baris 
               //tinggi akan bertambah
               //setiap kali tinggi meningkat akan muncul baris baru
               for(int ruangan_kosong = 1;ruangan_kosong <=baris;ruangan_kosong++){
                   //kawal bilangan ruangan kosong di hadapan bintang
                   //lebih tinggi baris,sedikit ruang diperlukan
               }
               for(int bintang = 1;bintang <= 2 * tinggi - 1;bintang++){
                   //kawal bilangan bintang yang dicetak dalam setiap baris
                   //bilangan bintang bertambah secara ganjil
               }
               System.out.println();
           }
    }
}

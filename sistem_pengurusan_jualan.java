/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMEIR IHTISHAM
 */
import java.util.Scanner;
public class sistem_pengurusan_jualan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Produk:");
        //Bilangan produk
        int produk = input.nextInt();
        
        String nama_produk,produk_ingindijual;
        float harga_seunit;
        int kuantiti_stok,stok_sekarang;
        
        int bilangan = 1;
        do{
       System.out.println("Masukkan Maklumat Produk:" +bilangan);
       //nyatakan bilangan adalah yg pertama
            System.out.print("Nama Produk:");
               nama_produk = input.next();
            System.out.print("Harga Seunit:");
               harga_seunit = input.nextFloat();
            System.out.print("Kuantiti Stok :");
               kuantiti_stok = input.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------");
            
            bilangan++;
            //bilangan akan bertambah jika syarat adalah tepat
            //digunakan untuk nyatakan dia adalah produk ke berapa
        }
        while(bilangan  <= produk);
        //jika 1 kurang dari produk
        
        int yesno = 1;
        do{
            int kuantiti_barangingindijual;
            System.out.print("Adakah anda ingin menjual produk(y/n):" +yesno );
            char yes_no = input.next().charAt(0);
            if(yes_no == 'y'){
               System.out.print("Masukkan Nama Produk:");
               produk_ingindijual = input.next();
               
               System.out.print("Masukkan Kuantiti Barang Yang Ingin Dijual:");
               kuantiti_barangingindijual = input.nextInt();
               
               System.out.print("Pen dijual sebanyak:" +kuantiti_barangingindijual+ "unit");
               stok_sekarang = kuantiti_stok - kuantiti_barangingindijual;
               
               System.out.println("Stok" +produk_ingindijual+ "sekarang:" +stok_sekarang);
               System.out.println("-------------------------------------------------------------------------------------------------------");
            }
            
            else if(yes_no == 'n'){
                double jualan = kuantiti_barangingindijual * harga_seunit; 
                System.out.print("Jumlah Jualan Hari Ini:" +jualan);
            }
        }
        while(yesno <= produk);
        
        
    }
}

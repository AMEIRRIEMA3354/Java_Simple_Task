/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMEIR IHTISHAM
 */
import java.util.Scanner;
public class PengiraanBayaranChargeElektrik {
    public static void main(String [] args){
        int bulanSemasa,bulanTerdahulu,LebihBesar,LebihKecil;
        double jumlah_bayaran;
        Scanner input = new Scanner(System.in);
        System.out.print("Bacaan Meter Bulan Semasa:");
        bulanSemasa = input.nextInt();
        System.out.print("Bacaan Meter Bulan Terdahulu:");
        bulanTerdahulu = input.nextInt();
        
        if(bulanSemasa > bulanTerdahulu){
            LebihBesar = bulanSemasa;
            LebihKecil = bulanTerdahulu;
        }else{
            LebihBesar = bulanTerdahulu;
            LebihKecil = bulanSemasa;
             
        }
        
        int kWh = LebihBesar-LebihKecil;
        
        if(kWh <= 200){
            jumlah_bayaran = kWh * 0.218;
        }else if(kWh <= 300){
            jumlah_bayaran = (200 * 0.218) + (kWh - 200) * 0.334;
            //dia kira utk 200 dulu...then tolak 200 utk kira baki yg merupakan 100
        }else if(kWh <= 600){
            jumlah_bayaran = (200 * 0.218) + (kWh - 200)  * 0.516;
            //dia kira utk 200 dulu...then tolak 200 utk kira baki yg merupakan 400 lebih
        }else if(kWh <= 900){
            jumlah_bayaran = (200 * 0.546) + (kWh - 200) * 0.546;
            //dia kira utk 200 dulu...then tolak 200 utk kira baki yg merupakan 700 lebih
        }else{
            jumlah_bayaran = (200 * 0.218) + (kWh - 200) * 0.571;
            //yg dkt kWh tu xpayah tutup kurungan 2 kali pun xpa
        }
        
        System.out.println("Kilo Watt Per Hour:" +kWh);
        System.out.println("Bayaran Elektrik Yang Perlu dijelaskan:RM" +jumlah_bayaran);
    }
}

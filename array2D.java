package projectprogramming;

/**
 *
 * @author AMEIR IHTISHAM
 */
import java.util.Scanner;
public class array2D {
    public static void main(String[] args){
        
         Scanner scanner = new Scanner(System.in);
        //baca input
        
        System.out.print("masukkan bilangan baris : ");
        int baris = scanner.nextInt();
        
        System.out.print("masukkan bilangan lajur : ");
        int lajur = scanner.nextInt();
        
        int[][] numbers = new int[baris][lajur];
        
        System.out.print("araay dgn baris saiz "+ baris +" telah dicipta ");
        
        System.out.println();
        
        System.out.println("araay dgn lajur saiz "+ lajur +" telah dicipta ");
        
        
        //looping utk masukkan elemen
        //jika ada loop dalam loop
        //dia akan check jika loop pertama tepati syarat
        //jika tepati syarat dia akan p loop kedua dan buat tugas
        //then loop kedua akan p dkt loop pertama utk check syarat
        //jika syarat dkt loop pertama betul dia akan p dkt loop kedua utk buat tugas
        for(int i=0;i<baris;i++){
            //jika syarat betul dia terus masuk loop lajur
            //jika syarat dh xbetul dia akan p dkt loop utk buat paparan
            for(int x=0;x<lajur;x++){
                //jika syarat betul dia akan buat kerja dan keluar p dkt baris utk loop dgn baris selagi syarat tu betul
                System.out.print("Masukkan bilangan elemen[" + i + "][" + x +"]:");
                numbers[i][x] = scanner.nextInt();
                //direct masuk dlm array terus
            }
        }
        
        //looping utk buat paparan
        for(int i =0;i < baris;i++){
            for(int x = 0;x < lajur;x++){
                System.out.print(numbers[i][x] + " ");
            }
            System.out.println();
        }
       
        
    }
}

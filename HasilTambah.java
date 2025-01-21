import java.util.Scanner;
public class HasilTambah {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       
        int no1,no2,no3;
        int hasil;
        
        System.out.println("Masukkan Nombor 1 :");
        no1 = input.nextInt();
        System.out.println("Masukkan Nombor 2 :");
        no2 = input.nextInt();
        System.out.println("Masukkan Nombor 3 :");
        no3 = input.nextInt();
        
        hasil = no1 + no2 + no3;
        System.out.println("Nombor 1 :" +no1);
        System.out.println("Nombor 2 :" +no2);
        System.out.println("Nombor 3 :" +no3);
        
         System.out.println("Hasil Tambah Kesemua Nombor :" +hasil);
    }
}

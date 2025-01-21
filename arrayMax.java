package projectprogramming;

/**
 *
 * @author AMEIR IHTISHAM
 */
import java.util.Scanner;
public class arrayMax {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //baca input
        
        System.out.print("Masukkan bilangan elemen dalam array : ");
        int size = scanner.nextInt();
        //declare utk pegang nilai bil.elemen
        
        int[] numbers = new int[size];
        //size array adalah size dgn type int
        //int[] numbers:array dengan nama numbers yang simpan nilai integer
        //new int[size]: cipta 1 array dgn panjang yg telah dimasukkan oleh user
        
        System.out.println("bilangan elemen yang anda masukkan : " +size);
        //papar semula bilangan elemen yang kita masukkan
        
        System.out.println();
        // utk ke line baru
        
        for(int i=0;i<size;i++){
            //selagi dia kurang dr nilai dlm size dia akan paparkan
            System.out.print("Masukkan nilai ke dalam elemen [ ] " + (i+1)+ ":");
            //i+1 adalah utk tentukan dia elemen ke berapa cth elemen 1,2,3
            numbers[i]=scanner.nextInt();
        }
        
        //Round 1: i=0 semak syarat i<4(true); i++(0+1);
        //Round 2: i=1 semak syarat i<4(true); i++(1+1);
        //Round 2: i=2 semak syarat i<4(true); i++(2+1);
        //Round 3: i=3 semak syarat i<4(true); i++(3+1);
        //Round 4: i=4 semak syarat i<4(false); i++(4+1);
        
        System.out.println("Anda telah selesai memasukkan nilai ke dalam elemen array");
        
        
    }
}

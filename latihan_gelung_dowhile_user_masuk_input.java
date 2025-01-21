/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMEIR IHTISHAM
 */
import java.util.Scanner;
public class latihan_gelung_dowhile_user_masuk_input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        do{
           System.out.print("Masukkan nombor :");
           number = input.nextInt();
           //paparkan ruangan input user
        }
        while(number < 105);
        //paparkan ruangan selagi input kurang daripada 105
        
        System.out.println("Anda telah memasukkan nombor lebih besar daripada 100");
        //jika input lebih besar dari 105 dia paparkan text
        
    }
}

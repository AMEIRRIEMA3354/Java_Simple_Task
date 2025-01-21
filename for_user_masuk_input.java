/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMEIR IHTISHAM
 */
import java.util.Scanner;
public class for_user_masuk_input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        //deklarasi
        for(; number <= 100;){
            //syarat
          System.out.print("Masukkan Number:");
          number = input.nextInt();
          //arahan jika menepati syarat
        }
        System.out.println("Anda telah memasukkan nombor lebih besar daripada 100");
    }
}

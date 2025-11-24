/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMEIR IHTISHAM
 */
import java.util.Scanner;
import java.util.Random;
public class randomIntegerNumberGenerator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Random rawak = new Random();
        
        int min,max;
        
        System.out.println("======================================");
        System.out.println("        Penjana Nombor Rawak");
        System.out.println("======================================");
        System.out.print("Nombor Minimum: ");
        min = input.nextInt();
        System.out.print("Nombor Maksimum:");
        max = input.nextInt();

        //Penjanaan
        int nomborRawak = max - min + 1;
     
        //Hasil
        System.out.println("\n--------------------------------------");
        System.out.println("Nombor Rawak Yang Dijana:");
        System.out.println(">> " + nomborRawak);
        System.out.println("Julat yang digunakan: " + min + " hingga " + max);
        System.out.println("--------------------------------------");
    }
}

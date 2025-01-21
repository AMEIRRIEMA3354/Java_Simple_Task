/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprogramming;

/**
 *
 * @author AMEIR IHTISHAM
 */
import java.util.Scanner;
public class exampleforexam {

    // Membina instance variable untuk menerima input menu pilihan pelanggan
    static double runningTotal = 0.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ordering = true;

        // Menggunakan do-while untuk loop utama
        do {
            menu(); // Panggil method menu untuk paparkan pilihan menu
            System.out.print("Masukkan pilihan anda: ");
            int choice = input.nextInt();
            int quantity;

            // Switch-case untuk menu
            switch (choice) {
                case 1:
                    System.out.println("You've ordered a burger");
                    System.out.print("Enter quantity: ");
                    quantity = input.nextInt();
                    subTotal(quantity, 5.00); // Panggil method subTotal
                    break;
                case 2:
                    System.out.println("You've ordered fries");
                    System.out.print("Enter quantity: ");
                    quantity = input.nextInt();
                    subTotal(quantity, 3.00); // Panggil method subTotal
                    break;
                case 3:
                    System.out.println("You've ordered a soda");
                    System.out.print("Enter quantity: ");
                    quantity = input.nextInt();
                    subTotal(quantity, 2.50); // Panggil method subTotal
                    break;
                case 4:
                    done(); // Panggil method done apabila pesanan selesai
                    ordering = false; // Menamatkan loop dengan menetapkan ordering ke false
                    break;
                default:
                    System.out.println("Undifined");
            }
        } while (ordering); // Ulangi loop selama ordering adalah true

        input.close(); // Menutup scanner
    }

    // Method untuk paparkan menu
    public static void menu() {
        System.out.println("Selamat datang ke Aqil's Burger!");
        System.out.println("1. Burger (RM5.00)");
        System.out.println("2. Fries (RM3.00)");
        System.out.println("3. Soda (RM2.50)");
        System.out.println("4. Done");
    }

    // Method untuk mengira subtotal berdasarkan kuantiti dan harga item
    public static void subTotal(int quantity, double itemPrice) {
        double subTotal = quantity * itemPrice; // Formula: subTotal = quantity * itemPrice
        runningTotal += subTotal; // Formula: runningTotal = subTotal + runningTotal
        System.out.println("Subtotal : RM " + subTotal);
    }

    // Method untuk paparkan total harga
    public static void done() {
        System.out.println("Total Price: RM " + runningTotal);
        System.out.println("Enjoy your Meal!");
    }
}



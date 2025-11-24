/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMEIR IHTISHAM
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.security.SecureRandom;
public class foodIdea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SecureRandom rawak = new SecureRandom();
        
        System.out.println("\n==============================================");
        System.out.println("            🎉 GENERATOR MENU 🎉      ");
        System.out.println("==============================================");
        System.out.println("Masukkan bilangan makanan yang anda punyai");
        System.out.println("Ini akan membantu bagi mencipta ruangan jawapan");
        System.out.print("Bilangan: ");
        int bilanganUlang = input.nextInt();
        String[] jenisMasakan = {"Masak Lemak Cili Api","Blackpepper Sauce","Cili Ala Thai","Buttermilk","Salted Egg","Spicy Plum ","Spice Saute","Herby Mayo","Spicy Tomato"};
        
        ArrayList<String> senaraiProtein = new ArrayList<>();
        ArrayList<String> senaraiKarbohidrat = new ArrayList<>();
        ArrayList<String> senaraiFiber = new ArrayList<>();
        
        System.out.println("\n==============================================");
        System.out.println("Masukkan Protein Keinginan Anda");
         System.out.println("==============================================");
        for(int x=0;x<bilanganUlang;x++){
            System.out.println("Protein Ke- " + (x + 1)+ ": ");
            String protein = input.next();
            senaraiProtein.add(protein);
        }
        
        System.out.println("\n==============================================");
        System.out.println("Masukkan Karbohidrat Keinginan Anda");
        System.out.println("==============================================");
        for(int w=0;w<bilanganUlang;w++){
            System.out.println("Karbohidrat Ke- " + (w + 1)+ ": ");
            String karbohidrat = input.next();
            senaraiKarbohidrat.add(karbohidrat);
        }
        
        System.out.println("\n==============================================");
        System.out.println("Masukkan Fiber Keinginan Anda");
        System.out.println("==============================================");
        for(int m=0;m<bilanganUlang;m++){
            System.out.println("Fiber Ke- " + (m + 1)+ ": ");
            String fiber = input.next();
            senaraiFiber.add(fiber);
        }
        
        //Generator
        int indeksProtein = rawak.nextInt(senaraiProtein.size());
        String proteinAnda = senaraiProtein.get(indeksProtein);
        //ambil nombor rawak dari senaraiProtein
        //nombor mewakili item yang terdapat dalam array
        
        int indeksKarbohidrat = rawak.nextInt(senaraiKarbohidrat.size());
        String karbohidratAnda = senaraiKarbohidrat.get(indeksKarbohidrat);
        //ambil nombor rawak dari senaraiKarbohidrat
        //nombor mewakili item yang terdapat dalam array
        
        int indeksFiber = rawak.nextInt(senaraiFiber.size());
        String fiberAnda = senaraiFiber.get(indeksFiber);
        //ambil nombor rawak dari senaraiFiber
        //nombor mewakili item yang terdapat dalam array
        
        int indeksMasakan = rawak.nextInt(jenisMasakan.length);
        //length digunakan sebab array
        String masakanPilihan = jenisMasakan[indeksMasakan];
        
        //PaparanHasil
        System.out.println("\n==============================================");
        System.out.println("            🎉 IDEA MAKANAN RAWAK ANDA 🎉      ");
        System.out.println("==============================================");
        System.out.println("Protein Utama:    " + proteinAnda.toUpperCase());
        System.out.println("Karbohidrat:      " + karbohidratAnda.toUpperCase());
        System.out.println("Sayuran (Fiber):  " + fiberAnda.toUpperCase());
        System.out.println("Gaya Masakan:     " + masakanPilihan.toUpperCase());
        System.out.println("----------------------------------------------");
        System.out.println("Cadangan Resipi: Cuba masak **" + proteinAnda + "** dengan **" + masakanPilihan + "** dan hidangkan bersama **" + karbohidratAnda + "** dan **" + fiberAnda + "**.");
        System.out.println("==============================================");
        
        
        
        
       
        
        
    }
}

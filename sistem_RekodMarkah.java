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
 public class sistem_RekodMarkah {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.print("Masukkan bilangan pelajar:");
    int pelajar = scanner.nextInt();
    
    
    System.out.print("Masukkan bilangan subjek:");
    int subjek = scanner.nextInt();
    
    int[][] markahPelajar = new int[pelajar][subjek];
    
    //looping untuk masukkan markah mengikut bilangan pelajar dan subjek
    for(int i = 0;i < pelajar;i++){
    //untuk periksa user pelajar ke berapa
    //periksa adakah 0 kurang drpd 2
    //dh settle loop kedua dia naik dgn pegang nilai i+1
        System.out.println("Pelajar Ke- "+ (i+1)+ ":");
        //0+1 jd 1
        for(int x = 0;x < subjek;x++){
            //untuk periksa subjek ke berapa
            //periksa adakah 0 kurang drpd 3
            System.out.print("Masukkan markah bagi subjek ke- "+ (x+1)+ ":");
            markahPelajar[i][x]  = scanner.nextInt();
        }
        System.out.println();
    }
    
    
    
    double[] purataMarkah = new double[markahPelajar.length];
    //saiz array purataMarkah kena sama dgn markahPelajar[pelajar] utk pastikan bahawa kita ada ruang yg cukup utk simpan purata setiap pelajar
    
    //pengiraan markah purata
    for(int p = 0;p < markahPelajar.length;p++){
        //ulang setiap baris dlm array markahPelajar
        //setiap baris mewakili seorang pelajar
        //akses pelajar dulu
        int jumlah = 0;
        //utk simpan jumlah markah bg setiap pelajar
        for(int s = 0;s < markahPelajar[p].length;s++){
            //akses subjek
            //tambahkan setiap markah kepada jumlah
            jumlah += markahPelajar[p][s];
        }
        purataMarkah[p] = (double) jumlah / markahPelajar[p].length;
    }
    
    //papar markah purata 
    for(int i=0;i < purataMarkah.length;i++){
        System.out.println("Purata markah Pelajar " + (i + 1) + ": " + purataMarkah[i]);
    }
    
//        int jumlah = 0;
//        int bilanganmarkah = 0;
//        for(int m =0;m<markahPelajar.length;m++){
//            for(int n = 0;n <markahPelajar[m].length;n++){
//                jumlah += markahPelajar[m][n];
//                bilanganmarkah++;
//            }
//        }
//        
//         // Kira purata dengan membahagikan jumlah dengan bilangan elemen dalam array
//        double purata = (double) jumlah / bilanganmarkah;
//
//        // Cetak purata markah
//        System.out.println("Purata markah: " + purata);
    
    
    
    
    
 }
 }
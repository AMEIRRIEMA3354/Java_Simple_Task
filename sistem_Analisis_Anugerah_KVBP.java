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
import java.text.DecimalFormat;
public class sistem_Analisis_Anugerah_KVBP {
    static int inputUser;
    //guna dkt input nama pelajar
    static String NamaPelajar[] = new String[100];
    static double pngkSem1[] = new double[100];
    static double pngkSem2[] = new double[100];
    static double pngkk[] = new double[100];
    static double keseluruhanSem1[] = new double[100];
    static double keseluruhanSem2[] = new double[100];
    static String subjek[] = {"Bahasa Malaysia","Bahasa Inggeris"};
    
    static double pngSem1[][] = new double[100][2];
    static double pngSem2[][] = new double[100][2];
    static double bmAverage[] = new double[100];
    //hasil purata bm
    static double biAverage[] = new double[100];
    //hasil purata bi
    
    static Scanner input = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");
    
    //method menu utama
    static void menuUtama(){
        System.out.println("============================");
        System.out.println("SISTEM ANALISIS ANUGERAH KVBP");
        System.out.println("============================");
        System.out.println("1.DAFTAR NAMA PELAJAR");
        System.out.println("2.INPUT PNG");
        System.out.println("3.PAPAR PNGK");
        System.out.println("4.PAPAR SENARAI PENERIMA ANUGERAH");
        System.out.println("5.KELUAR");
    }
    
    //method inputNamaPelajar
    static void inputNamaPelajar(){
        System.out.print("\nDAFTAR NAMA PELAJAR\nMasukkan bilangan pelajar:");
        
        //dia check syarat
        while(!input.hasNextInt()){
        //jika input yg dimasukkan bukan integer
          System.out.println("Input tidak valid.Sila masukkan sekali lagi");
          input.next();
          //buka ruang kosong
        }
        inputUser = input.nextInt();
        //ini masukkan input no yg sebenar
        
        for(int i=0;i < inputUser;i++){
        //selagi dia kurang drpd input dia akan bertambah
           System.out.print("Masukkan nama pelajar ke-" + (i + 1) + ":");
           NamaPelajar[i] = input.next();
        }
        
        System.out.println("Kemasukan nama berjaya");
    }
    
    //method inputPNG
    static void inputPNG(){
        if(inputUser == 0){
            System.out.print("\nData tiada...Sila masukkan data");
            return;
            //kembali ke fase sebelumnya
        }
        
        //sem 1
        for(int i=0;i < inputUser;i++){
            System.out.println("===========================");
            System.out.println("SEMESTER 1");
            System.out.println("===========================");
            System.out.println("Pelajar" +(i + 1)+ ":" +NamaPelajar[i]);
            for(int j=0;j<2;j++){
                System.out.print("Masukkan PNG SEM 1" +subjek[j]+ ":");
                //subjek[j] tu kita bgtau bahawa j tu adalah subjek
                while(!input.hasNextDouble()){
                    System.out.print("Masukkan semula data kerana tidak sah");
                    input.next();
                }
                pngSem1[i][j] = input.nextDouble();
                //i dgn j sbb dia kena masukkkan nama dan png sem
            }
        }
        System.out.println("---------------------------------------------------");
        //sem 2
         for(int i=0;i < inputUser;i++){
            System.out.println("===========================");
            System.out.println("SEMESTER 2");
            System.out.println("===========================");
            System.out.println("Pelajar" +(i + 1)+ ":" +NamaPelajar[i]);
            for(int j=0;j<2;j++){
                System.out.print("Masukkan PNG SEM 2" +subjek[j]+ ":");
                //subjek[j] tu kita bgtau bahawa j tu adalah subjek
                while(!input.hasNextDouble()){
                    System.out.print("Masukkan semula data kerana tidak sah");
                    input.next();
                }
                pngSem2[i][j] = input.nextDouble();
                //i dgn j sbb dia kena masukkkan nama dan png sem
            }
        }
         
        kiraPurata();
    }
    
    //method kiraPurata
    static void kiraPurata(){
        //loop untuk membuat pengiraan
        for(int i=0;i < inputUser;i++){
        //selagi dia kurang drpd input user ms masuk bilangan pelajar
           for(int j =0;j<2;j++){
           //j<2 sbb subjek ada 2 shj
              keseluruhanSem1[i]+=pngSem1[i][j];
              //tambah semua pngSem1 dan masuk dlm keseluruhanSem1
              keseluruhanSem2[i]+=pngSem2[i][j];
              //tambah semua pngSem2 dan masuk dlm keseluruhanSem2
           }
           
           //kira purata subjek
           //pengiraan pngk subjek
           bmAverage[i] = (pngSem1[i][0]+pngSem2[i][0]/2);
           biAverage[i] = (pngSem1[i][1]+pngSem2[i][1]/2);
           
           //kira pngk sem1 dan sem2
           pngkSem1[i] = keseluruhanSem1[i]/2;
           pngkSem2[i] = keseluruhanSem2[i]/2;
           
           //kira pngkk 1 svm
           pngkk[i] = (pngkSem1[i]+pngkSem2[i]/2); 
           //i tu kena ada kena bg nama ikut dlm loop yg kita dh bg
           
           
        }
    }
    
    //method papar
    static void papar(){
        if(inputUser == 0){
            System.out.print("\nData tiada...Sila masukkan data");
            //kembali ke fase sebelumnya
        }else{
            String papar = "\nPAPARAN KEPUTUSAN 1 SVM"
                    + "\nPNG 1 SVM SEMESTER 1"
                    + "\nNAMA\t|| BM\t|| BI\t|| PNGK SEM 1";
            for(int i=0;i<inputUser;i++){
                papar+="\n"+NamaPelajar[i]+"\t|| "
                       +df.format(pngSem1[i][0])+"\t|| "
                       +df.format(pngSem1[i][1])+"\t|| "
                       +df.format(pngkSem1[i]);
            }
            
            papar+="\nPNG 1 SVM SEMESTER 2"
                 +"\nNAMA\t|| BM\t|| BI\t||";
            for(int i=0;i<inputUser;i++){
                papar+="\n"+NamaPelajar[i]+"\t|| "
                       +df.format(pngSem1[i])+"\t|| "
                       +df.format(pngSem2[i][1])+"\t|| "
                       +df.format(pngkSem2[i]);
            }
            
            papar+="\nPNGKK 1 SVM"
                    +"\nNAMA\t|| BM\t|| BI\t|| ";
            for(int i=0;i<inputUser;i++){
                papar+="\n"+NamaPelajar[i]+"\t|| "
                    +df.format(bmAverage[i])+"\t|| "
                    +df.format(biAverage[i])+"\t|| "
                    +df.format(pngkk[i])+"\t|| ";
            }      
               
            System.out.println("PAPARAN KEPUTUSAN TAMAT");
            System.out.print(papar);
            //hg buat dlm variable jd kena panggil
        }
    }
    
    //method penerimaAnugerah
    static void penerimaAnugerah(){
        
    }
    
    //method main
    public static void main(String[] args){
        int pilihanPengguna;
        //utk kita guna dkt switch
        char keluarSistem = 't';
        
        do{
            menuUtama();
            System.out.println("Pilih Satu Menu:");
            pilihanPengguna = input.nextInt();
            
            switch(pilihanPengguna){
            case 1:
                inputNamaPelajar();
                break;
            case 2:
                inputPNG();
                break; 
            case 3:
                papar();
                break;
            case 4:
                penerimaAnugerah();
                break;
            case 5:
                System.out.println("\nKeluar Daripada Sistem\nMasukkan Y untuk YA,T untuk TIDAK:");
                pilihanPengguna = input.next().charAt(0);
                break;
            default:
                System.out.println("\n*************RALAT PILIHAN*************\nSILA MASUKKAN SEMULA PILIHAN ANDA");
        }
        }while(keluarSistem != 'y' && keluarSistem != 'Y');
    }
}

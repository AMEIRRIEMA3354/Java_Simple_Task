//utk pc kena buat project with ant...java application
package projectprogramming;
import java.text.DecimalFormat;
//format perpuluhan
import java.util.Scanner;

/**
 *
 * @author AMEIR IHTISHAM
 */
public class latihanPA {
    static int r;
    static String namaPelajar[] = new String[100];
    static double pngkSem1[] = new double[100];
    static double pngkSem2[] = new double[100];
    static double pngkk[] = new double[100];
    
    static double pngSem1[][] = new double [100][6];
    static double pngSem2[][] = new double [100][6];
    static double totalPNGSem1[] = new double[100];
    static double totalPNGSem2[] = new double[100];
    static double bmAverage[] = new double[100];
    static double biAverage[] = new double[100];
    static double mathAverage[] = new double[100];
    static double scAverage[] = new double[100];
    static double sejAverage[] = new double[100];
    static double geoAverage[] = new double[100];
    
    static String subjek[] = {"Bahasa Malaysia","Bahasa Inggeris","Matematik","Sains","Sejarah","Geografi"};
    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");
    
    
    // method main,ada do while dan pilihan guna switch case
    public static void main(String args[]){
        int option;
        char exit = 't';
        
        do{
            menuUtama();
            System.out.print("Pilih Satu Menu: ");
            //jika input tiada integer,maka dia jd true dan while diaktifkan
            while(!scanner.hasNextInt()){
                System.out.println("Input tidak valid.Masukkan nombor pilihan.");
                //program tunggu input baru dr user
                scanner.next();
            }
            //sistem akan simpan input dr scanner dalam option
            option = scanner.nextInt();
            
            switch(option){
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
                    System.out.print("\nKELUAR SISTEM?\nMasukkan Y untuk YA,T untuk TIDAK: ");
                    exit = scanner.next().charAt(0);
                    break;
                default:
                    System.out.println("\n********** RALAT PILIHAN ***********\nSILA MASUKKAN SEMULA PILUHAN ANDA");
            }
        //jika input tidak sama dgn y/Y yang bermaksud setuju untuk keluar
        }while (exit != 'Y' && exit != 'y');
        System.out.println("\n********** Terima kasih kerana telah menggunakan sistem ini! ********");
    }
    
    //method menuUtama()
    static void menuUtama(){
        System.out.println("\n==================================");
        System.out.println("SISTEM ANALISIS ANUGERAH KVBP");
        System.out.println("====================================");
        System.out.println("1. Daftar Nama Pelajar");
        System.out.println("2. Input PNG");
        System.out.println("3. Papar PNGK");
        System.out.println("4. Papar Senarai Penerima Anugerah");
        System.out.println("5. Keluar");
    }
    
    //method inputNamaPelajar()
    static void inputNamaPelajar(){
        System.out.print("\n DAFTAR NAMA PELAJAR \nMasukkan Bilangan Pelajar: ");
        //jika input bukan integer
        while (!scanner.hasNextInt()) {
            System.out.println("Input tidak valid. Masukkan nombor.");
            scanner.next();
        }
        //input yang discan akan masuk dlm declaration r
        r = scanner.nextInt();
        
        for (int i = 0;i < r;i++){
            //kira nama itu nama ke berapa berdasarkan input dari scanner
            System.out.print("Masukkan Nama Pelajar " + (i + 1) + ": ");
            //masukkan nama pelajar dalam array namaPelajar 
            namaPelajar[i] = scanner.next();
        }
        
        System.out.println("DAFTAR NAMA PELAJAR SELESAI");
    }
    
    //method inputPNG()
    static void inputPNG(){
        if(r == 0){
            System.out.println("\n TIADA DATA PELAJAR! \nSILA PILIH MENU 1 UNTUK DAFTAR NAMA PELAJAR");
            return;
        }
        
        System.out.println("\n INPUT PNG SEMESTER 1");
        for(int i = 0; i < r; i++){
            //nyatakan dia pelajar ke berapa dan nama pelajar tersebut
            System.out.println("\nPelajar " + (i + 1) + ": " + namaPelajar[i]);
            for(int j = 0;j < 6;j++){
                //arahan untuk masukkan png sem 1 bagi subjek
                System.out.print("Masukkan PNG Sem 1 " + subjek[j] + ": ");
                while (!scanner.hasNextDouble()){
                    System.out.println("Input tidak valid. Masukkan nombor.");
                    scanner.next();
                }
                //Masukkan nama dan png subjek ke array pngSem1[i][j]
                pngSem1[i][j] = scanner.nextDouble();
            }
        }
        
         System.out.println("\n INPUT PNG SEMESTER 2");
        for(int i = 0; i < r; i++){
            //nyatakan dia pelajar ke berapa dan nama pelajar tersebut
            System.out.println("\nPelajar " + (i + 1) + ": " + namaPelajar[i]);
            for(int j = 0;j < 6;j++){
                //arahan untuk masukkan png sem 1 bagi subjek
                System.out.print("Masukkan PNG Sem 2 " + subjek[j] + ": ");
                while (!scanner.hasNextDouble()){
                    System.out.println("Input tidak valid. Masukkan nombor.");
                    scanner.next();
                }
                //Masukkan nama dan png subjek ke array pngSem1[i][j]
                pngSem2[i][j] = scanner.nextDouble();
            }
        }
        
        System.out.println("\nINPUT PNG SELESAI");
        kiraPurata();
    }
    
    //method kiraPurata()
    static void kiraPurata(){
        for(int i=0;i<r;i++){
            //j<6 sbb 6 adalah jumlah subjek
            for(int j=0;j<6;j++){
                totalPNGSem1[i]+=pngSem1[i][j];
                totalPNGSem2[i]+=pngSem2[i][j];
            }
            
            bmAverage[i] = (pngSem1[i][0]+pngSem2[i][0]/2);
            biAverage[i] = (pngSem1[i][0]+pngSem2[i][1]/2);
            mathAverage[i] = (pngSem1[i][2]+pngSem2[i][2]/2);
            scAverage[i] = (pngSem1[i][3]+pngSem2[i][3]/2);
            sejAverage[i] = (pngSem1[i][4]+pngSem2[i][4]/2);
            geoAverage[i] = (pngSem1[i][5]+pngSem2[i][5]/2);
            pngkSem1[i] = totalPNGSem1[i]/6;
            pngkSem2[i] = totalPNGSem2[i]/6;
            pngkk[i]=(pngkSem1[i]+pngkSem2[i]/2);
        }
    }
    
    //method penerimaAnugerah()
    static void penerimaAnugerah(){
        if(r == 0){
            System.out.println("\n TIADA DATA PELAJAR! \nSILA PILIH MENU 1 UNTUK DAFTAR NAMA PELAJAR");
        }
        else{
            String awardBM=namaPelajar[0];
            String awardBI=namaPelajar[0];
            String mainAward=namaPelajar[0];
            
            double maxBM=bmAverage[0];
            double maxBI=biAverage[0];
            double maxAverage=pngkk[0];
            
             for(int i=0;i<r;i++){
            //cari tertinggi purata BM
            if(bmAverage[i]>maxBM){
                maxBM=bmAverage[i];
                awardBM=namaPelajar[i];
            }
            
            //cari tertinggi purata BI
               if(biAverage[i]>maxBI){
                maxBI=biAverage[i];
                awardBI=namaPelajar[i];
            }
               
            //cari tertinggi purata keseluruhan
            if(pngkk[i]>maxAverage){
                maxAverage=pngkk[i];
                mainAward=namaPelajar[i];
            }
            
        }
              String paparSenarai="\nSENARAI PENERIMA ANUGERAH\n"
                    +"\nAnugerah Terbaik Bahasa Melayu: "+awardBM
                    +"\nAnugerah Terbaik Bahasa Inggeris: "+awardBI
                    +"\nAnugerah Pelajar Cemerlang: "+mainAward
                    +"\n\n SENARAI PENERIMA ANUGERAH TAMAT\n";
              
              System.out.print(paparSenarai);
        }
        
       
    }
    
    //method papar()
    static void papar(){
        if(r==0){
            System.out.println("\n TIADA DATA PELAJAR! \nSILA PILIH MENU 1 UNTUK DAFTARA NAMA PELAJAR");
        }
        else{
            String papar = "\nPAPARAN KEPUTUSAN 1 SVM \n"
                          +"\nPNG 1 SVM SEMESTER 1"
                          +"\nNAMA\t|| BM\t BI\t PNGK Sem 1";
            for(int i=0;i<r;i++){
                papar+="\n"+namaPelajar[i]+"\t|| "
                       +df.format(pngSem1[i][0])+"\t "
                       +df.format(pngSem1[i][1])+"\t "
                       +df.format(pngSem1[i][2])+"\t "
                       +df.format(pngkSem1[i]);
            }
            
            papar +="\nPNG 1 SVM SEMESTER 2"
                          +"\nNAMA\t|| BM\t BI\t PNGK Sem 2";
            for(int i=0;i<r;i++){
                papar+="\n"+namaPelajar[i]+"\t|| "
                       +df.format(pngSem2[i][0])+"\t "
                       +df.format(pngSem2[i][1])+"\t "
                       +df.format(pngSem2[i][2])+"\t "
                       +df.format(pngkSem2[i]);
            }
            
            papar +="\n\nPNGK 1 SVM"
                          +"\nNAMA\t|| BM\t BI\t PNGKK";
            for(int i=0;i<r;i++){
                papar+="\n"+namaPelajar[i]+"\t|| "
                       +df.format(bmAverage[i])+"\t "
                       +df.format(biAverage[i])+"\t "
                       +df.format(pngkk[i]);
            }
            
            papar+="\n\nPAPARAN KEPUTUSAN TAMAT";
            System.out.println(papar);
        }
    }
    
    
}

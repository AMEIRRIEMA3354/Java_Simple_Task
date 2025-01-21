package projectprogramming;
import java.util.Scanner;
public class sistemPengurusanInventori{
    static int pengiraanItem = 0;
    //kita start pengiraan dgn 0 sbb item user yg akan masukkan
    
    static final int MAKSIMUM_ITEM = 100;
    
    static String[] namaItem = new String[MAKSIMUM_ITEM];
    //dia bgtau dkt sini storage yg ada hanyalah 100
    // array 1 dimensi untuk simpan nama
    
    static int[][] detailItem = new int[MAKSIMUM_ITEM][2];
    //dia bgtau dkt sini storage yg ada hanyalah 100
    //array 2 dimensi
    //masukkan kuantiti dgn harga item
    //dkat array 2 dimensi 0 = storage 100,1 = storage 2
    
    
    //penambahan item
    public static void tambahItem(Scanner input){
    //ambil kembali scanner untuk scan input dari user
      if(pengiraanItem < MAKSIMUM_ITEM){
      //jika item yang ada kurang daripada jumlah maksimum yang ditetapkan
      
         System.out.print("Nama Item :");
         namaItem[pengiraanItem] = input.nextLine();
         //data akan masuk ke array namaItem 
         //pengiraan item akan bermula
         
         System.out.print("Harga Item: ");
         detailItem[pengiraanItem][0] = input.nextInt();
         // data akan masuk ke array detailItem 
         // pengiraan item akan mula dan dia ikut syarat MAKSIMUM_ITEM
         
         System.out.print("Kuantiti Item: ");
         detailItem[pengiraanItem][1] = input.nextInt();
         //data akan masuk ke detail item part ke dua@1
         input.nextLine();
         //bersihkan line tu
         
         System.out.print("Item Ditambah");
         pengiraanItem++;
         //lepas user add item maka jumlah item akan betambah
      }else{
          System.out.print("Data tidak boleh dimasukkkan kerana telah mencapai had kemasukan data");
      }
    }
    
    //paparan item
    public static void paparItem(){
        if(pengiraanItem == 0){
            System.out.println("Item tiada dalam inventori");
        }
        else{
            System.out.println("Senarai Item :");
            for(int x = 0;x < pengiraanItem;x++){
                System.out.printf("Nama: %s, Kuantiti: %d,Harga: %d\n", namaItem[x],detailItem[x][0],detailItem[x][1]);
                //keluarkan nama item dan maklumat item
                //cetak ikut format
            }
        }
    }
    
    //cari item ikut nama
    public static void cariItem(Scanner input){
    //panggil scanner untuk scan input dari user
      
      System.out.print("Nama Item yang hendak dicari :");
      String Nama = input.nextLine();
      //nama item yang hendak dicari
      
      boolean jumpa = true;
      
      for(int x = 0;x < pengiraanItem;x++){
          if(namaItem[x].equalsIgnoreCase(Nama)){
             //jika ada nama yang sama dalam array namaItem
             
             System.out.printf("Item yang dijumpai: Nama: %s, Kuantiti: %d, Harga: %d\n", namaItem[x], detailItem[x][0],detailItem[x][1]);
             //print ikut format
          }
      }
      if(!jumpa){
          System.out.println("Item Tidak Berjaya Dijumpai");
      }
    }
    
    //kira stok
    public static void kiraStok(){
        int jumlahStok = 0;
        //set total sbg 0 sbb belum kira
        
        for(int x = 0;x < pengiraanItem;x++){
            //jika dia kurang adalah 0
            //kurang drpd item yang ada
            //dia bertambah
            
            jumlahStok += detailItem[x][0];
            //dia akan loop dalam detailItem dkt 0
            //sbb itu ada simpan item yg ada
            //jd dia just kira berapa banyak item yg ada dkt situ shj
        }
        
        System.out.println("Jumlah Stok Keseluruhan: " + jumlahStok);
    }
    
    //cari item dengan harga tinggi/rendah
    public static void cariItemHargaTinggiRendah(){
        while(pengiraanItem == 0){
            System.out.println("Item tiada dalam inventori");
        }
        
        int hargaTinggi = 0,hargaRendah = 0;
        
        for(int x = 1;x < pengiraanItem;x++){
        //letak 1 untuk bagi dia ada nilai untuk perbandingan
           if(detailItem[x][1] > detailItem[hargaTinggi][1]){
               //jika harga dalam array detailItem lebih besar dari yang disetkan disini
               hargaTinggi = x;
               //maka harga dalam array detailItem lebih besar
           }
           if(detailItem[x][1] < detailItem[hargaTinggi][1]){
                //jika harga dalam array detailItem lebih kecil dari yang disetkan disini
                hargaRendah = x;
           }
        }
        
        System.out.printf("Item Harga Tertinggi: Nama: %s, Harga: %d\n", namaItem[hargaTinggi], detailItem[hargaTinggi][1]);
        System.out.printf("Item Harga Terendah: Nama: %s, Harga: %d\n", namaItem[hargaRendah], detailItem[hargaRendah][1]);
    }
    
    //menu
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pilihanMenu;
        
        do{
            System.out.println("Menu Utama:");
            System.out.println("1. Tambah Item");
            System.out.println("2. Papar Semua Item");
            System.out.println("3. Cari Item Berdasarkan Nama");
            System.out.println("4. Kira Jumlah Stok");
            System.out.println("5. Cari Item Harga Tertinggi/Terendah");
            System.out.println("6. Keluar");
            System.out.print("Pilih pilihan anda: ");
            pilihanMenu = input.nextInt();
            //int sbb user akan masukkan nombor
            input.nextLine();
            //buka ruang baru
            
            switch(pilihanMenu){
                case 1 :
                    tambahItem(input);
                    //user akan masukkan input
                    //panggil method untuk start fungsi
                    break;
                case 2 :
                    paparItem();
                    //panggil method untuk start fungsi
                    break;
                case 3 :
                    cariItem(input);
                    //user akan masukkan input
                    //panggil method untuk start fungsi
                    break;
                case 4 :
                    kiraStok();
                    //panggil method untuk start fungsi
                    break;
                case 5 :
                    cariItemHargaTinggiRendah();
                    //panggil method untuk start fungsi
                    break;
                case 6 :
                    System.out.print("Program Tamat");
                    break;
                default:
                    System.out.print("Pilihan Anda Tidak Sah");
            }
        }while(pilihanMenu != 6);
        //apabila pilihanMenu tidak seperti yang telah di set dalam sistem
    }
}
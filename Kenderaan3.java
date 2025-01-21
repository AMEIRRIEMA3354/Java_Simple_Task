class deklarasiKenderaan {
        //declaration
        String jenama;
        int tahun;
        
        //Constructor tetapkan nilai
        //this merujuk kpd objek
        deklarasiKenderaan(){
        //nama constructor kena sama dgn nama class
        //amik nama yg sama supaya dia boleh pegang nilai yg ada dlm class tersebut
            this.jenama = "Proton";
            this.tahun = 2025;
        }
        
        //create method
        //untuk paparkan method kita boleh gunakan objek
        void paparMaklumat(){
            System.out.println("Jenama: " + jenama);
            System.out.println("Tahun: " + tahun);
        }
}
 public class Kenderaan3 {
        public static void main(String[] args){
            //objek
            //namaClass.namaObjek = new namaClass();
            deklarasiKenderaan kenderaan1 = new deklarasiKenderaan();
            
            //panggil kaedah@method
            //namaObjek.namaMethod();
            kenderaan1.paparMaklumat();
        }
    }




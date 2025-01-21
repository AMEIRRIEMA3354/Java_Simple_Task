class deklarasiKenderaan {
        //declaration
        String jenama;
        int tahun;
        
        //create method
        //untuk paparkan method kita boleh gunakan objek
        void paparMaklumat(){
            System.out.println("Jenama: " + jenama);
            System.out.println("Tahun: " + tahun);
        }
}
 public class Kenderaan {
        public static void main(String[] args){
            //objek
            deklarasiKenderaan kenderaan1 = new deklarasiKenderaan();
            
            //memberi nilai
            kenderaan1.jenama = "Proton";
            kenderaan1.tahun = 2025;
            
            //panggil kaedah@method
            kenderaan1.paparMaklumat();
        }
    }


class Kenderaan {
    String jenama;
    int tahun;
    
    void paparMaklumat(){
        System.out.println(jenama);
        System.out.println(tahun);
    }
    
    void ciptaObjeklain(){
        Kenderaan kenderaan1 = new Kenderaan();
        //tukang panggil
        //di create utk membolehkan data dari method lain dipanggil
        kenderaan1.jenama = "Proton";
        kenderaan1.tahun = 2025;
        kenderaan1.paparMaklumat();
        //guna objek utk panggil method paparMaklumat
        //panggil sbb dia pegang jenama dgn tahun yg merupakan deklarasi
    }
}
public class Kenderaan2 {
    public static void main(String[] args){
        
        Kenderaan ujian = new Kenderaan();
        //kena create objek baru utk panggil method sbb dkt objek yg dalam class Kenderaan xdk static
        //tukang panggil
        ujian.ciptaObjeklain();
        //guna objek ujian utk panggil data di ciptaObjeklain
    }
}

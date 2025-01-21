class deklarasialatTulis {
    String jenama = "Penny";
    static String nama = "Pensil";
    
    //create objek dalam class yang bukan main
    static deklarasialatTulis pensil = new deklarasialatTulis();
    //static membolehkan ktia panggil data tanpa create objek baru
    
    //untuk paparkan method kita boleh gunakan objek
    void paparMaklumat(){
        System.out.println("Jenama: " + jenama);
        System.out.println("Nama: " + nama);
    }
}
public class alatTulis{
    public static void main(String[] args){
        deklarasialatTulis.pensil.paparMaklumat();
    }
}

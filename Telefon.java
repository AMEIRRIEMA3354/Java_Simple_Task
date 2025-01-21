class deklarasiTelefon {
    String model;
    int harga;
    
    //untuk paparkan method kita boleh gunakan objek
    void paparMaklumat(){
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
    }
}
public class Telefon {
    public static void main(String[] args){
        deklarasiTelefon phone = new deklarasiTelefon();
        
        phone.model = "SamshengJr";
        phone.harga = 500;
        
        phone.paparMaklumat();
    }
}


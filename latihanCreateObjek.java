class Telefon{
    //tetapkan nilai untuk model dan harga
    String model;
    int harga;
    
    //cipta objek daripada kelas Telefon dan tanpa menggunakan kaedah main
    static Telefon item = new Telefon();
    
    //Constructor memberi nilai kepada atribut
    Telefon(){
        this.model = "Iphone 6";
        this.harga = 6000;
    }
    
    //method paparan
    void paparMaklumat(){
        System.out.println("Model Telefon: " + model);
        System.out.println("Harga Telefon: " + harga);
    }
    
}
public class latihanCreateObjek {
    public static void main(String[] args){
        //panggil data
        Telefon.item.paparMaklumat();
    }
}

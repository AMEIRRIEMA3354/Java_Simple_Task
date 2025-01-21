public class voidPublicVoidExample {
    void kaedahDefault(){
        System.out.println("Kaedah ini hanya boleh diakses dalam pakej yang sama");
        
    }
    public void kaedahPublic(){
         System.out.println("Kaedah ini hanya boleh diakses dalam pakej yang sama2");
    }
    
    public static void main(String[] args){
        voidPublicVoidExample contoh = new voidPublicVoidExample();
        //kena ambil nama public class
        //Jika terdapat satu kelas dengan pengubah akses public dalam fail, 
        //nama fail mesti sama dengan nama kelas public
        contoh.kaedahDefault();
        contoh.kaedahPublic();
    }
}

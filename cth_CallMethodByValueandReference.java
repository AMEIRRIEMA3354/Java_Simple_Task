//Panggilan Kaedah oleh Nilai
//Pass By Value
//apabila argumen@nilai/data dihantar ke dalam kaedah,yang dihantar adalah salinan dan bukan argumen sebenar
//jika argumen adalah jenis primitif(int,double,boolean,dll)maka nilai sebenar akan dihantar
//perubahan pd nilai dlm kaedah tidak akan pengaruhi argumen asal
class cth_CallMethodByValueandReference {
    
    //x adalah 20 dalam method ubahNilai
    //x adalah salinan sahaja
    void ubahNilai(int x){
        x = 20;
        //hanya boleh digunakan dlm ubahNilai
        //xleh diakses di luar kaedah
        //perubahan dkt (X) xpengaruhi nombor sbb Java htr salinan nilai bukan rujukan kpd nilai asal
    }
    
    public static void main(String[]args){
        int nombor = 10;
        //nilai asal dlm main xleh berubah sbb x adalah salinan shj
        cth_CallMethodByValueandReference example = new cth_CallMethodByValueandReference();
        example.ubahNilai(nombor);
        //hantar salinan nombor ke kaedah
        //dia panggil method ubahNilai utk paparkan nombor yg ada dkt main
        //jd dia mcm tukar shj
        //objek example panggil ubahNilai utk paparkan nombor
        System.out.println("Nilai asal: " +nombor);
        //hasil akan memaparkan int nombor shj sbb int x hanya wujud dlm ubahNilai yang tidak boleh diakses dr luar kaedah tersebut
    }
}

package Abstrak;

// extends = mengikuti kelas daftar
public class proses extends daftar {

    // panggil method abstrak dari daftar
    public void isiData() {
        
        // mengisi data method isiData
        System.out.println("Isi Data");
        System.out.println(" ");

        System.out.println("Nama Lengkap: Kentjana ");
        
        System.out.println("Nama Panggilan: Ken");
        
        System.out.println("Jenis Kelamin: Laki - Laki");
        
        System.out.println("Tempat Lahir: Malang");
        
        System.out.println("Tanggal Lahir: 31 Januari 2005");
        
        System.out.println("Nomor Handphone: 09876543210");
        
        System.out.println("SMP Asal : SMPN 1 Malang");
        
        System.out.println("Alamat Lengkap : Jalan Kencana No.1");
        

        // Input Data Orang Tua
        System.out.println(" ");
        System.out.println("Data Orang Tua");

        System.out.println("Nama Ayah : Budi");
        
        System.out.println("Nama Ibu : Budian");
        
        System.out.println("Pekerjaan Ayah : Programmer");
        
        System.out.println("Pekerjaan Ibu : Guru");
        
    }

    //  method penghasilan
    public void penghasilan(){
        // deklarasi variabel penghasilan
        int penghasilanAyah = 4500000, penghasilanIbu = 3000000;        
        // mengisi data method penghasilan
        System.out.println("Penghasilan Ayah : "+penghasilanAyah);
        
        System.out.println("Penghasilan Ibu : "+penghasilanIbu);
        

        System.out.println(" ");

        // percabangan untuk pembayaran SPP dari total penghasilan
        int SPP;
        int total = penghasilanAyah + penghasilanIbu;
        if (total < 5000000) {
            SPP = 200000;
            System.out.println("Selamat Anda diterima!");
            System.out.println("Dan WAJIB membayar SPP diawal sebesar Rp." + SPP);
        } else if(total < 10000000){
            SPP = 300000;
            System.out.println("Selamat Anda diterima!");
            System.out.println("Dan WAJIB membayar SPP diawal sebesar Rp." + SPP);
        } else if(total< 15000000){
            SPP = 400000;
            System.out.println("Selamat Anda diterima!");
            System.out.println("Dan WAJIB membayar SPP diawal sebesar Rp." + SPP);
        } else if(total < 20000000){
            SPP = 500000;
            System.out.println("Selamat Anda diterima!");
            System.out.println("Dan WAJIB membayar SPP diawal sebesar Rp." + SPP);
        } else if(total > 20000000){
            SPP = 600000;
            System.out.println("Selamat Anda diterima!");
            System.out.println("Dan WAJIB membayar SPP diawal sebesar Rp." + SPP);
        } else {
            System.out.println("Maaf Anda tidak diterima!");
        }

    }

}
    


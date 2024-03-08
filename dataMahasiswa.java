package StudiKasusDua;

import java.util.ArrayList;
import java.util.Scanner;

public class dataMahasiswa {
    private ArrayList<mahasiswa> data = new ArrayList<>();
    public void tambahData(){
        Scanner bella = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = bella.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = bella.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = bella.nextLine();
        data.add(new mahasiswa(nim,nama,alamat));
    }
    public void tampilData(){
        System.out.println("==================================");
        for (mahasiswa mhsw : data) {
            System.out.println(mhsw.getNim() + " | "+ mhsw.getNama() + " | " + mhsw.getAlamat());
        }
    }

    public static void main(String[] args) {
        dataMahasiswa dataMahasiswa = new dataMahasiswa();
        boolean next = true;
        Scanner bella = new Scanner(System.in);
        while (next){
            dataMahasiswa.tambahData();
            System.out.print("Tambah lagi? (t/n): ");
            String tambah = bella.nextLine();
            if (tambah.equalsIgnoreCase("t")){
                next = false;
            }
        }
        dataMahasiswa.tampilData();
    }
}

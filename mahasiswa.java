package StudiKasusDua;

import java.lang.*;

class mahasiswa {
    private String nim;
    private String nama;
    private String alamat;

    public mahasiswa(String nim, String nama, String alamat) {
        this.nim =  nim;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}

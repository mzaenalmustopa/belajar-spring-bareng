package com.spingdasar.modelsabil;

public class Anak {
    private String nama;
    private String umur;
    private String jk;
    private String alamat;

    public Anak(String nama, String umur, String jk, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.jk = jk;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

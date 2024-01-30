package com.spingdasar.model;

public class Orang {
    private String nama;
    private String jk;
    private String umur;
    private Alamat alamat;

    public Orang(String nama, String jk, String umur, Alamat alamat) {
        this.nama = nama;
        this.jk = jk;
        this.umur = umur;
        this.alamat = alamat;
    }

    public Orang(String nama, String jk) {
        this.nama =nama;
        this.jk = jk;
    }

    public Orang(String nama, String jk, String umur) {
        this.nama = nama;
        this.jk = jk;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
}

package com.spingdasar.model;

public class Kampus {
    private String nama;
    private String alamat;
    private String rektor;

    public Kampus(String nama, String alamat, String rektor) {
        this.nama = nama;
        this.alamat = alamat;
        this.rektor = rektor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRektor() {
        return rektor;
    }

    public void setRektor(String rektor) {
        this.rektor = rektor;
    }
}

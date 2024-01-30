package com.spingdasar.modelsabil;

import com.spingdasar.model.Alamat;

public class Ayah {
    private String nama;
    private String umur;
    private String jk;
    private Alamat alamat;

    public Ayah(String nama, String umur, String jk, Alamat alamat) {
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

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
}

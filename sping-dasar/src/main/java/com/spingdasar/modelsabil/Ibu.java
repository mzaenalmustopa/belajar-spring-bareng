package com.spingdasar.modelsabil;

import com.spingdasar.model.Alamat;

public class Ibu{
    private String nama;
    private String umur;
    private String jk;
    private Anak anak;
    private Ayah ayah;
    private Alamat alamat;

    public Ibu(String nama, String umur, String jk, Anak anak, Ayah ayah, Alamat alamat) {
        this.nama = nama;
        this.umur = umur;
        this.jk = jk;
        this.anak = anak;
        this.ayah = ayah;
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

    public Anak getAnak() {
        return anak;
    }

    public void setAnak(Anak anak) {
        this.anak = anak;
    }

    public Ayah getAyah() {
        return ayah;
    }

    public void setAyah(Ayah ayah) {
        this.ayah = ayah;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
}

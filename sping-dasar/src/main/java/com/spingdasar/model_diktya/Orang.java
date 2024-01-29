package com.spingdasar.model_diktya;

import java.util.List;

public class Orang extends Alamat {
    private String nama;
    private String jk;
    private String umur;
    private Alamat alamat;

    public Orang(String noBlok, String jalan, String dusun, String desa, String kecamatan, String provinsi, String negara, String nama, String jk, String umur, Alamat alamat) {
        super(noBlok, jalan, dusun, desa, kecamatan, provinsi, negara);
        this.nama = nama;
        this.jk = jk;
        this.umur = umur;
        this.alamat = alamat;
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

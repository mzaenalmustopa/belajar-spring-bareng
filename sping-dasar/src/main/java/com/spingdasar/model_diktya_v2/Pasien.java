package com.spingdasar.model_diktya_v2;

public class Pasien extends Orang{
    private String kode;
    private String pembayaran;
    private String kelas;

    public Pasien(String nama, String jk, String umur, Alamat alamat, String kode, String pembayaran, String kelas) {
        super(nama, jk, umur, alamat);
        this.kode = kode;
        this.pembayaran = pembayaran;
        this.kelas = kelas;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}

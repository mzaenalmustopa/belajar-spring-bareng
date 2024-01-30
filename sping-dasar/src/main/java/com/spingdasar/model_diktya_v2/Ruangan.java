package com.spingdasar.model_diktya_v2;

import java.util.List;

public class Ruangan {
    private String kode;
    private String namaRuangan;
    private Dokter dokter;
    private List<Pasien> pasiens;

    public Ruangan(String kode, String namaRuangan, Dokter dokter, List<Pasien> pasiens) {
        this.kode = kode;
        this.namaRuangan = namaRuangan;
        this.dokter = dokter;
        this.pasiens = pasiens;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public List<Pasien> getPasiens() {
        return pasiens;
    }

    public void setPasiens(List<Pasien> pasiens) {
        this.pasiens = pasiens;
    }
}

package com.spingdasar.model_diktya_v2;

public class Alamat {

    private String no;
    private String jalan;
    private String dusun;
    private String desa;
    private String kecamatan;
    private String kota;
    private String provinsi;
    private String negara;

    public Alamat(String no, String jalan, String dusun, String desa, String kecamatan, String kota, String provinsi, String negara) {
        this.no = no;
        this.jalan = jalan;
        this.dusun = dusun;
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.kota = kota;
        this.provinsi = provinsi;
        this.negara = negara;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getJalan() {
        return jalan;
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public String getDusun() {
        return dusun;
    }

    public void setDusun(String dusun) {
        this.dusun = dusun;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }
}

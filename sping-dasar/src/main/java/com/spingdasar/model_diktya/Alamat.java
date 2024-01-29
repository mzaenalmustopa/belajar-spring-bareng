package com.spingdasar.model_diktya;

public class Alamat {
    private String noBlok;
    private String jalan;
    private String dusun;
    private String desa;
    private String kecamatan;
    private String provinsi;
    private String negara;

    public Alamat(String noBlok, String jalan, String dusun, String desa, String kecamatan, String provinsi, String negara) {
        this.noBlok = noBlok;
        this.jalan = jalan;
        this.dusun = dusun;
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.provinsi = provinsi;
        this.negara = negara;
    }

    public String getNoBlok() {
        return noBlok;
    }

    public void setNoBlok(String noBlok) {
        this.noBlok = noBlok;
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

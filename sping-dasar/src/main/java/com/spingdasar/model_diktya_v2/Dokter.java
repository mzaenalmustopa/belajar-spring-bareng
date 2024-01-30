package com.spingdasar.model_diktya_v2;

public class Dokter extends Orang{

    private String kode;
    private String jenisPraktek;
    private WaktuPraktek waktuPraktek;

    public Dokter(String nama, String jk, String umur, Alamat alamat, String kode, String jenisPraktek, WaktuPraktek waktuPraktek) {
        super(nama, jk, umur, alamat);
        this.kode = kode;
        this.jenisPraktek = jenisPraktek;
        this.waktuPraktek = waktuPraktek;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }


    public String getJenisPraktek() {
        return jenisPraktek;
    }

    public void setJenisPraktek(String jenisPraktek) {
        this.jenisPraktek = jenisPraktek;
    }

    public WaktuPraktek getWaktuPraktek() {
        return waktuPraktek;
    }

    public void setWaktuPraktek(WaktuPraktek waktuPraktek) {
        this.waktuPraktek = waktuPraktek;
    }
}

package com.spingdasar.model;

public class Matakuliah {

    private String kode;
    private String name;
    private String sks;

    public Matakuliah(String kode, String name, String sks) {
        this.kode = kode;
        this.name = name;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }
}

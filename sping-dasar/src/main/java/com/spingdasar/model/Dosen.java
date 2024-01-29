package com.spingdasar.model;

public class Dosen extends Orang {

    private String title;
    private String nip;

    public Dosen(String nama, String jk, String umur, String alamat, String title, String nip) {
        super(nama, jk, umur, alamat);
        this.title = title;
        this.nip = nip;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}

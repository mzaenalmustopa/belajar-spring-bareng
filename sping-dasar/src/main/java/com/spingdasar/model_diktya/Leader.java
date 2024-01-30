package com.spingdasar.model_diktya;

import java.util.List;

public class Leader extends Orang{
    private String nip;
    private String title;
    private String experince;

    public Leader(String nama, String jk, String umur,  String nip, String title, String experince, Alamat alamat) {
        super(nama, jk, umur, alamat);
        this.nip = nip;
        this.title = title;
        this.experince = experince;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExperince() {
        return experince;
    }

    public void setExperince(String experince) {
        this.experince = experince;
    }
}

package com.spingdasar.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dosen extends Orang {

    private String title;
    private String nip;

    public Dosen(String nama, String jk, String umur, Alamat alamat, String title, String nip) {
        super(nama, jk, umur, alamat);
        this.title = title;
        this.nip = nip;
    }
}

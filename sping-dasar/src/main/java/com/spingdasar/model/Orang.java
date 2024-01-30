package com.spingdasar.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orang {
    private String nama;
    private String jk;
    private String umur;
    private Alamat alamat;

    public Orang(String nama, String jk, String umur) {
        this.nama = nama;
        this.jk = jk;
        this.umur = umur;
    }

    public Orang(String nama, String jk) {
        this.nama = nama;
        this.jk = jk;
    }
}

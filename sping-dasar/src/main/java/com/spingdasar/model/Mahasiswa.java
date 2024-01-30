package com.spingdasar.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mahasiswa extends Orang {
    private String jurusan;
    private String fakultas;
    private Integer semester;

    public Mahasiswa(String nama, String jk,String umur, String jurusan, String fakultas, Integer semester) {
        super(nama, jk, umur);
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.semester = semester;
    }

    public Mahasiswa(String nama, String jk, String umur, Alamat alamat, String jurusan, String fakultas, Integer semester) {
        super(nama, jk,umur, alamat);
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.semester = semester;
    }
}

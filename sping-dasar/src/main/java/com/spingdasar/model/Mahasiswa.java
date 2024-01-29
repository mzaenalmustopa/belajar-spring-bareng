package com.spingdasar.model;

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

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }
}

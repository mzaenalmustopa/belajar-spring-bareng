package com.spingdasar.model_diktya;

import java.util.List;

public class Operator extends Orang{
    private String kodeOpt;
    private String shift;
    private String noLine;

    public Operator(String noBlok, String jalan, String dusun, String desa, String kecamatan, String provinsi, String negara, String nama, String jk, String umur, List<Alamat> alamat, String kodeOpt, String shift, String noLine) {
        super(noBlok, jalan, dusun, desa, kecamatan, provinsi, negara, nama, jk, umur, alamat);
        this.kodeOpt = kodeOpt;
        this.shift = shift;
        this.noLine = noLine;
    }

    public String getKodeOpt() {
        return kodeOpt;
    }

    public void setKodeOpt(String kodeOpt) {
        this.kodeOpt = kodeOpt;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getNoLine() {
        return noLine;
    }

    public void setNoLine(String noLine) {
        this.noLine = noLine;
    }
}

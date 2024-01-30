package com.spingdasar.model_diktya;

import java.util.List;

public class Operator extends Orang{
    private String kodeOpt;
    private String shift;
    private String noLine;

    public Operator(String nama, String jk, String umur, Alamat alamat, String kodeOpt, String shift, String noLine) {
        super(nama, jk, umur, alamat);
        this.kodeOpt = kodeOpt;
        this.shift = shift;
        this.noLine = noLine;
    }

    public Operator(String nama, String jk, String umur, String kodeOpt, String shift, String noLine) {
        super(nama, jk, umur);
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

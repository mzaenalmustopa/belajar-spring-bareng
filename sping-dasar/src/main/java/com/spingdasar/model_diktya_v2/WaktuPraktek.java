package com.spingdasar.model_diktya_v2;

public class WaktuPraktek {

    private String absensi;
    private String jamPraktek1;
    private String jamPraktek2;

    public WaktuPraktek(String absensi, String jamPraktek1, String jamPraktek2) {
        this.absensi = absensi;
        this.jamPraktek1 = jamPraktek1;
        this.jamPraktek2 = jamPraktek2;
    }

    public String getAbsensi() {
        return absensi;
    }

    public void setAbsensi(String absensi) {
        this.absensi = absensi;
    }

    public String getJamPraktek1() {
        return jamPraktek1;
    }

    public void setJamPraktek1(String jamPraktek1) {
        this.jamPraktek1 = jamPraktek1;
    }

    public String getJamPraktek2() {
        return jamPraktek2;
    }

    public void setJamPraktek2(String jamPraktek2) {
        this.jamPraktek2 = jamPraktek2;
    }
}

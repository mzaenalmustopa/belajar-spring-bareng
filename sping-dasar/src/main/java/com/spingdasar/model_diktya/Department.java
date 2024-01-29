package com.spingdasar.model_diktya;

import java.util.List;

public class Department {

    private String kode;
    private Leader leader;
    private List<Operator> operators;

    public Department(String kode, Leader leader, List<Operator> operators) {
        this.kode = kode;
        this.leader = leader;
        this.operators = operators;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public List<Operator> getOperators() {
        return operators;
    }

    public void setOperators(List<Operator> operators) {
        this.operators = operators;
    }
}

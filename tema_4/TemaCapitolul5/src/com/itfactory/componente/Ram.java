package com.itfactory.componente;

public class Ram {
    private String tipMemorie;
    private String unitateMasura;
    private int capacitateMemorie;

    public Ram(String tipMemorie, String unitateMasura, int capacitateMemorie) {
        this.tipMemorie = tipMemorie;
        this.unitateMasura = unitateMasura;
        this.capacitateMemorie = capacitateMemorie;
    }

    public String getTipMemorie() {
        return tipMemorie;
    }

    public void setTipMemorie(String tipMemorie) {
        this.tipMemorie = tipMemorie;
    }

    public String getUnitateMasura() {
        return unitateMasura;
    }

    public void setUnitateMasura(String unitateMasura) {
        this.unitateMasura = unitateMasura;
    }

    public int getCapacitateMemorie() {
        return capacitateMemorie;
    }

    public void setCapacitateMemorie(int capacitateMemorie) {
        this.capacitateMemorie = capacitateMemorie;
    }
}

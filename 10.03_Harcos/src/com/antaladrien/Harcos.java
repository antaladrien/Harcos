package com.antaladrien;

public class Harcos {
    private String nev;
    private int eletero;
    private int harciero;

    public Harcos(String nev, int eletero, int harciero) {
        this.nev = nev;
        this.eletero = eletero;
        this.harciero = harciero;
    }

    public int getEletero() {
        return eletero;
    }

    public int getHarciero() {
        return harciero;
    }

    public void sebzodik(int eletero) {
        this.eletero -= eletero;
    }

    public boolean harcol(Harcos h) {
        this.sebzodik(h.getHarciero());
        h.sebzodik(this.getHarciero());
        if (this.getHarciero() < 1 || h.getEletero() < 1)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return nev + " (harcierő: " + getHarciero() + ", életerő: " + getEletero() + ")";
    }
}

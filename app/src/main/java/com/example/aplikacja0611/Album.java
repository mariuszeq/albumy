package com.example.aplikacja0611;

public class Album {
    private String wykonawca;
    private String nazwa;
    private int rok;
    private int liczbaUtworow;
    private int pobrania;

    public Album(String wykonawca, String nazwa, int rok, int liczbaUtworow, int pobrania) {
        this.wykonawca = wykonawca;
        this.nazwa = nazwa;
        this.rok = rok;
        this.liczbaUtworow = liczbaUtworow;
        this.pobrania = pobrania;
    }

    public void zwiekszPobrania(){
        pobrania++;
    }



    public String getWykonawca() {
        return wykonawca;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getRok() {
        return rok;
    }

    public int getLiczbaUtworow() {
        return liczbaUtworow;
    }

    public int getPobrania() {
        return pobrania;
    }
}

package com.lospibescompany.listview;

public class Consola {
    private int foto;
    private String consola;
    private int año;

    public Consola(int foto, String consola, int año) {
        this.foto = foto;
        this.consola = consola;
        this.año = año;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}

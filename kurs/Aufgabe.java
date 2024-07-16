package kurs;

import java.time.LocalDate;

public class Aufgabe {
    private int aufgabeID;
    private String beschreiben;
    private LocalDate dauern;

    public Aufgabe(int aufgabeID, String beschreiben, LocalDate dauern) {
        this.aufgabeID = aufgabeID;
        this.beschreiben = beschreiben;
        this.dauern = dauern;
    }

    public int getAufgabeID() {
        return aufgabeID;
    }

    public void setAufgabeID(int aufgabeID) {
        this.aufgabeID = aufgabeID;
    }

    public String getBeschreiben() {
        return beschreiben;
    }

    public void setBeschreiben(String beschreiben) {
        this.beschreiben = beschreiben;
    }

    public LocalDate getDauern() {
        return dauern;
    }

    public void setDauern(LocalDate dauern) {
        this.dauern = dauern;
    }

}

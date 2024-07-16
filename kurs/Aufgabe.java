package kurs;

import java.time.LocalDate;

public class Aufgabe {
    private int aufgabeID;
    private static int nextId;
    private String beschreiben;
    private LocalDate dauern;


    public Aufgabe(String beschreiben, LocalDate dauern) {
        this.aufgabeID = this.generateUniqueId();
        this.beschreiben = beschreiben;
        this.dauern = dauern;
    }

    private synchronized int generateUniqueId() {
        return nextId++;
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

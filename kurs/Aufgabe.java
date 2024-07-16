package kurs;

import java.time.LocalDate;

public class Aufgabe {
    private int aufgabeID;
    private static int nextId;
    private String beschreiben;
    private LocalDate dauern;

<<<<<<< HEAD

    public Aufgabe(int aufgabeID, String beschreiben, LocalDate dauern) {
        this.aufgabeID = aufgabeID;
=======
    public Aufgabe(String beschreiben, LocalDate dauern) {
        this.aufgabeID = this.generateUniqueId();
>>>>>>> 8b3efb7e4f82d610d6003fac5d54aa0f5e3b0904
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

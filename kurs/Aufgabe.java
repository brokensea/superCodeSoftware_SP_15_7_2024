package kurs;

import java.time.LocalDate;

import enumKlass.ModulName;

public class Aufgabe {
    private int aufgabeID;
    private static int nextId;
    private String beschreiben;
    private int dauern;

    private ModulName modulname;

    // private ModulName aufgabeType;

    

    public Aufgabe(String beschreiben, int dauern, ModulName modulname) {
        this.aufgabeID = this.generateUniqueId();
        this.beschreiben = beschreiben;
        this.dauern = dauern;
        this.modulname = modulname;
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

    public int getDauern() {
        return dauern;
    }

    public void setDauern(int dauern) {
        this.dauern = dauern;
    }

    public ModulName getModulname() {
        return modulname;
    }

    public void setModulname(ModulName modulname) {
        this.modulname = modulname;
    }

    public String toString() {
        return "Aufgabe{" +
                "aufgabeID=" + aufgabeID +
                ", beschreiben='" + beschreiben + '\'' +
                ", dauern=" + dauern +
                '}';
    }

}

package kurs;

import java.time.LocalDate;
import java.util.ArrayList;

import enumKlass.ModulName;
import person.Mitarbeiter;

public class Modul {
    private LocalDate startDatum;
    private LocalDate endDatum;
    private int tageAnzahl;
    private boolean lizenzen;
    private ModulName modulType;
    private ArrayList<Aufgabe> aufgabenList;
    private ArrayList<Mitarbeiter> trainierList;

    public Modul(LocalDate startDatum, LocalDate endDatum, int tageAnzahl, boolean lizenzen,
            ModulName modulType, ArrayList<Aufgabe> aufgabenList, ArrayList<Mitarbeiter> trainierList) {

        this.startDatum = startDatum;
        this.endDatum = endDatum;
        this.tageAnzahl = tageAnzahl;
        this.lizenzen = lizenzen;
        this.modulType = modulType;
        this.aufgabenList = aufgabenList;
        this.trainierList = trainierList;
    }

    public ModulName getModulName() {
        return modulType;
    }

    public void setModulName(ModulName modulType) {
        this.modulType = modulType;
    }

    public LocalDate getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(LocalDate startDatum) {
        this.startDatum = startDatum;
    }

    public LocalDate getEndDatum() {
        return endDatum;
    }

    public void setEndDatum(LocalDate endDatum) {
        this.endDatum = endDatum;
    }

    public int getTageAnzahl() {
        return tageAnzahl;
    }

    public void setTageAnzahl(int tageAnzahl) {
        this.tageAnzahl = tageAnzahl;
    }

    public boolean isLizenzen() {
        return lizenzen;
    }

    public void setLizenzen(boolean lizenzen) {
        this.lizenzen = lizenzen;
    }

    public ModulName getModulType() {
        return modulType;
    }

    public void setModulType(ModulName modulType) {
        this.modulType = modulType;
    }

    public ArrayList<Aufgabe> getAufgabenList() {
        return aufgabenList;
    }

    public void setAufgabenList(ArrayList<Aufgabe> aufgabenList) {
        this.aufgabenList = aufgabenList;
    }

    public ArrayList<Mitarbeiter> getTrainierList() {
        return trainierList;
    }

    public void setTrainierList(ArrayList<Mitarbeiter> trainierList) {
        this.trainierList = trainierList;
    }
}

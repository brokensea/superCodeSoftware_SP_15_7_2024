package kurs;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.Period;
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

<<<<<<< HEAD
    

    public Modul(LocalDate startDatum, LocalDate endDatum,  boolean lizenzen,
=======
    public Modul(LocalDate startDatum, LocalDate endDatum, boolean lizenzen,
>>>>>>> main
            ModulName modulType, ArrayList<Aufgabe> aufgabenList, ArrayList<Mitarbeiter> trainierList) {

        Period period = Period.between(startDatum, endDatum);
        this.tageAnzahl = period.getDays();
        this.startDatum = startDatum;
        this.endDatum = endDatum;
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

    public boolean hasLizenz(Mitarbeiter mitarbeiter) {
        return mitarbeiter.getLizenzenList().contains(this);
    }

    public void addAufgabe(Aufgabe aufgabe) {
        this.aufgabenList.add(aufgabe);
    }
    // Method

    public Aufgabe pruefenTagMindsterAufgabe() {
        Aufgabe minTagAufgabe = this.aufgabenList.get(0);
        for (Aufgabe aufgabe : aufgabenList) {
            if (minTagAufgabe.getDauern().compareTo(aufgabe.getDauern()) == 1) {
                minTagAufgabe = aufgabe;
            }
        }
        return minTagAufgabe;
    }

    // später
    // Ein Modul nicht viel Mitabeiter
    private boolean pruefenObTrainerWechselZuviel() {
        return false;
    }
}
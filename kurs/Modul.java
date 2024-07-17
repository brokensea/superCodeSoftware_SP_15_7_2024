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
    private ModulName modulType;
    private ArrayList<Aufgabe> aufgabenList;//  ohne aufgabenList mit kategorie (wie viel tagen und vie viel aufgaben?)
    private ArrayList<Mitarbeiter> trainierList;

    public Modul(LocalDate startDatum, LocalDate endDatum,
            ModulName modulType, ArrayList<Aufgabe> aufgabenList) {

        // ArrayList<Mitarbeiter> trainierList

        Period period = Period.between(startDatum, endDatum);// period ohne wochenende
        this.tageAnzahl = period.getDays();
        this.startDatum = startDatum;
        this.endDatum = endDatum;
        this.modulType = modulType;
        this.aufgabenList = aufgabenList;
        this.trainierList = new ArrayList<>();
        // this.trainierList = trainierList;
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

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        this.trainierList.add(mitarbeiter);
    }
    // Method

    public Aufgabe pruefenTagMindsterAufgabe() {
        Aufgabe minTagAufgabe = this.aufgabenList.get(0);
        for (Aufgabe aufgabe : aufgabenList) {
            if (minTagAufgabe.getDauern() > aufgabe.getDauern()) {
                minTagAufgabe = aufgabe;
            }
        }
        return minTagAufgabe;
    }

    private boolean pruefenObTrainerWechselZuviel() {
        if (trainierList.size() < 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Modul{" +
                "startDatum=" + startDatum +
                ", endDatum=" + endDatum +
                ", tageAnzahl=" + tageAnzahl +
                ", modulType=" + modulType +
                ", aufgabenList=" + aufgabenList +
                ", trainierList=" + trainierList +
                '}';
    }
}
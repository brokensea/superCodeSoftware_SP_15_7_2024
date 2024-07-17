package kurs;

import java.lang.reflect.Method;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import enumKlass.ModulName;
import person.Mitarbeiter;

public class Modul {
    private LocalDate startDatum;
    private LocalDate endDatum;
    private int tageAnzahl;
    private ModulName modulName;
    private ArrayList<Aufgabe> aufgabenList;
    // ohne aufgabenList mit kategorie (wie viel tagen und vie viel aufgaben?)
    private Mitarbeiter trainier;

    public Modul(LocalDate startDatum, LocalDate endDatum,
            ModulName modulName, ArrayList<Aufgabe> aufgabenList) {
        isWeekend(startDatum);
        isWeekend(endDatum);
        this.tageAnzahl = calculateWeekdaysBetween(startDatum, endDatum);
        this.startDatum = startDatum;
        this.endDatum = endDatum;
        this.modulName = modulName;
        this.aufgabenList = aufgabenList;
        // this.trainierList = trainierList;
    }

    public ModulName getModulName() {
        return modulName;
    }

    public void setModulName(ModulName modulName) {
        this.modulName = modulName;
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

    public ArrayList<Aufgabe> getAufgabenList() {
        return aufgabenList;
    }

    public void setAufgabenList(ArrayList<Aufgabe> aufgabenList) {
        this.aufgabenList = aufgabenList;
    }

    public boolean hasLizenz(Mitarbeiter mitarbeiter) {
        return mitarbeiter.getLizenzenList().contains(this);
    }

    public void addAufgabe(Aufgabe aufgabe) {
        this.aufgabenList.add(aufgabe);
    }

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        this.trainier = mitarbeiter;
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

    public boolean isWeekend(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            throw new IllegalArgumentException(date + " is a weekend.");
        }

        return false;
    }

    public static int calculateWeekdaysBetween(LocalDate startDatum, LocalDate endDatum) {

        long totalDays = ChronoUnit.DAYS.between(startDatum, endDatum);
        long weekdays = 0;

        for (long i = 0; i <= totalDays; i++) {
            LocalDate currentDate = startDatum.plusDays(i);
            DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
            if (dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY) {
                weekdays++;
            }
        }

        return (int) weekdays;
    }

    @Override
    public String toString() {
        return "Modul{" +
                "startDatum=" + startDatum +
                ", endDatum=" + endDatum +
                ", tageAnzahl=" + tageAnzahl +
                ", modulType=" + modulName +
                ", aufgabenList=" + aufgabenList +
                ", trainier=" + trainier +
                '}';
    }
}
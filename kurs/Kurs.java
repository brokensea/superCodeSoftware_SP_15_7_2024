package kurs;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import person.*;
import enumKlass.Bewertung;

public class Kurs {

    private int kursId;
    private static int nextId = 1;

    private String kursName;
    private LocalDate startDatum;
    private LocalDate endDatum;
    private int tageAnzahl;
    private ArrayList<Teilnehmer> teilNehmerList;
    private ArrayList<Mitarbeiter> mitarbeiterList;
    private ArrayList<Modul> modulList;
    private ArrayList<String> rueckmeldungList;

    public Kurs(String kursName, LocalDate startDatum, LocalDate endDatum) {
        // rechnen Tagen
        Period period = Period.between(startDatum, endDatum);
        this.tageAnzahl = period.getDays();
        this.kursName = kursName;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
        this.teilNehmerList = new ArrayList<>();
        this.mitarbeiterList = new ArrayList<>();
        this.modulList = new ArrayList<>();
        this.rueckmeldungList = new ArrayList<>();
        this.kursId = this.generateUniqueId();
    }

    // get and set

    public int getKursId() {
        return kursId;
    }

    public void setKursId(int kursId) {
        this.kursId = kursId;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Kurs.nextId = nextId;
    }

    public String getKursName() {
        return kursName;
    }

    public void setKursName(String kursName) {
        this.kursName = kursName;
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

    public ArrayList<Teilnehmer> getTeilNehmerList() {
        return teilNehmerList;
    }

    public void setTeilNehmerList(ArrayList<Teilnehmer> teilNehmerList) {
        this.teilNehmerList = teilNehmerList;
    }

    public ArrayList<Mitarbeiter> getMitarbeiterList() {
        return mitarbeiterList;
    }

    public void setMitarbeiterList(ArrayList<Mitarbeiter> mitarbeiterList) {
        this.mitarbeiterList = mitarbeiterList;
    }

    public ArrayList<Modul> getModulList() {
        return modulList;
    }

    public void setModulList(ArrayList<Modul> modulList) {
        this.modulList = modulList;
    }

    public ArrayList<String> getRueckmeldungList() {
        return rueckmeldungList;
    }

    public void setRueckmeldungList(ArrayList<String> rueckmeldungList) {
        this.rueckmeldungList = rueckmeldungList;
    }

    private synchronized int generateUniqueId() {
        return nextId++;
    }

    // prufen ob mehr als 8
    public boolean pruefenAnzahlTeilnehmerNichtZuViel() {
        return this.getTeilNehmerList().size() <= 8;
    }

    // Bewertung von Kurs rechnen
    public Bewertung bewertenRechnen() {
        int sum = 0;
        for (Teilnehmer teilnehmer : this.teilNehmerList) {
            sum += teilnehmer.getBewertungKurs().getNote();
        }
        if (this.teilNehmerList.size() > 0) {
            int note = sum / this.teilNehmerList.size();
            Bewertung bewertung = Bewertung.getByNote(note);
            return bewertung;
        } else {
            return Bewertung.UNBEKANNT; // UNBEKANNT ist auch bewerten
        }
    }

    // add TeilNehmer zu Kurs
    public void addTeilNehmer(Teilnehmer teilnehmer) {
        this.teilNehmerList.add(teilnehmer);
    }

    // add Mitarbeiter zu Kurs
    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiterList.add(mitarbeiter);
    }

    // add Modul zu Kurs
    public void addModul(Modul modul) {
        this.modulList.add(modul);
    }

    // add feedback zu Kurs
    public void addRueckmeldungList(String rueckmeldung) {
        this.rueckmeldungList.add(rueckmeldung);
    }

    // Kurs Information auszudrücken
    public void lesenRueckmeldungList() {
        for (String rueckmeldung : this.rueckmeldungList) {
            System.out.println(rueckmeldung);
        }
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "kursId=" + kursId +
                ", kursName='" + kursName + '\'' +
                ", startDatum=" + startDatum +
                ", endDatum=" + endDatum +
                ", tageAnzahl=" + tageAnzahl +
                ", teilNehmerList=" + teilNehmerList +
                ", mitarbeiterList=" + mitarbeiterList +
                ", modulList=" + modulList +
                ", rueckmeldungList=" + rueckmeldungList +
                '}';
    }

}

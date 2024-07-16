package kurs;

import java.time.LocalDate;
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
    private ArrayList<Bewertung> bewertList;
    private ArrayList<String> rueckmeldungList;
    private ArrayList<Module> modulList;

    public Kurs(String kursName, LocalDate startDatum, LocalDate endDatum, int tageAnzahl,
            ArrayList<Teilnehmer> teilNehmerList, ArrayList<Mitarbeiter> mitarbeiterList,
            ArrayList<Bewertung> bewertList, ArrayList<String> rueckmeldungList, ArrayList<Module> modulList) {
        this.kursName = kursName;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
        this.tageAnzahl = tageAnzahl;
        this.teilNehmerList = teilNehmerList;
        this.mitarbeiterList = mitarbeiterList;
        this.bewertList = bewertList;
        this.rueckmeldungList = rueckmeldungList;
        this.modulList = modulList;
        this.kursId = this.generateUniqueId();
    }

    private synchronized int generateUniqueId() {
        return nextId++;
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

    public ArrayList<Bewertung> getBewertList() {
        return bewertList;
    }

    public void setBewertList(ArrayList<Bewertung> bewertList) {
        this.bewertList = bewertList;
    }

    public ArrayList<String> getRueckmeldungList() {
        return rueckmeldungList;
    }

    public void setRueckmeldungList(ArrayList<String> rueckmeldungList) {
        this.rueckmeldungList = rueckmeldungList;
    }

    public ArrayList<Module> getModulList() {
        return modulList;
    }

    public void setModulList(ArrayList<Module> modulList) {
        this.modulList = modulList;
    }

}

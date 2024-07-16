package superCodeSoftware_SP_15_7_2024;

import java.time.LocalDate;
import java.util.ArrayList;

public class Kurs {
    private int kursId;
    private String kursName;
    private LocalDate startDatum;
    private LocalDate endDatum;
    private int tageAnzahl;
    private ArrayList<Teilnehmer> teilnehmerList;
    private ArrayList<Mitarbeiter> mitarbeitersList;
    private ArrayList<Bewertung> bewerList;
    private ArrayList<Modul> modulList;
    private ArrayList<String> ruckmeldungList;

    public Kurs(int kursId, String kursName, LocalDate startDatum, LocalDate endDatum, int tageAnzahl) {
        this.kursId = kursId;
        this.kursName = kursName;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
        this.tageAnzahl = tageAnzahl;
        this.teilnehmerList = new ArrayList<>();
        this.mitarbeitersList = new ArrayList<>();
        this.bewerList = new ArrayList<>();
        this.modulList = new ArrayList<>();
        this.ruckmeldungList = new ArrayList<>();
    }

    public int getKursId() {
        return kursId;
    }

    public void setKursId(int kursId) {
        this.kursId = kursId;
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

    public ArrayList<Teilnehmer> getTeilnehmerList() {
        return teilnehmerList;
    }

    public void setTeilnehmerList(ArrayList<Teilnehmer> teilnehmersList) {
        this.teilnehmerList = teilnehmersList;
    }

    public ArrayList<Mitarbeiter> getMitarbeitersList() {
        return mitarbeitersList;
    }

    public void setMitarbeitersList(ArrayList<Mitarbeiter> mitarbeitersList) {
        this.mitarbeitersList = mitarbeitersList;
    }

    public ArrayList<Bewertung> getBewertungsList() {
        return bewerList;
    }

    public void setBewertungsList(ArrayList<Bewertung> bewerList) {
        this.bewerList = bewerList;
    }

    public ArrayList<Modul> getModulList() {
        return modulList;
    }

    public void setModulList(ArrayList<Modul> modulList) {
        this.modulList = modulList;
    }

    public ArrayList<String> getRuckmeldungList() {
        return ruckmeldungList;
    }

    public void setRuckmeldungList(ArrayList<String> ruckmeldungList) {
        this.ruckmeldungList = ruckmeldungList;
    }

}

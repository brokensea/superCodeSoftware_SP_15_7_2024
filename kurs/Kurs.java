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

        Period period = Period.between(startDatum, endDatum);
        this.tageAnzahl = period.getDays();
        this.kursName = kursName;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
        //
        this.teilNehmerList = new ArrayList<>();
        this.mitarbeiterList = new ArrayList<>();
        this.modulList = new ArrayList<>();
        this.rueckmeldungList = new ArrayList<>();
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

    public ArrayList<Modul> getModulList() {
        return modulList;
    }

    public void setModulList(ArrayList<Modul> modulList) {
        this.modulList = modulList;
    }

    // Methode:
    // ein Kurs maxmal 8 Teilnehmern
    public boolean pruefenAnzahlTeilnehmerNichtZuViel() {
        if (this.getTeilNehmerList().size() > 8)
            return false;
        else {
            return true;
        }
    }

    // rechnen durchschnittliche Bewerbung von TeilnehmerList ein gut oder .. Note
    public Bewertung bewertenRechnen() {
        int note;
        int sum = 0;
        for (Teilnehmer teilnehmer : this.teilNehmerList) {
            sum += teilnehmer.getBewertungKurs().getNote();
        }
        note = (int) (sum / this.teilNehmerList.size());

        Bewertung bewertung = Bewertung.getByNote(note);
        return bewertung;
    }

    public void addTeilNehmer(Teilnehmer teilnehmer) {
        this.teilNehmerList.add(teilnehmer);
    }

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiterList.add(mitarbeiter);
    }

    public void addModul(Modul modul) {
        this.modulList.add(modul);
    }

    public void addRueckmeldungList(String ruckmeldung) {
        this.rueckmeldungList.add(ruckmeldung);
    }

    // print alle Beschreibung von Teilnehmern
    public void lesenRueckmeidungList() {
        for (Teilnehmer teilnehmer : this.teilNehmerList) {
            System.out.println(teilnehmer.getRueckmeldung());
        }
    }

}

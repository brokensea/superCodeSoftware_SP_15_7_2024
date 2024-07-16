package superCodeSoftware_SP_15_7_2024;

import java.time.LocalDate;
import java.util.ArrayList;


    public class Modul {
    private String modulName;
    private LocalDate startDatum;
    private LocalDate endDatum;
    private int tageAnzahl;
    private boolean lizenzen;
    private Modul modulType;
    private ArrayList<Aufgabe> aufgabenList;
    private ArrayList<Mitarbeiter> trainierList;

    
    public Modul(String modulName, LocalDate startDatum, LocalDate endDatum, int tageAnzahl, boolean lizenzen, Modul modulType) {
        this.modulName = modulName;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
        this.tageAnzahl = tageAnzahl;
        this.lizenzen = lizenzen;
        this.modulType = modulType;
        this.aufgabenList = new ArrayList<>();
        this.trainierList = new ArrayList<>();
    }

    // Getter and Setter for modulName
    public String getModulName() {
        return modulName;
    }

    public void setModulName(String modulName) {
        this.modulName = modulName;
    }

    // Getter and Setter for startDatum
    public LocalDate getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(LocalDate startDatum) {
        this.startDatum = startDatum;
    }

    // Getter and Setter for endDatum
    public LocalDate getEndDatum() {
        return endDatum;
    }

    public void setEndDatum(LocalDate endDatum) {
        this.endDatum = endDatum;
    }

    // Getter and Setter for tageAnzahl
    public int getTageAnzahl() {
        return tageAnzahl;
    }

    public void setTageAnzahl(int tageAnzahl) {
        this.tageAnzahl = tageAnzahl;
    }

    // Getter and Setter for lizenzen
    public boolean isLizenzen() {
        return lizenzen;
    }

    public void setLizenzen(boolean lizenzen) {
        this.lizenzen = lizenzen;
    }

    // Getter and Setter for modulType
    public Modul getModulType() {
        return modulType;
    }

    public void setModulType(Modul modulType) {
        this.modulType = modulType;
    }

    // Getter and Setter for aufgabenList
    public ArrayList<Aufgabe> getAufgabenList() {
        return aufgabenList;
    }

    public void setAufgabenList(ArrayList<Aufgabe> aufgabenList) {
        this.aufgabenList = aufgabenList;
    }

    // Getter and Setter for trainierList
    public ArrayList<Mitarbeiter> getTrainierList() {
        return trainierList;
    }

    public void setTrainierList(ArrayList<Mitarbeiter> trainierList) {
        this.trainierList = trainierList;
    }

    // Method hasLizenz
    public boolean hasLizenz(Mitarbeiter mitarbeiter) {
        return mitarbeiter.getLizenzenList().contains(this.modulType);
    }

    // Method verteilenModul
    public boolean verteilenModul(ArrayList<Mitarbeiter> mitarbeiterList) {
        for (Mitarbeiter mitarbeiter : mitarbeiterList) {
            if (!hasLizenz(mitarbeiter)) {
                return false;
            }
        }
        this.trainierList.addAll(mitarbeiterList);
        return true;
    }

    // Method verteilenAufgabeInModul
    public double verteilenAufgabeInModul(int aufgabeAnzahl, int tageAnzahl) {
        if (tageAnzahl == 0) return 0;
        return (double) aufgabeAnzahl / tageAnzahl;
    }

    // Method pruefenTagMindsterAufgabe
    public boolean pruefenTagMindsterAufgabe() {
        return this.aufgabenList.size() >= this.tageAnzahl;
    }
}


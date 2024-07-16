package superCodeSoftware_SP_15_7_2024;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mitarbeiter extends Person{
    private int mitarbeiter_id;
    private ArrayList<Modul> lizenzenList;
    private ArrayList<Modul> modulList;

    public Mitarbeiter(String vorname, String nachname, String adress, int mitarbeiter_id) {
        super(vorname, nachname, adress);
        this.mitarbeiter_id = mitarbeiter_id;
        this.lizenzenList = new ArrayList<>();
        this.modulList = new ArrayList<>();
    }

    // Getter and Setter for mitarbeiter_id
    public int getMitarbeiterId() {
        return mitarbeiter_id;
    }

    public void setMitarbeiterId(int mitarbeiter_id) {
        this.mitarbeiter_id = mitarbeiter_id;
    }

    // Getter and Setter for lizenzenList
    public ArrayList<Modul> getLizenzenList() {
        return lizenzenList;
    }

    public void setLizenzenList(ArrayList<Modul> lizenzenList) {
        this.lizenzenList = lizenzenList;
    }

    // Getter and Setter for modulList
    public ArrayList<Modul> getModulList() {
        return modulList;
    }

    public void setModulList(ArrayList<Modul> modulList) {
        this.modulList = modulList;
    }

    // Method verteilenKurs
    public boolean verteilenKurs(Mitarbeiter mitarbeiter, Kurs kurs) {
   
        return false;
    }

    // Method istFrei
    private boolean istFrei(Mitarbeiter mitarbeiter, LocalDate date) {
        
        return false;
    }
}

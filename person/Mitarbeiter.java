package person;

import java.time.LocalDate;
import java.util.ArrayList;

import enumKlass.ModulName;
import kurs.Modul;

public class Mitarbeiter extends Person {

    private int mitarbeiter_id;
    private static int nextId = 1;

    private ArrayList<ModulName> lizenzenList;
    private ArrayList<Modul> modulList;

    public Mitarbeiter(String vorname, String nachname, String address) {
        super(vorname, nachname, address);
        this.lizenzenList = new ArrayList<>();
        this.modulList = new ArrayList<>();
        this.mitarbeiter_id = this.generateUniqueId();
    }

    // get und set
    public int getMitarbeiter_id() {
        return mitarbeiter_id;
    }

    public void setMitarbeiter_id(int mitarbeiter_id) {
        this.mitarbeiter_id = mitarbeiter_id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Mitarbeiter.nextId = nextId;
    }

    public ArrayList<ModulName> getLizenzenList() {
        return lizenzenList;
    }

    public void setLizenzenList(ArrayList<ModulName> lizenzenList) {
        this.lizenzenList = lizenzenList;
    }

    public ArrayList<Modul> getModulList() {
        return modulList;
    }

    public void setModulList(ArrayList<Modul> modulList) {
        this.modulList = modulList;
    }

    private synchronized int generateUniqueId() {
        return nextId++;
    }

    // get Mitarbeiter Modulist Tagen insgesamt
    public int getMitarbetierModulTagen() {
        int tageAnzahl = 0;
        for (Modul modul : this.modulList) {
            tageAnzahl += modul.getTageAnzahl();
        }
        return tageAnzahl;
    }

    // prufen ob Mitarbeiter frei
    public boolean istFrei(LocalDate date) {
        for (Modul modul : this.getModulList()) {
            if (date.isAfter(modul.getStartDatum()) && date.isBefore(modul.getEndDatum())) {
                System.out.println(this.getVorname() + " ist nicht frei");
                return false;
            }
        }
        System.out.println(this.getVorname() + " ist frei");
        return true;
    }

    public void addModul(Modul modul) {
        modulList.add(modul);
    }

    public void addLizenzen(ModulName modulName) {
        lizenzenList.add(modulName);
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "mitarbeiter_id=" + mitarbeiter_id +
                ", vorname='" + getVorname() + '\'' +
                ", nachname='" + getNachname() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }

}

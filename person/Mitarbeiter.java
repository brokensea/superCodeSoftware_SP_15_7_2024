package person;

import java.time.LocalDate;
import java.util.ArrayList;

import enumKlass.ModulName;
import kurs.Kurs;
import kurs.Modul;

public class Mitarbeiter extends Person {

    private int mitarbeiter_id;
    private static int nextId = 1;

    private ArrayList<Modul> lizenzenList;
    private ArrayList<Modul> modulList;

    public Mitarbeiter(String vorname, String nachname, String address, ArrayList<Modul> lizenzenList,
            ArrayList<Modul> modulList) {
        super(vorname, nachname, address);
        this.setLizenzenList(lizenzenList);
        this.setModulList(modulList);
        this.mitarbeiter_id = this.generateUniqueId();
    }

    public int getMitarbeiter_id() {
        return mitarbeiter_id;
    }

    public void setMitarbeiter_id(int mitarbeiter_id) {
        this.mitarbeiter_id = mitarbeiter_id;
    }

    public ArrayList<Modul> getLizenzenList() {
        return lizenzenList;
    }

    public void setLizenzenList(ArrayList<Modul> lizenzenList) {
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

    public boolean istFrei(LocalDate date) {
        for (Modul modul : this.getModulList()) {
            if (date.isAfter(modul.getStartDatum()) && date.isBefore(modul.getEndDatum())) {
                System.out.println(this.getVorname() + "ist nicht frei");
                return false;
            }
        }
        System.out.println(this.getVorname() + "ist frei");
        return true;
    }

    public void addModul(Modul modul) {
        modulList.add(modul);
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "mitarbeiter_id=" + mitarbeiter_id +
                ", vorname='" + getVorname() + '\'' +
                ", nachname='" + getNachname() + '\'' +
                ", address='" + getAddress() + '\'' +
                // ", lizenzenList=" + lizenzenList +
                // ", modulList=" + modulList +
                '}';
    }
}

package unternehmen;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

import enumKlass.ModulName;

import java.util.List;

import kurs.Modul;
import kurs.Kurs;
import kurs.Aufgabe;
import person.Mitarbeiter;
import person.Teilnehmer;

public class VerwaltungsBildungUnternehmen {
    private String unternehmen;
    private ArrayList<Kurs> kursList;
    private ArrayList<Aufgabe> aufgabenpool;
    private ArrayList<Mitarbeiter> mitarbeiterList;

    private ArrayList<Teilnehmer> teilnehmenList;

    // private ArrayList<Aufgabe> aufgabenList;
    // Aufgaben pool

    public VerwaltungsBildungUnternehmen(String unternehmen) {
        this.unternehmen = unternehmen;
        this.kursList = new ArrayList<>();
        this.aufgabenpool = new ArrayList<>();
        this.mitarbeiterList = new ArrayList<>();
        this.teilnehmenList = new ArrayList<>();
    }

    // hier auch nicht
    public int rechnenDurchsnittlichArbeitFindenZeit(Kurs kurs) {
        int durchsnittlichTage;
        int sum = 0;
        int count = 0;

        for (Teilnehmer teilnehmer : kurs.getTeilNehmerList()) {
            if (teilnehmer.isHatArbeit() && teilnehmer.getArbeitgefundenZeit() != null) {
                Duration period = Duration.between(kurs.getEndDatum().atStartOfDay(),
                        teilnehmer.getArbeitgefundenZeit().atStartOfDay());
                sum += period.toDays();
                count++;
            }
        }
        if (count == 0) {
            throw new ArithmeticException(" keine Arbeiter gefunden");
        }
        durchsnittlichTage = sum / count;

        System.out.println("durchsnittlich Arbeiterfinden: " + durchsnittlichTage + " Tagen ");
        return durchsnittlichTage;
    }

    // hier muss testen
    public double rechnenPozentArbeitFinden(Kurs kurs) {
        int count = 0;
        int totalTeilnehmer = kurs.getTeilNehmerList().size();

        // double prozent = 0.0;
        // int counter = 0;
        if (totalTeilnehmer == 0) {
            throw new ArithmeticException(" keine Arbeiter gefunden");
        }
        for (Teilnehmer teilnehmer : kurs.getTeilNehmerList()) {
            if (teilnehmer.isHatArbeit()) {
                count++;
            }
        }
        double prozent = (double) count / totalTeilnehmer * 100;
        System.out.println(kurs.getKursName() + " hat " + prozent
                + "% Arbeit gefunden");
        return prozent;
    }

    public void addAufgabeZuPool(Aufgabe aufgabe) {
        this.aufgabenpool.add(aufgabe);
    }

    // get und set
    public ArrayList<Aufgabe> getAufgabenpool() {
        return aufgabenpool;
    }

    public void setAufgabenpool(ArrayList<Aufgabe> aufgabenpool) {
        this.aufgabenpool = aufgabenpool;
    }

    public void addKurs(Kurs kurs) {
        kursList.add(kurs);
    }

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiterList.add(mitarbeiter);
    }

    public void addTeilnehnemer(Teilnehmer teilnehmer) {
        teilnehmenList.add(teilnehmer);
    }

    public void verteilenModul(Mitarbeiter mitarbeiter, Modul modul) {
        mitarbeiter.addModul(modul);
    }

    public ArrayList<Mitarbeiter> getMitarbeiterList() {
        return mitarbeiterList;
    }

    // getestet
    public int findPassendAnzahl(Mitarbeiter mitarbeiter, Kurs kurs) {
        int passendAnzahl = 0;
        for (int index = 1; index < kurs.getModulList().size(); index++) {
            Modul kursModul = kurs.getModulList().get(index);

            for (ModulName lizenzen : mitarbeiter.getLizenzenList())
                if (lizenzen == (kursModul.getModulName())) {
                    passendAnzahl++;
                    break;
                }
        }
        return passendAnzahl;
    }

    // getestet
    public Mitarbeiter findMaxPassendMitarbeiterzuKurs(Kurs kurs) {
        Mitarbeiter maxPassendMitarbeiter = this.mitarbeiterList.get(0);
        int maxmalPassend = 0;
        for (Mitarbeiter mitarbeiter : this.mitarbeiterList) {
            if (maxmalPassend < this.findPassendAnzahl(mitarbeiter, kurs)) {
                maxPassendMitarbeiter = mitarbeiter;
            }
        }
        return maxPassendMitarbeiter;
    }

    // getestet
    public void verteilenMitarbeiterZuKurs(Kurs kurs) {
        if (pruefenObAllModulInKursHatMitarbeiter(kurs)) {
            while (gibtEsUnbesetzteModule(kurs)) {
                verteilenMitarbeiterZuKursHilfe(kurs);
            }
        } else {
            System.out.println("MitarbeiterPool nicht genug.");
        }
    }

    public boolean gibtEsUnbesetzteModule(Kurs kurs) {
        for (Modul modul : kurs.getModulList()) {
            if (!modul.hasMitarbeiter()) {
                return true;
            }
        }
        System.out.println("All Modul in Kurs " + kurs.getKursName() + " hat Mitarbeiter Kurs vollständig");
        return false;
    }

    public void verteilenMitarbeiterZuKursHilfe(Kurs kurs) {
        this.sortierenMitarbeiterListnachMitarbeiterModulistTagen();
        for (Modul modul : kurs.getModulList()) {
            if (!modul.hasMitarbeiter()) {
                Mitarbeiter maxPassendMitarbeiter = this.findMaxPassendMitarbeiterzuKurs(kurs);
                if (maxPassendMitarbeiter != null) {
                    kurs.addMitarbeiter(maxPassendMitarbeiter);
                    maxPassendMitarbeiter.addModul(modul);
                    modul.setMitarbeiter(maxPassendMitarbeiter);
                    System.out.println("Mitarbeiter " + maxPassendMitarbeiter.getVorname() + " wurde zum Modul "
                            + modul.getModulName() + " hinzugefügt.");
                } else {
                    System.out.println("Kein passender Mitarbeiter für Modul " + modul.getModulName() + " gefunden.");
                }
            }
        }
    }

    // getestet
    public boolean prufenObKursHatZuWeinigAufgabe(Kurs kurs) {
        int tageVonKurs = kurs.getTageAnzahl();
        int tageVonAufgabeInsgesamt = 0;

        for (Modul modul : kurs.getModulList()) {
            for (Aufgabe aufgabe : modul.getAufgabenList()) {
                tageVonAufgabeInsgesamt += aufgabe.getDauern();
            }
        }
        if (tageVonKurs > tageVonAufgabeInsgesamt) {
            System.out.println("zu weinig Aufgabe von Kurs: " + kurs.getKursName());
            return true;
        } else {
            System.out.println("ausreichenden Aufgabe von Kurs: " + kurs.getKursName());
            return false;
        }
    }

    // getestet
    public Mitarbeiter rechnenWeinigestenModul() {
        Mitarbeiter weinigestenMitarbeiter = this.mitarbeiterList.get(0);
        for (Mitarbeiter mitarbeiter : this.mitarbeiterList) {
            if (weinigestenMitarbeiter.getModulList().size() > mitarbeiter.getModulList().size()) {
                weinigestenMitarbeiter = mitarbeiter;
            }
        }
        return weinigestenMitarbeiter;
    }

    // getestet
    public Kurs findenMaxBewertungKurs() {
        Kurs masxKurs = this.kursList.get(0);
        for (Kurs kurs : kursList) {
            if (masxKurs.bewertenRechnen().getNote() < kurs.bewertenRechnen().getNote()) {
                masxKurs = kurs;
            }
        }
        return masxKurs;
    }

    // gestestet
    public Kurs findenMinBewertungKurs() {
        Kurs minKurs = this.kursList.get(0);
        for (Kurs kurs : kursList) {
            if (minKurs.bewertenRechnen().getNote() > kurs.bewertenRechnen().getNote()) {
                minKurs = kurs;
            }
        }
        return minKurs;
    }

    // ? ob notwendig
    public boolean addAufgabeZuModul(Aufgabe aufgabe, Modul modul) {
        if (aufgabe.getModulname() == modul.getModulName()) {
            modul.addAufgabe(aufgabe);
            return true;
        } else {
            return false;
        }

    }

    // sortieren MitarbeiterList nach Mitarbeiter Modulist Tagen insgesamt
    public void sortierenMitarbeiterListnachMitarbeiterModulistTagen() {
        Collections.sort(mitarbeiterList, new Comparator<Mitarbeiter>() {
            @Override
            public int compare(Mitarbeiter mitarbeiter1, Mitarbeiter mitarbeiter2) {
                return Integer.compare(mitarbeiter1.getMitarbetierModulTagen(),
                        mitarbeiter2.getMitarbetierModulTagen());
            }

        });
    }

    public boolean pruefenObAllModulInKursHatMitarbeiter(Kurs kurs) {
        for (Modul modul : kurs.getModulList()) {
            boolean hatMitarbeiter = false;
            for (Mitarbeiter mitarbeiter : this.mitarbeiterList) {
                if (mitarbeiter.getLizenzenList().contains(modul.getModulName())
                        && mitarbeiter.istFrei(modul.getStartDatum())) {
                    hatMitarbeiter = true;
                    break;
                }
            }
            if (!hatMitarbeiter) {
                System.out.println("Nicht Genue Mitarbeiter für Modul " + modul.getModulName());
                return false;
            }

        }
        return true;
    }

}

package unternehmen;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import kurs.Modul;
import kurs.Kurs;
import person.Mitarbeiter;
import person.Teilnehmer;

public class VerwaltungsBildungUnternehmen {
    private String unternehmen;
    private String name;
    private String chef;
    private LocalDate begruendungsdatum;
    private String kategorie;
    private ArrayList<Kurs> kursList;

    ArrayList<Mitarbeiter> mitarbeiterList;
    private ArrayList<Teilnehmer> teilnehmenList;

    public int rechnenDurchsnittlichArbeitFindenZeit(Kurs kurs) {
        int durchsnittlichTage;
        int sum = 0;
        for (Teilnehmer teilnehmer : kurs.getTeilNehmerList()) {
            Duration period = Duration.between(kurs.getEndDatum(), teilnehmer.getArbeitgefundenZeit());
            sum += period.toDays();
        }
        durchsnittlichTage = sum / teilnehmenList.size();

        return durchsnittlichTage;
    }

    public double rechnenPozentArbeitFinden() {
        double prozent = 0.0;
        int counter = 0;
        for (Teilnehmer teilnehmer : teilnehmenList) {
            if (teilnehmer.isHatArbeit()) {
                counter++;
            }
        }
        prozent = counter / teilnehmenList.size();
        return prozent;
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

    public void verteilenModul (Mitarbeiter mitarbeiter, Modul modul){
        mitarbeiter.addModul(modul);

    }

}

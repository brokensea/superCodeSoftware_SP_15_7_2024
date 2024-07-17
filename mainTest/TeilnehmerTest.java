package mainTest;

import enumKlass.Bewertung;
import kurs.Kurs;
import person.Teilnehmer;

import java.time.LocalDate;

public class TeilnehmerTest {

    public static void main(String[] args) {
        testTeilnehmerConstructor();
        testTeilnehmerBewertung();
    }

    private static void testTeilnehmerConstructor() {
        Kurs kurs = new Kurs("TestKurs", LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 31));
        Bewertung bewertung = Bewertung.GUT;

        Teilnehmer teilnehmer = new Teilnehmer("Max", "Mustermann", "Musterstraße 1", kurs, bewertung,
                "Gute Rückmeldung");

        System.out.println("Teilnehmer erstellt: " + teilnehmer);
    }

    private static void testTeilnehmerBewertung() {
        Kurs kurs = new Kurs("TestKurs", LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 31));
        Teilnehmer teilnehmer1 = new Teilnehmer("Max", "Mustermann", "Musterstraße 1", kurs, Bewertung.GUT,
                "Gute Rückmeldung");
        Teilnehmer teilnehmer2 = new Teilnehmer("Anna", "Musterfrau", "Musterweg 2", kurs, Bewertung.SEHR_GUT,
                "Sehr gute Rückmeldung");

        System.out.println("Bewertung von Teilnehmer 1: " + teilnehmer1.getBewertungKurs());
        System.out.println("Bewertung von Teilnehmer 2: " + teilnehmer2.getBewertungKurs());
    }
}


package mainTest;

import enumKlass.Bewertung;
import kurs.Kurs;
import person.Teilnehmer;

import java.time.LocalDate;

public class KursTest {

    public static void main(String[] args) {
        testKursCreation();
        testKursTeilnehmerBewertung();
    }

    private static void testKursCreation() {
        Kurs kurs = new Kurs("TestKurs", LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 31));
        System.out.println("Kurs erstellt: " + kurs);
    }

    private static void testKursTeilnehmerBewertung() {
        Kurs kurs = new Kurs("TestKurs", LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 31));
        Teilnehmer teilnehmer1 = new Teilnehmer("Max", "Mustermann", "Musterstraße 1", kurs, Bewertung.GUT,
                "Gute Rückmeldung");
        Teilnehmer teilnehmer2 = new Teilnehmer("Anna", "Musterfrau", "Musterweg 2", kurs, Bewertung.SEHR_GUT,
                "Sehr gute Rückmeldung");

        kurs.addTeilNehmer(teilnehmer1);
        kurs.addTeilNehmer(teilnehmer2);

        System.out.println("Durchschnittliche Bewertung des Kurses: " + kurs.bewertenRechnen());
    }
}
package mainTest;

import enumKlass.Bewertung;
import enumKlass.ModulName;
import kurs.Aufgabe;
import kurs.Kurs;
import kurs.Modul;
import person.Mitarbeiter;
import person.Teilnehmer;
import unternehmen.VerwaltungsBildungUnternehmen;

import java.time.LocalDate;
import java.util.ArrayList;

public class VerwaltungsBildungUnternehmenTest {

    public static void main(String[] args) {
        testVerwaltungsBildungUnternehmen();
    }

    public static void testVerwaltungsBildungUnternehmen() {

        System.out.println("set up test case: ");
        VerwaltungsBildungUnternehmen unternehmen = new VerwaltungsBildungUnternehmen("Bildung AG");

        Kurs kurs1 = new Kurs("Java Kurs", LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 31));
        Kurs kurs2 = new Kurs("Web Development", LocalDate.of(2024, 8, 1), LocalDate.of(2024, 8, 31));

        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Max", "Muster", "Musterweg 1");
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Anna", "Mustermann", "Musterstraße 2");

        mitarbeiter1.addLizenzen(ModulName.Java);
        mitarbeiter2.addLizenzen(ModulName.HTML);
        mitarbeiter2.addLizenzen(ModulName.CSS);

        Modul modul1 = new Modul(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 15), ModulName.Java,
                new ArrayList<>());
        Modul modul2 = new Modul(LocalDate.of(2024, 7, 16), LocalDate.of(2024, 7, 31), ModulName.HTML,
                new ArrayList<>());

        Aufgabe aufgabe1 = new Aufgabe("Programmieraufgabe", 5, ModulName.Java);
        Aufgabe aufgabe2 = new Aufgabe("Design umsetzen", 3, ModulName.HTML);

        modul1.addAufgabe(aufgabe1);
        modul2.addAufgabe(aufgabe2);

        kurs1.addModul(modul1);
        kurs1.addModul(modul2);

        kurs2.addModul(modul2);

        unternehmen.addKurs(kurs1);
        unternehmen.addKurs(kurs2);
        unternehmen.addMitarbeiter(mitarbeiter1);
        unternehmen.addMitarbeiter(mitarbeiter2);

        unternehmen.verteilenMitarbeiterZuKurs(kurs1);
        unternehmen.verteilenMitarbeiterZuKurs(kurs2);

        Teilnehmer teilnehmer1 = new Teilnehmer("Hans", "Huber", "Hauptstraße 3");
        teilnehmer1.setBewertungKurs(Bewertung.GUT);
        teilnehmer1.setRueckmeldung("Interessanter Kurs!");

        kurs1.addTeilNehmer(teilnehmer1);

        unternehmen.addTeilnehnemer(teilnehmer1);

        // Test 1: prufenObKursHatZuWeinigAufgabe
        System.out.println("test prufenObKursHatZuWeinigAufgabe :");
        boolean test1Passed = unternehmen.prufenObKursHatZuWeinigAufgabe(kurs1);
        System.out.println("Kurs 1 hat genug Aufgaben: " + (test1Passed ? "pass" : "fail"));

        // Test 2: prufenObKursHatZuWeinigAufgabe
        boolean test2Passed = unternehmen.prufenObKursHatZuWeinigAufgabe(kurs2);
        System.out.println("Kurs 2 hat genug Aufgaben: " + (test2Passed ? "pass" : "fail"));

        // Test 3: rechnenWeinigestenModul
        System.out.println("test rechnenWeinigestenModul :");
        Mitarbeiter mitarbeiter = unternehmen.rechnenWeinigestenModul();
        System.out.println(
                "Mitarbeiter mit den wenigsten Modulen: " + (mitarbeiter != null ? mitarbeiter.getVorname() : "fail"));

        // Test 4: findenMaxBewertungKurs
        System.out.println("test findenMaxBewertungKurs :");
        Kurs kursMaxBewertung = unternehmen.findenMaxBewertungKurs();
        System.out.println("Kurs mit maximaler Bewertung: "
                + (kursMaxBewertung != null ? kursMaxBewertung.getKursName() : "fail"));

        // Test 5: findenMinBewertungKurs
        System.out.println("test findenMinBewertungKurs :");
        Kurs kursMinBewertung = unternehmen.findenMinBewertungKurs();
        System.out.println("Kurs mit minimaler Bewertung: "
                + (kursMinBewertung != null ? kursMinBewertung.getKursName() : "fail"));
    }
}

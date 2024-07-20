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

public class VerwaltungsBildungUnternehmenTestZewi {
        public static void main(String[] args) {
                testVerwaltungsBildungUnternehmen();

                // testNeueMethod();
                // testNeueMethod2();
        }

        public static void testVerwaltungsBildungUnternehmen() {
                System.out.println("Setup test case: ");
                VerwaltungsBildungUnternehmen unternehmen = new VerwaltungsBildungUnternehmen("Bildung AG");

                // Create courses
                Kurs kurs1 = new Kurs("Java Kurs", LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 31));
                Kurs kurs2 = new Kurs("Web Development", LocalDate.of(2024, 8, 1), LocalDate.of(2024, 8, 31));

                // Create employees
                Mitarbeiter mitarbeiter1 = new Mitarbeiter("Max", "Muster", "Musterweg 1");
                Mitarbeiter mitarbeiter2 = new Mitarbeiter("Anna", "Mustermann", "Musterstraße 2");

                mitarbeiter1.addLizenzen(ModulName.Java);
                mitarbeiter2.addLizenzen(ModulName.HTML);
                mitarbeiter2.addLizenzen(ModulName.CSS);

                // Create modules
                Modul modul1 = new Modul(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 15), ModulName.Java,
                                new ArrayList<>());
                Modul modul2 = new Modul(LocalDate.of(2024, 7, 16), LocalDate.of(2024, 7, 31), ModulName.HTML,
                                new ArrayList<>());

                // Create tasks
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

                // Test Case 0: verteilenMitarbeiterZuKurs
                System.out.println("Test Case 0: verteilenMitarbeiterZuKurs");
                unternehmen.verteilenMitarbeiterZuKurs(kurs1);
                unternehmen.verteilenMitarbeiterZuKurs(kurs2);

                // Add participants
                Teilnehmer teilnehmer1 = new Teilnehmer("Hans", "Huber", "Hauptstraße 3");
                teilnehmer1.setBewertungKurs(Bewertung.GUT);
                teilnehmer1.setRueckmeldung("Interessanter Kurs!");
                kurs1.addTeilNehmer(teilnehmer1);
                unternehmen.addTeilnehnemer(teilnehmer1);

                // Test Case 1: prufenObKursHatZuWeinigAufgabe
                System.out.println("Test Case 1: prufenObKursHatZuWeinigAufgabe");
                boolean test1Passed = unternehmen.prufenObKursHatZuWeinigAufgabe(kurs1);
                System.out.println("Kurs 1 hat genug Aufgaben: " + (test1Passed ? "pass" : "fail"));

                // Test Case 2: prufenObKursHatZuWeinigAufgabe
                System.out.println("Test Case 2: prufenObKursHatZuWeinigAufgabe");
                boolean test2Passed = unternehmen.prufenObKursHatZuWeinigAufgabe(kurs2);
                System.out.println("Kurs 2 hat genug Aufgaben: " + (test2Passed ? "pass" : "fail"));

                // Test Case 3: rechnenWeinigestenModul
                System.out.println("Test Case 3: rechnenWeinigestenModul");
                Mitarbeiter wenigstenMitarbeiter = unternehmen.rechnenWeinigestenModul();
                System.out.println("Mitarbeiter mit den wenigsten Modulen: " +
                                (wenigstenMitarbeiter != null ? wenigstenMitarbeiter.getVorname() : "fail"));

                // Test Case 4: findenMaxBewertungKurs
                System.out.println("Test Case 4: findenMaxBewertungKurs");
                Kurs kursMaxBewertung = unternehmen.findenMaxBewertungKurs();
                System.out.println("Kurs mit maximaler Bewertung: " +
                                (kursMaxBewertung != null ? kursMaxBewertung.getKursName() : "fail"));

                // Test Case 5: findenMinBewertungKurs
                System.out.println("Test Case 5: findenMinBewertungKurs");
                Kurs kursMinBewertung = unternehmen.findenMinBewertungKurs();
                System.out.println("Kurs mit minimaler Bewertung: " +
                                (kursMinBewertung != null ? kursMinBewertung.getKursName() : "fail"));

                // Add another participant
                Teilnehmer teilnehmer2 = new Teilnehmer("Maria", "Müller", "Hauptstraße 4");
                teilnehmer2.setBewertungKurs(Bewertung.GUT);
                teilnehmer2.setRueckmeldung("Interessanter Kurs!");
                teilnehmer2.setHatArbeit(true);
                teilnehmer2.setArbeitgefundenZeit(LocalDate.of(2024, 8, 31));
                kurs1.addTeilNehmer(teilnehmer2);
                unternehmen.addTeilnehnemer(teilnehmer2);

                // Test Case 6: rechnenDurchsnittlichArbeitFindenZeit
                System.out.println("Test Case 6: rechnenDurchsnittlichArbeitFindenZeit");
                try {
                        int durchschnittlicheTage = unternehmen.rechnenDurchsnittlichArbeitFindenZeit(kurs1);
                        System.out.println("Durchschnittliche Arbeit finden Zeit: " + durchschnittlicheTage + " Tage");
                } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                }

                // Test Case 7: rechnenPozentArbeitFinden
                System.out.println("Test Case 7: rechnenPozentArbeitFinden");
                try {
                        double prozent = unternehmen.rechnenPozentArbeitFinden(kurs1);
                        System.out.println("Prozent der Teilnehmer, die Arbeit gefunden haben: " + prozent + "%");
                } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                }
        }

        public static void testNeueMethod() {
                System.out.println("Setup test case: ");
                VerwaltungsBildungUnternehmen unternehmen = new VerwaltungsBildungUnternehmen("Bildung AG");

                // Create courses
                Kurs kurs1 = new Kurs("Java Kurs", LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 31));
                Kurs kurs2 = new Kurs("Web Development", LocalDate.of(2024, 8, 1), LocalDate.of(2024, 8, 31));

                // Create employees
                Mitarbeiter mitarbeiter1 = new Mitarbeiter("Max", "Muster", "Musterweg 1");
                Mitarbeiter mitarbeiter2 = new Mitarbeiter("Anna", "Mustermann", "Musterstraße 2");
                Mitarbeiter mitarbeiter3 = new Mitarbeiter("Lisa", "Meier", "Musterstraße 3");

                mitarbeiter1.addLizenzen(ModulName.Java);
                mitarbeiter2.addLizenzen(ModulName.HTML);
                mitarbeiter2.addLizenzen(ModulName.CSS);
                mitarbeiter3.addLizenzen(ModulName.Java);
                mitarbeiter3.addLizenzen(ModulName.HTML);

                // Create modules
                Modul modul1 = new Modul(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 15), ModulName.Java,
                                new ArrayList<>());
                Modul modul2 = new Modul(LocalDate.of(2024, 7, 16), LocalDate.of(2024, 7, 31), ModulName.HTML,
                                new ArrayList<>());

                // Create tasks
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
                unternehmen.addMitarbeiter(mitarbeiter3);

                // Test Case 0: verteilenMitarbeiterZuKurs
                System.out.println("Test Case 0: verteilenMitarbeiterZuKurs");
                unternehmen.verteilenMitarbeiterZuKurs(kurs1);
                unternehmen.verteilenMitarbeiterZuKurs(kurs2);

                // Test Case 1: sortierenMitarbeiterListnachMitarbeiterModulistTagen
                System.out.println("Test Case 1: sortierenMitarbeiterListnachMitarbeiterModulistTagen");
                unternehmen.sortierenMitarbeiterListnachMitarbeiterModulistTagen();

                // Print sorted employees to verify correct sorting
                System.out.println("Mitarbeiter nach Modul Tagen sortiert:");
                for (Mitarbeiter mitarbeiter : unternehmen.getMitarbeiterList()) {
                        System.out.println(mitarbeiter.getVorname() + " " + mitarbeiter.getNachname() + ": "
                                        + mitarbeiter.getMitarbetierModulTagen() + " Tage");
                }

                // Test Case 2: pruefenObAllModulInKursHatMitarbeiter
                System.out.println("Test Case 2: pruefenObAllModulInKursHatMitarbeiter");
                boolean allModulesHaveEmployees = unternehmen.pruefenObAllModulInKursHatMitarbeiter(kurs1);
                System.out.println(
                                "Kurs 1 hat Mitarbeiter für alle Module: "
                                                + (allModulesHaveEmployees ? "pass" : "fail"));

                // Test Case 3: verteilenMitarbeiterZuKursHilfe
                System.out.println("Test Case 3: verteilenMitarbeiterZuKursHilfe");
                unternehmen.verteilenMitarbeiterZuKursHilfe(kurs1);

                // Print the employees assigned to the course
                System.out.println("Mitarbeiter im Kurs " + kurs1.getKursName() + ":");
                for (Mitarbeiter mitarbeiter : kurs1.getMitarbeiterList()) {
                        System.out.println(mitarbeiter.getVorname() + " " + mitarbeiter.getNachname());
                }

                // Print modules assigned to employees
                for (Mitarbeiter mitarbeiter : kurs1.getMitarbeiterList()) {
                        System.out.println("Mitarbeiter " + mitarbeiter.getVorname() + " hat folgende Module:");
                        for (Modul modul : mitarbeiter.getModulList()) {
                                System.out.println(modul.getModulName());
                        }
                }

        }

        public static void testNeueMethod2() {

                // Setup test data
                VerwaltungsBildungUnternehmen unternehmen = new VerwaltungsBildungUnternehmen("Bildung AG");

                // Create courses
                Kurs kurs1 = new Kurs("Java Kurs", LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 31));
                Kurs kurs2 = new Kurs("Web Development", LocalDate.of(2024, 8, 1), LocalDate.of(2024, 8, 31));

                // Create employees
                Mitarbeiter mitarbeiter1 = new Mitarbeiter("Max", "Muster", "Musterweg 1");
                Mitarbeiter mitarbeiter2 = new Mitarbeiter("Anna", "Mustermann", "Musterstraße 2");

                mitarbeiter1.addLizenzen(ModulName.Java);
                mitarbeiter2.addLizenzen(ModulName.HTML);
                mitarbeiter2.addLizenzen(ModulName.CSS);

                // Create modules
                Modul modul1 = new Modul(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 15), ModulName.Java,
                                new ArrayList<>());
                Modul modul2 = new Modul(LocalDate.of(2024, 7, 16), LocalDate.of(2024, 7, 31), ModulName.HTML,
                                new ArrayList<>());

                kurs1.addModul(modul1);
                kurs1.addModul(modul2);

                kurs2.addModul(modul2);

                unternehmen.addKurs(kurs1);
                unternehmen.addKurs(kurs2);
                unternehmen.addMitarbeiter(mitarbeiter1);
                unternehmen.addMitarbeiter(mitarbeiter2);

                // Test Case: verteilenMitarbeiterZuKurs
                System.out.println("Test Case: verteilenMitarbeiterZuKurs");
                unternehmen.verteilenMitarbeiterZuKurs(kurs1);
                unternehmen.verteilenMitarbeiterZuKurs(kurs2);

                // Verify Mitarbeiter assignment for kurs1
                System.out.println("Mitarbeiter assigned to " + kurs1.getKursName() + ":");
                for (Mitarbeiter mitarbeiter : kurs1.getMitarbeiterList()) {
                        System.out.println(mitarbeiter.getVorname() + " " + mitarbeiter.getNachname());
                }

                // Verify Mitarbeiter assignment for kurs2
                System.out.println("Mitarbeiter assigned to " + kurs2.getKursName() + ":");
                for (Mitarbeiter mitarbeiter : kurs2.getMitarbeiterList()) {
                        System.out.println(mitarbeiter.getVorname() + " " + mitarbeiter.getNachname());
                }

                // Test Case: gibtEsUnbesetzteModule
                System.out.println("Test Case: gibtEsUnbesetzteModule");
                boolean gibtUnbesetzteModuleInKurs1 = unternehmen.gibtEsUnbesetzteModule(kurs1);
                System.out.println("Unbesetzte Module in " + kurs1.getKursName() + ": " + gibtUnbesetzteModuleInKurs1);

                boolean gibtUnbesetzteModuleInKurs2 = unternehmen.gibtEsUnbesetzteModule(kurs2);
                System.out.println("Unbesetzte Module in " + kurs2.getKursName() + ": " + gibtUnbesetzteModuleInKurs2);

                // Test Case: verteilenMitarbeiterZuKursHilfe
                System.out.println("Test Case: verteilenMitarbeiterZuKursHilfe");
                unternehmen.verteilenMitarbeiterZuKursHilfe(kurs1);

                // Verify Mitarbeiter assignment for each module in kurs1
                System.out.println("Modules and their assigned Mitarbeiter in " + kurs1.getKursName() + ":");
                for (Modul modul : kurs1.getModulList()) {
                        System.out.println(
                                        "Modul: " + modul.getModulName() + ", Mitarbeiter: "
                                                        + (modul.getMitarbeiter() != null
                                                                        ? modul.getMitarbeiter().getVorname() + " "
                                                                                        + modul.getMitarbeiter()
                                                                                                        .getNachname()
                                                                        : "None"));
                }
        }

}

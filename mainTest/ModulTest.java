package mainTest;

import kurs.Modul;
import kurs.Aufgabe;
import enumKlass.ModulName;

import java.time.LocalDate;
import java.util.ArrayList;

public class ModulTest {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2024, 1, 1);
        LocalDate end = LocalDate.of(2024, 1, 5);
        ArrayList<Aufgabe> aufgaben = new ArrayList<>();
        aufgaben.add(new Aufgabe("Test Aufgabe", 3, ModulName.Java));
        Modul modul = new Modul(start, end, ModulName.Java, aufgaben);

        // Test basic attributes
        assert modul.getStartDatum().equals(start);
        assert modul.getEndDatum().equals(end);
        assert modul.getModulName() == ModulName.Java;
        assert modul.getTageAnzahl() == 5;
        assert modul.getAufgabenList().equals(aufgaben);

        // Test addAufgabe
        Aufgabe newAufgabe = new Aufgabe("Neue Aufgabe", 2, ModulName.Java);
        modul.addAufgabe(newAufgabe);
        assert modul.getAufgabenList().size() == 2;

        // Test pruefenTagMindsterAufgabe
        assert modul.pruefenTagMindsterAufgabe().equals(newAufgabe);

        // Test isWeekend (should throw exception)
        try {
            modul.isWeekend(LocalDate.of(2024, 1, 6));
            assert false;
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("2024-01-06 is a weekend.");
        }

        System.out.println("ModulTest passed");
    }
}
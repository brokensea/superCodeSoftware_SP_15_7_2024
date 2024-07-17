package mainTest;

import person.Mitarbeiter;
import kurs.Modul;
import enumKlass.ModulName;

import java.time.LocalDate;
import java.util.ArrayList;

public class MitarbeiterTest {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter = new Mitarbeiter("Max", "Mustermann", "Musterstraße 1");

        // Test basic attributes
        assert mitarbeiter.getVorname().equals("Max");
        assert mitarbeiter.getNachname().equals("Mustermann");
        assert mitarbeiter.getAddress().equals("Musterstraße 1");
        assert mitarbeiter.getLizenzenList().isEmpty();
        assert mitarbeiter.getModulList().isEmpty();

        // Test addLizenzen and addModul
        mitarbeiter.addLizenzen(ModulName.Java);
        assert mitarbeiter.getLizenzenList().size() == 1;

        LocalDate start = LocalDate.of(2024, 1, 1);
        LocalDate end = LocalDate.of(2024, 1, 5);
        Modul modul = new Modul(start, end, ModulName.Java, new ArrayList<>());
        mitarbeiter.addModul(modul);
        assert mitarbeiter.getModulList().size() == 1;

        // Test istFrei
        assert !mitarbeiter.istFrei(LocalDate.of(2024, 1, 3));
        assert mitarbeiter.istFrei(LocalDate.of(2024, 1, 6));

        System.out.println("MitarbeiterTest passed");
    }
}

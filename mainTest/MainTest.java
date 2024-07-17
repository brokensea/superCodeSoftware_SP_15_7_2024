package mainTest;

import person.*;
import unternehmen.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import enumKlass.*;
import kurs.*;

public class MainTest {

    // set up AufgabeList
    private static Aufgabe aufgabe_1 = new Aufgabe("java OOP Übung", 1);
    private static Aufgabe aufgabe_2 = new Aufgabe("java OOP2 Vertiefung", 2);
    private static Aufgabe aufgabe_3 = new Aufgabe("java OOP3 Vertiefung", 3);
    private static ArrayList<Aufgabe> aufgabeList = new ArrayList<>(Arrays.asList(aufgabe_1, aufgabe_2, aufgabe_3));

    // set up ModulList
    private static Modul java = new Modul(LocalDate.of(2024, 6, 10), LocalDate.of(2024, 7, 30), ModulName.Java,
            aufgabeList);
    private static Modul backend = new Modul(LocalDate.of(2024, 7, 10), LocalDate.of(2024, 8, 30), ModulName.Backend,
            aufgabeList);
    private static ArrayList<Modul> modulList_java = new ArrayList<>(Arrays.asList(java, backend));

    // set up MitarbeiterList
    private static Mitarbeiter mitarbeiter_Zana = new Mitarbeiter("Zana", "Zana", "Düsseldorf", modulList_java,
            modulList_java);
    private static Mitarbeiter mitarbeiter_Aheimeld = new Mitarbeiter("Aheimeld", "Aheimeld", "Hamburg", modulList_java,
            modulList_java);
    private static ArrayList<Mitarbeiter> mitarbeitersList_java = new ArrayList<>(Arrays.asList(mitarbeiter_Zana,
            mitarbeiter_Aheimeld));

    // Main test
    public static void main(String[] args) {
        // personTest();
    }

    public static void personTest() {
        java.addMitarbeiter(mitarbeiter_Aheimeld);
        java.addMitarbeiter(mitarbeiter_Zana);
        System.out.println(java.toString());
    }

    public static void kursTest() {

    }

    public static void unternehmenTest() {

    }

}
// set up Modul list
// Backend,
// Frondend,
// Java,
// Javascript,
// Datenbank,
// Spring,
// HTML,
// CSS;

// Modul frondend = new Modul(LocalDate.of(2024, 8, 10), LocalDate.of(2024, 9,
// 30), ModulName.Frondend,
// aufgabeList);

// Modul javascript = new Modul(LocalDate.of(2024, 10, 10), LocalDate.of(2024,
// 11, 30), ModulName.Javascript,
// aufgabeList);
// Modul datenbank = new Modul(LocalDate.of(2024, 12, 10), LocalDate.of(2024,
// 12, 30), ModulName.Datenbank,
// aufgabeList);
// mitarbeiter_Aheimeld.istFrei(LocalDate.of(2024, 6, 15));
// System.out.println(mitarbeiter_Aheimeld.toString());
// ArrayList<Modul> modulList_frontEnd = new
// ArrayList<>(Arrays.asList(javascript, frondend));
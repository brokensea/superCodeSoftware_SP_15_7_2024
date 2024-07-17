package mainTest;

import person.*;
import unternehmen.*;

import java.lang.classfile.attribute.ModuleResolutionAttribute;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import enumKlass.*;
import kurs.*;

public class MainTest {
    public static void main(String[] args) {
        personTest();
    }

    public static void personTest() {
        // set up AufgabeList
        Aufgabe aufgabe_1 = new Aufgabe("java OOP Übung", 1);
        Aufgabe aufgabe_2 = new Aufgabe("java OOP2 Vertiefung", 2);
        Aufgabe aufgabe_3 = new Aufgabe("java OOP3 Vertiefung", 3);

        ArrayList<Aufgabe> aufgabeList = new ArrayList<>(Arrays.asList(aufgabe_1, aufgabe_2, aufgabe_3));

        // set up Modul list
        // Backend,
        // Frondend,
        // Java,
        // Javascript,
        // Datenbank,
        // Spring,
        // HTML,
        // CSS;

        Modul java = new Modul(LocalDate.of(2024, 6, 10), LocalDate.of(2024, 7, 30), ModulName.Java, aufgabeList);

        Modul backend = new Modul(LocalDate.of(2024, 7, 10), LocalDate.of(2024, 8, 30), ModulName.Backend, aufgabeList);

        // Modul frondend = new Modul(LocalDate.of(2024, 8, 10), LocalDate.of(2024, 9,
        // 30), ModulName.Frondend,
        // aufgabeList);

        // Modul javascript = new Modul(LocalDate.of(2024, 10, 10), LocalDate.of(2024,
        // 11, 30), ModulName.Javascript,
        // aufgabeList);

        ArrayList<Modul> modulList_java = new ArrayList<>(Arrays.asList(java, backend));
        // ArrayList<Modul> modulList_frontEnd = new
        // ArrayList<>(Arrays.asList(javascript, frondend));

        Mitarbeiter mitarbeiter_Zana = new Mitarbeiter("Zana", "Zana", "Düsseldorf", modulList_java, modulList_java);

        Mitarbeiter mitarbeiter_Aheimeld = new Mitarbeiter("Aheimeld", "Aheimeld", "Hamburg", modulList_java,
                modulList_java);

        ArrayList<Mitarbeiter> mitarbeitersList_java = new ArrayList<>(Arrays.asList(mitarbeiter_Zana,
                mitarbeiter_Aheimeld));

        java.addMitarbeiter(mitarbeiter_Aheimeld);
        java.addMitarbeiter(mitarbeiter_Zana);

        // mitarbeiter_Aheimeld.istFrei(LocalDate.of(2024, 6, 15));
        // System.out.println(mitarbeiter_Aheimeld.toString());

        System.out.println(java.toString());
    }

    public static void kursTest() {
        // Modul datenbank = new Modul(LocalDate.of(2024, 12, 10), LocalDate.of(2024,
        // 12, 30), ModulName.Datenbank,
        // aufgabeList);

    }

    public static void unternehmenTest() {

    }

}

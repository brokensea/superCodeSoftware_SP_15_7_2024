package mainTest;

import enumKlass.ModulName;
import kurs.Aufgabe;

public class AufgabeTest {
    public static void main(String[] args) {
        Aufgabe aufgabe = new Aufgabe("Test Aufgabe", 3, ModulName.Java);

        // Test getters
        assert aufgabe.getAufgabeID() == 0;
        assert aufgabe.getBeschreiben().equals("Test Aufgabe");
        assert aufgabe.getDauern() == 3;
        assert aufgabe.getModulname() == ModulName.Java;

        // Test setters
        aufgabe.setBeschreiben("Updated Aufgabe");
        aufgabe.setDauern(5);
        aufgabe.setModulname(ModulName.CSS);

        assert aufgabe.getBeschreiben().equals("Updated Aufgabe");
        assert aufgabe.getDauern() == 5;
        assert aufgabe.getModulname() == ModulName.CSS;

        // Test toString
        assert aufgabe.toString().contains("Updated Aufgabe");

        System.out.println("AufgabeTest passed");
    }
}
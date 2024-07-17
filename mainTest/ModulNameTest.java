package mainTest;

import enumKlass.ModulName;

public class ModulNameTest {
    public static void main(String[] args) {
        // Check if ModulName enum contains all expected values
        assert ModulName.valueOf("Backend") == ModulName.Backend;
        assert ModulName.valueOf("Frondend") == ModulName.Frondend;
        assert ModulName.valueOf("Java") == ModulName.Java;
        assert ModulName.valueOf("Javascript") == ModulName.Javascript;
        assert ModulName.valueOf("Datenbank") == ModulName.Datenbank;
        assert ModulName.valueOf("Spring") == ModulName.Spring;
        assert ModulName.valueOf("HTML") == ModulName.HTML;
        assert ModulName.valueOf("CSS") == ModulName.CSS;

        System.out.println("ModulNameTest passed");
    }
}

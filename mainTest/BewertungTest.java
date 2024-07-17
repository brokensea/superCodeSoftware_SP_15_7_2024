package mainTest;

import enumKlass.Bewertung;

public class BewertungTest {
    public static void main(String[] args) {

        // Test getNote()
        assert Bewertung.SEHR_GUT.getNote() == 5;
        assert Bewertung.GUT.getNote() == 4;
        assert Bewertung.ZUFRIEDEN.getNote() == 3;
        assert Bewertung.NICHT_ZUFRIEDEN.getNote() == 2;
        assert Bewertung.SCHLECHT.getNote() == 1;

        // Test toString()
        assert Bewertung.SEHR_GUT.toString().equals("SEHR_GUT: note = 5");

        // Test getByNote()
        assert Bewertung.getByNote(5) == Bewertung.SEHR_GUT;
        assert Bewertung.getByNote(4) == Bewertung.GUT;
        assert Bewertung.getByNote(3) == Bewertung.ZUFRIEDEN;
        assert Bewertung.getByNote(2) == Bewertung.NICHT_ZUFRIEDEN;
        assert Bewertung.getByNote(1) == Bewertung.SCHLECHT;

        // Test getByNote() with invalid note
        try {
            Bewertung.getByNote(6);
            assert false;
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("No enum constant found for note: 6");
        }

        System.out.println("BewertungTest passed");
    }
}

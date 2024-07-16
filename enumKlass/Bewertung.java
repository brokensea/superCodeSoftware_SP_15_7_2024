package enumKlass;

public enum Bewertung {
    SEHR_GUT(5),
    GUT(4),
    ZUFRIEDEN(3),
    NICHT_ZUFRIEDEN(2),
    SCHLECHT(1);

    private final int note;

    Bewertung(int note) {
        this.note = note;
    }

    public int getNote() {
        return note;
    }

    @Override
    public String toString() {
        return name() + ": note = " + note;
    }

    public static Bewertung getByNote(int note) {
        for (Bewertung bewertung : Bewertung.values()) {
            if (bewertung.getNote() == note) {
                return bewertung;
            }
        }
        throw new IllegalArgumentException("No enum constant found for note: " + note);
    }

}

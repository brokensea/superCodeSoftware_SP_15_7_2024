package person;

import java.time.LocalDate;

import kurs.Kurs;
import enumKlass.Bewertung;

public class Teilnehmer extends Person {

    private boolean hatArbeit;
    private String unternehmer;
    private Kurs kurs;
    private LocalDate arbeitgefundenZeit;
    private Bewertung bewertungKurs;
    private String rueckmeldung;

    public Teilnehmer(String vorname, String nachname, String address, String unternehmer, boolean hatArbeit,
            LocalDate arbeitgefundenZeit,
            Kurs kurs, Bewertung bewertungKurs, String rueckmeldung) {
        super(vorname, nachname, address);

        this.setHatArbeit(hatArbeit);
        this.setUnternehmer(unternehmer);
        this.setArbeitgefundenZeit(arbeitgefundenZeit);
        this.setKurs(kurs);
        this.setBewertungKurs(bewertungKurs);
        this.setRueckmeldung(rueckmeldung);
    }

    public Teilnehmer(String vorname, String nachname, String address,
            Kurs kurs, Bewertung bewertungKurs, String rueckmeldung) {
        super(vorname, nachname, address);

        this.setHatArbeit(false);
        this.setUnternehmer("kein Unternehmer");
        this.setArbeitgefundenZeit(LocalDate.of(0, 0, 0));
        this.setKurs(kurs);
        this.setBewertungKurs(bewertungKurs);
        this.setRueckmeldung(rueckmeldung);
    }

    public String getRueckmeldung() {
        return rueckmeldung;
    }

    public void setRueckmeldung(String rueckmeldung) {
        this.rueckmeldung = rueckmeldung;
    }

    public Bewertung getBewertungKurs() {
        return bewertungKurs;
    }

    public void setBewertungKurs(Bewertung bewertungKurs) {
        this.bewertungKurs = bewertungKurs;
    }

    public boolean isHatArbeit() {
        return hatArbeit;
    }

    public void setHatArbeit(boolean hatArbeit) {
        this.hatArbeit = hatArbeit;
    }

    public String getUnternehmer() {
        return unternehmer;
    }

    public void setUnternehmer(String unternehmer) {
        this.unternehmer = unternehmer;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public LocalDate getArbeitgefundenZeit() {
        return arbeitgefundenZeit;
    }

    public void setArbeitgefundenZeit(LocalDate arbeitgefundenZeit) {
        this.arbeitgefundenZeit = arbeitgefundenZeit;
    }

    @Override
    public String toString() {
        return "Teilnehmer{" +
                "hatArbeit=" + hatArbeit +
                ", unternehmer='" + unternehmer + '\'' +
                ", kurs=" + kurs +
                ", arbeitgefundenZeit=" + arbeitgefundenZeit +
                ", vorname='" + getVorname() + '\'' +
                ", nachname='" + getNachname() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }

}

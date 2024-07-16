package person;

import java.time.LocalDate;

import javax.xml.crypto.Data;

import kurs.Kurs;

public class Teilnehmer extends Person {

    private boolean hatArbeit;
    private String unternehmer;
    private Kurs kurs;
    private LocalDate arbeitgefundenZeit;

    public Teilnehmer(String vorname, String nachname, String address, String unternehmer, boolean hatArbeit,
            LocalDate arbeitgefundenZeit,
            Kurs kurs) {
        super(vorname, nachname, address);

        this.setHatArbeit(hatArbeit);
        this.setUnternehmer(unternehmer);
        this.setArbeitgefundenZeit(arbeitgefundenZeit);
        this.setKurs(kurs);
    }

    public Teilnehmer(String vorname, String nachname, String address,
            Kurs kurs) {
        super(vorname, nachname, address);

        this.setHatArbeit(false);
        this.setUnternehmer("kein Unternehmer");
        this.setArbeitgefundenZeit(LocalDate.of(0, 0, 0));
        this.setKurs(kurs);
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

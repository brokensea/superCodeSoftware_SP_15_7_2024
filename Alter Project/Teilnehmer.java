package superCodeSoftware_SP_15_7_2024;

import java.time.LocalDate;


    public class Teilnehmer extends Person {
        private boolean hatArbeit;
        private String unternehmer;
        private Kurs kurs;
        private LocalDate arbeitgefundenZeit;

        
        public Teilnehmer(String vorname, String nachname, String adress, boolean hatArbeit, String unternehmer, Kurs kurs, LocalDate arbeitgefundenZeit) {
            super(vorname, nachname, adress);
            this.hatArbeit = hatArbeit;
            this.unternehmer = unternehmer;
            this.kurs = kurs;
            this.arbeitgefundenZeit = arbeitgefundenZeit;
        }

        // Getter and Setter for hatArbeit
        public boolean isHatArbeit() {
            return hatArbeit;
        }

        public void setHatArbeit(boolean hatArbeit) {
            this.hatArbeit = hatArbeit;
        }

        // Getter and Setter for unternehmer
        public String getUnternehmer() {
            return unternehmer;
        }

        public void setUnternehmer(String unternehmer) {
            this.unternehmer = unternehmer;
        }

        // Getter and Setter for kurs
        public Kurs getKurs() {
            return kurs;
        }

        public void setKurs(Kurs kurs) {
            this.kurs = kurs;
        }

        // Getter and Setter for arbeitgefundenZeit
        public LocalDate getArbeitgefundenZeit() {
            return arbeitgefundenZeit;
        }

        public void setArbeitgefundenZeit(LocalDate arbeitgefundenZeit) {
            this.arbeitgefundenZeit = arbeitgefundenZeit;
        }
    }

package unternehmen;

import java.time.LocalDate;
import java.util.ArrayList;

import kurs.Kurs;
import person.Mitarbeiter;
import person.Teilnehmer;

public class VerwaltungsBildungUnternehmen {
    private String unternehmen;
    private String name;
    private String chef;
    private LocalDate begruendungsdatum;
    private String kategorie;
    private ArrayList<Kurs> kursList;

    ArrayList<Mitarbeiter> mitarbeiterList;
    private ArrayList<Teilnehmer> teilnehmenList;
}

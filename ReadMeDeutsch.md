VerwaltungsBildungUnternehmenTest

Dieses Dokument beschreibt den Aufbau und die Funktionsweise des Java-Programms VerwaltungsBildungUnternehmenTest. Es zeigt, wie verschiedene Klassen und Methoden zusammenarbeiten, um eine Bildungseinrichtung zu verwalten und zu testen.

Einleitung

Dieses Programm simuliert die Verwaltung eines Bildungsunternehmens. Es umfasst Klassen zur Verwaltung von Kursen, Modulen, Aufgaben, Mitarbeitern und Teilnehmern. Die Hauptklasse VerwaltungsBildungUnternehmenTest enthält Testfälle, um die Funktionalität des Systems zu überprüfen.

Projektstruktur

Das Projekt besteht aus den folgenden Klassen:

    •    VerwaltungsBildungUnternehmen
    •    Kurs
    •    Modul
    •    Aufgabe
    •    Mitarbeiter
    •    Teilnehmer
    •    Bewertung (enum)
    •    ModulName (enum)

Klassendefinitionen

VerwaltungsBildungUnternehmen

- int rechnenDurchsnittlichArbeitFindenZeit(Kurs kurs)
  Berechnet die durchschnittliche Zeit (in Tagen), die Teilnehmer eines bestimmten Kurses benötigen, um nach Kursende eine Arbeit zu finden.

- double rechnenPozentArbeitFinden(Kurs kurs)
  Berechnet den Prozentsatz der Teilnehmer eines bestimmten Kurses, die eine Arbeit gefunden haben.

- int findPassendAnzahl(Mitarbeiter mitarbeiter, Kurs kurs)
  Findet die Anzahl der passenden Module, die ein Mitarbeiter für einen Kurs hat.

- Mitarbeiter findMaxPassendMitarbeiterzuKurs(Kurs kurs)
  Findet den am besten geeigneten Mitarbeiter für einen bestimmten Kurs.

- void verteilenMitarbeiterZuKurs(Kurs kurs)
  Weist den am besten geeigneten Mitarbeiter einem Kurs zu.

- boolean prufenObKursHatZuWeinigAufgabe(Kurs kurs)
  Überprüft, ob ein Kurs genügend Aufgaben hat.

- Mitarbeiter rechnenWeinigestenModul()
  Berechnet den Mitarbeiter mit der geringsten Anzahl an Modulen.

- Kurs findenMaxBewertungKurs()
  Findet den Kurs mit der höchsten Bewertung.

- Kurs findenMinBewertungKurs()
  Findet den Kurs mit der niedrigsten Bewertung.

Repräsentiert das Bildungsunternehmen und enthält Methoden zur Verwaltung von Kursen, Mitarbeitern und Teilnehmern.

Kurs

Stellt einen Kurs dar, der aus mehreren Modulen besteht.

Modul

Ein Modul ist Teil eines Kurses und enthält Aufgaben.

Aufgabe

Repräsentiert eine Aufgabe innerhalb eines Moduls.

Mitarbeiter

Repräsentiert einen Mitarbeiter, der verschiedene Lizenzen haben kann, um Module zu unterrichten.

Teilnehmer

Stellt einen Teilnehmer eines Kurses dar, der eine Bewertung und eine Rückmeldung zum Kurs geben kann.

Bewertung

Ein Enum, das die verschiedenen Bewertungskategorien eines Kurses darstellt (z.B. GUT, SCHLECHT).

ModulName

Ein Enum, das die verschiedenen Modulnamen (z.B. Java, HTML, CSS) darstellt.

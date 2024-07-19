Datenflussdiagramm (DFD) für das Projekt "VerwaltungsBildungUnternehmen"
Ebene 0 (Kontextdiagramm)
Das Kontextdiagramm stellt das gesamte System "VerwaltungsBildungUnternehmen" und seine Interaktionen mit externen Entitäten dar.

1. Unternehmen:
   Datenfluss: übermittelt Unternehmensinformationen an das System und empfängt Berichte.
2. Mitarbeiter:
   Datenfluss: fügt Mitarbeiterinformationen hinzu und empfängt Kurszuweisungen.
3. Teilnehmer:
   Datenfluss: meldet sich für Kurse an und empfängt Kursdetails und Ergebnisse.
4. Kurs:
   Datenfluss: erstellt und verwaltet Kursinformationen, Modulzuweisungen und Teilnehmerdaten.

Ebene 1 (Hauptebenen der Prozesse)
Die Ebene 1 des DFD zeigt die Hauptprozesse des Systems und deren Interaktionen mit Datenspeichern und externen Entitäten.

1. Verwalten von Kursen:
   Eingaben: Kursinformationen, Modulinformationen
   Ausgaben: Kurslisten, Kursberichte
   Datenspeicher: Kursdatenbank
2. Verwalten von Mitarbeitern:
   Eingaben: Mitarbeiterinformationen, Lizenzen
   Ausgaben: Mitarbeiterlisten, Zuweisungen
   Datenspeicher: Mitarbeiterdatenbank
3. Verwalten von Teilnehmern:
   Eingaben: Teilnehmerinformationen, Kursanmeldungen
   Ausgaben: Teilnehmerlisten, Ergebnisse
   Datenspeicher: Teilnehmerdatenbank
4. Verwalten von Aufgaben:
   Eingaben: Aufgabedetails, Modulzuweisungen
   Ausgaben: Aufgabenlisten
   Datenspeicher: Aufgabendatenbank

Detaillierte Prozesse (z.B. Verwalten von Kursen)
Ein detaillierteres DFD für den Prozess "Verwalten von Kursen" zeigt die spezifischen Unterprozesse und deren Datenflüsse.

1. Kurs erstellen:
   Eingaben: Kursname, Startdatum, Enddatum
   Ausgaben: Neuer Kursdatensatz
   Datenspeicher: Kursdatenbank
2. Modul zu Kurs hinzufügen:
   Eingaben: KursID, ModulID
   Ausgaben: Aktualisierter Kursdatensatz
   Datenspeicher: Kursdatenbank
3. Teilnehmer zu Kurs hinzufügen:
   Eingaben: KursID, TeilnehmerID
   Ausgaben: Aktualisierter Kursdatensatz
   Datenspeicher: Kursdatenbank

Erklärung:
Das Datenflussdiagramm (DFD) für das "VerwaltungsBildungUnternehmen"-System stellt die Struktur und den Datenfluss innerhalb des Systems dar.

Ebene 0 (Kontextdiagramm)
Das Kontextdiagramm zeigt, wie das System mit externen Entitäten wie Unternehmen, Mitarbeitern, Teilnehmern und Kursen interagiert. Diese Entitäten kommunizieren mit dem System, indem sie Daten senden und empfangen.

Ebene 1 (Hauptebenen der Prozesse)
In der ersten Ebene des DFD werden die Hauptprozesse des Systems dargestellt: Verwalten von Kursen, Verwalten von Mitarbeitern, Verwalten von Teilnehmern und Verwalten von Aufgaben. Jeder dieser Prozesse interagiert mit spezifischen Datenspeichern und externen Entitäten.

Detaillierte Prozesse (z.B. Verwalten von Kursen)
Ein detaillierteres DFD für den Prozess "Verwalten von Kursen" zeigt die spezifischen Schritte, die erforderlich sind, um Kurse zu erstellen, Module hinzuzufügen und Teilnehmer zu verwalten. Dies hilft, die Interaktionen und Datenflüsse innerhalb dieses Prozesses genauer zu verstehen.

Diese DFDs bieten eine klare visuelle Darstellung der Funktionsweise des Systems und erleichtern das Verständnis der Datenflüsse und der Systemstruktur.

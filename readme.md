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

Ziel des Projekts:

Das Hauptziel besteht darin, die Prinzipien der objektorientierten Programmierung in Java zu erlernen und anzuwenden. Die Aufgabe ist realistisch und praxisorientiert, und sie bietet Einblicke in die Fun fördert die Zusammenarbeit und Kommunikation, wesentliche Fähigkeiten ktionsweise der Softwareentwicklung in der realen Welt. Die Arbeit im Teamin der Softwareentwicklung. Das Projekt ist anspruchsvoll und ermutigt dazu, die eigenen Fähigkeiten zu erweitern und anzuwenden. Darüber hinaus bietet das Projekt Raum für kreative Lösungen und Eigeninitiative.



EducationalCompanyManagement
This document describes the structure and functionality of the Java program VerwaltungsBildungUnternehmenTest. It demonstrates how various classes and methods collaborate to manage and test an educational institution.

Introduction
This program simulates the administration of an educational company. It includes classes for managing courses, modules, tasks, employees, and participants. The main class VerwaltungsBildungUnternehmenTest contains test cases to verify the system's functionality.

Project Structure
The project consists of the following classes:

VerwaltungsBildungUnternehmen
Kurs (Course)
Modul (Module)
Aufgabe (Task)
Mitarbeiter (Employee)
Teilnehmer (Participant)
Bewertung (Rating) (enum)
ModulName (Module Name) (enum)
Class Definitions
VerwaltungsBildungUnternehmen

int rechnenDurchsnittlichArbeitFindenZeit(Kurs kurs)
Calculates the average time (in days) participants of a specific course take to find a job after completing the course.

double rechnenPozentArbeitFinden(Kurs kurs)
Calculates the percentage of participants in a specific course who have found a job.

int findPassendAnzahl(Mitarbeiter mitarbeiter, Kurs kurs)
Finds the number of matching modules an employee has for a course.

Mitarbeiter findMaxPassendMitarbeiterzuKurs(Kurs kurs)
Finds the most suitable employee for a specific course.

void verteilenMitarbeiterZuKurs(Kurs kurs)
Assigns the most suitable employee to a course.

boolean prufenObKursHatZuWeinigAufgabe(Kurs kurs)
Checks if a course has enough tasks.

Mitarbeiter rechnenWeinigestenModul()
Calculates the employee with the least number of modules.

Kurs findenMaxBewertungKurs()
Finds the course with the highest rating.

Kurs findenMinBewertungKurs()
Finds the course with the lowest rating.

Represents the educational company and contains methods to manage courses, employees, and participants.

Kurs (Course)

Represents a course consisting of multiple modules.

Modul (Module)

A module that is part of a course and contains tasks.

Aufgabe (Task)

Represents a task within a module.

Mitarbeiter (Employee)

Represents an employee who can have various licenses to teach modules.

Teilnehmer (Participant)

Represents a participant in a course who can provide a rating and feedback.

Bewertung (Rating)

An enum representing different rating categories of a course (e.g., GOOD, BAD).

ModulName (Module Name)

An enum representing different module names (e.g., Java, HTML, CSS).

Project Goal
The primary goal is to learn and apply the principles of object-oriented programming in Java. The task is realistic and practice-oriented, providing insights into how software development operates in the real world. Working in a team fosters collaboration and communication, essential skills in software development. The project is challenging, encouraging the expansion and application of one's skills. Additionally, the project provides opportunities for creative solutions and personal initiative.

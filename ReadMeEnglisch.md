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

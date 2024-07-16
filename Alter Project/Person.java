package superCodeSoftware_SP_15_7_2024;

public class Person {
    private String vorname;
    private String nachname;
    private String adress;


    public Person(String vorname, String nachname, String adress) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.adress = adress;
    }

 // Getter and Setter for vorname
 public String getVorname() {
    return vorname;
}

public void setVorname(String vorname) {
    this.vorname = vorname;
}

// Getter and Setter for nachname
public String getNachname() {
    return nachname;
}

public void setNachname(String nachname) {
    this.nachname = nachname;
}

// Getter and Setter for adress
public String getAdress() {
    return adress;
}

public void setAdress(String adress) {
    this.adress = adress;
}

}

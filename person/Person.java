package person;

public class Person {
    private String vorname;
    private String nachname;
    private String address;

    public Person(String vorname, String nachname, String address) {
        this.setVorname(vorname);
        this.setNachname(nachname);
        ;
        this.setAddress(address);
        ;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}

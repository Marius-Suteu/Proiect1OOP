//Conceptul angajat
public class Angajati {
    private String nume;
    private String prenume;
    private String CNP;
    private String serie;
    private String adresa;
    private String departament;
    private double salariu;
    public static int numarAngajati = 0;// Variabila pentru a tine evidenta numarului
    // de angajati adaugati

    public Angajati(String nume, String prenume, String CNP, String serie,
            String adresa, String departament, double salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.serie = serie;
        this.adresa = adresa;
        this.departament = departament;
        this.salariu = salariu;
        numarAngajati++;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getCNP() {
        return CNP;
    }

    public String getSerie() {
        return serie;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getDepartament() {
        return departament;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setDepartament(String department) {
        this.departament = department;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public String toString() {
        return nume + " " + prenume + " " + CNP + " " + serie + " "
                + adresa + " " + departament + " " + salariu;

    }

    public void marireSalariu(double suma) {
        salariu += suma;
    }

    public boolean penalitatiSalariu(double suma) {
        if (salariu < suma) {
            return false;
        }
        salariu = salariu - suma;
        return true;
    }
}
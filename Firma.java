import java.util.Scanner;

public class Firma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meniu;
        Angajati[] angajati = new Angajati[100]; // Creem un array pentru a
        // stoca angajatii.

        do {
            System.out.println("Afisare meniu: ");
            System.out.println("1. Adauga angajat: ");
            System.out.println("2. Afisare angajati firma: ");
            System.out.println("3. Afisare salar mediu firma: ");
            System.out.println("4. Marire salariu firma: ");
            System.out.println("0. Iesire meniu.");

            meniu = sc.nextInt();
            sc.nextLine(); // Consuma linia noua dupa citirea numarului vb

            switch (meniu) {
                case 1:
                    System.out.println("Introduceti numele:");
                    String nume = sc.nextLine();
                    System.out.println("Introduceti prenumele:");
                    String prenume = sc.nextLine();
                    System.out.println("Introduceti CNP:");
                    String CNP = sc.nextLine();
                    System.out.println("Introduceti seria buletinului:");
                    String serie = sc.nextLine();
                    System.out.println("Introduceti adresa:");
                    String adresa = sc.nextLine();
                    System.out.println("Introduceti departamentul:");
                    String departament = sc.nextLine();
                    System.out.println("Introduceti salariul:");
                    double salariu = sc.nextDouble();
                    sc.nextLine(); // Consuma linia noua dupa citirea
                    // salariului

                    // Creez un obiect Angajati cu datele introduse si il
                    // adaugam in array
                    angajati[Angajati.numarAngajati] = new Angajati(nume, prenume, CNP,
                            serie, adresa, departament, salariu);
                    System.out.println("Angajatul a fost adaugat cu succes!");
                    break;
                case 2:
                    // Implementeaza functionalitatea pentru afisarea
                    // angajatilor firmei
                    // Utilizez un for loop pentru a parcurge array-ul de
                    // angajati si afiseazaa detaliile fiecarui angajat
                    for (int i = 0; i < Angajati.numarAngajati; i++) {
                        System.out.println(angajati[i].toString());
                    }
                    break;
                case 3:
                    // Implementeaza functionalitatea pentru afisarea salariului
                    // mediu al firmei
                    double salariuMediu = 0.0;
                    for (int i = 0; i < Angajati.numarAngajati; i++) {
                        salariuMediu += angajati[i].getSalariu();
                    }
                    if (Angajati.numarAngajati > 0) {
                        salariuMediu /= Angajati.numarAngajati;
                    }
                    System.out.println("Salarul mediu al firmei este: " +
                            salariuMediu);
                    break;
                case 4:
                    // Implementeaza functionalitatea pentru marirea
                    // salariului firmei
                    System.out.println("Introduceti suma cu care doriti sa mariti salariul: ");
                    double sumaMarire = sc.nextDouble();
                    sc.nextLine(); // Consuma linia noua dupa citirea sumei
                    for (int i = 0; i < Angajati.numarAngajati; i++) {
                        angajati[i].marireSalariu(sumaMarire);
                    }
                    System.out.println("Salariul angajatilor a fost marit cu succes!");
                    break;
                case 0:

                    System.out.println("Iesire din meniu. La revedere!");
                    break;
                default:
                //In caz ca optiunea este invalida se afseaza mesajul:
                    System.out.println("Optiune invalida. Te rog sa alegi o optiune valida.");
                    break;
            }

        } while (meniu != 0);

    }
}

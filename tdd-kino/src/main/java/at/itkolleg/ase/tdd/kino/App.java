package at.itkolleg.ase.tdd.kino;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Dieses Beispiel stammt aus https://training.cherriz.de/cherriz-training/1.0.0/testen/junit5.html
 */
public class App 
{
    public static void main( String[] args )
    {
        //Saal anlegen
        Map<Character,Integer> map = new HashMap<>();
        map.put('A',10);
        map.put('B',10);
        map.put('C',15);
        KinoSaal ks = new KinoSaal("LadyX",map);

        //Platz prüfen
        System.out.println(ks.pruefePlatz('A',11));
        System.out.println(ks.pruefePlatz('A',10));
        System.out.println(ks.pruefePlatz('B',10));
        System.out.println(ks.pruefePlatz('C',14));

        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('A', 20);
        map1.put('B', 17);
        map1.put('C', 23);
        map1.put('D', 15);
        map1.put('E', 19);
        map1.put('F', 21);
        map1.put('G', 18);
        KinoSaal ks1 = new KinoSaal("Fantasy-Island", map1);

        System.out.println(ks1.pruefePlatz('A', 19));
        System.out.println(ks1.pruefePlatz('B', 19));
        System.out.println(ks1.pruefePlatz('C', 19));
        System.out.println(ks1.pruefePlatz('D', 19));
        System.out.println(ks1.pruefePlatz('E', 19));
        System.out.println(ks1.pruefePlatz('F', 19));
        System.out.println(ks1.pruefePlatz('G', 19));

        LocalDate date1 = LocalDate.now();

        Vorstellung v1 = new Vorstellung(ks1, Zeitfenster.ABEND, date1, "Eragon", 15.99f);
        Vorstellung v2 = new Vorstellung(ks1, Zeitfenster.NACHMITTAG, date1, "Harry Potter", 15.99f);
        Vorstellung v3 = new Vorstellung(ks1, Zeitfenster.NACHT, date1, "Herr der Ringe", 15.99f);
        Vorstellung v4 = new Vorstellung(ks1, Zeitfenster.ABEND, date1, "Super Mario", 15.99f);
        Vorstellung v5 = new Vorstellung(ks1, Zeitfenster.NACHMITTAG, date1, "Avatar", 15.99f);
        Vorstellung v6 = new Vorstellung(ks1, Zeitfenster.NACHT, date1, "Avengers", 15.99f);

        KinoVerwaltung kinoVerwaltung = new KinoVerwaltung();

        System.out.println("Vorstellungen einplanen: ");

        try {
            kinoVerwaltung.einplanenVorstellung(v1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            kinoVerwaltung.einplanenVorstellung(v2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            kinoVerwaltung.einplanenVorstellung(v3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            kinoVerwaltung.einplanenVorstellung(v4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            kinoVerwaltung.einplanenVorstellung(v5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            kinoVerwaltung.einplanenVorstellung(v6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            kinoVerwaltung.einplanenVorstellung(v6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Tickets verkaufen");

        try {
            System.out.println(v1.kaufeTicket('G', 10, 20.0f));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(v2.kaufeTicket('F', 20, 20.0f));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(v3.kaufeTicket('E', 10, 15.0f));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(v4.kaufeTicket('C', 25, 15.0f));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(v5.kaufeTicket('B', 10, 20.0f));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(v6.kaufeTicket('A', 5, 30.0f));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

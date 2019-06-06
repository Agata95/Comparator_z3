package com.javagda25.comparator.zadanie3;

// Stwórz komparator porównujący drużyny piłkarskie zgodnie z zasadami FIFA. Tj.
// Pola klasy DrużynaPiłkarska:
// bramki stracone,
// bramki trafione,
// mecze wygrane,
// mecze przegrane,
// mecze zremisowane,
// liczba punktów
// - kryterium punktów (im więcej tym lepiej)
// - kryterium bramek trafionych (im więcej tym lepiej)
// - kryterium bramek straconych (im mniej tym lepiej)
// - kryterium ... nazwy drużyny - alfabetycznie sortuje i wygrywa drużyna której nazwa (sortując alfabetycznie)
// byłaby pierwsza.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DruzynaPilkarska> druzynaPilkarskas = new ArrayList<>();

        druzynaPilkarskas.add(new DruzynaPilkarska("AAA", 13, 12,
                4, 2, 6, 50));
        druzynaPilkarskas.add(new DruzynaPilkarska("BBB", 13, 12,
                5, 1, 5, 50));
        druzynaPilkarskas.add(new DruzynaPilkarska("CCC", 13, 14,
                2, 3, 5, 47));
        druzynaPilkarskas.add(new DruzynaPilkarska("DDD", 12, 12,
                5, 2, 1, 47));

        Collections.sort(druzynaPilkarskas, new Comparator<DruzynaPilkarska>() {
            @Override
            public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
                if (o1.getLiczba_punktow() > o2.getLiczba_punktow()) {
                    return 1;
                } else if (o1.getLiczba_punktow() < o2.getLiczba_punktow()) {
                    return -1;
                }

                // jeżeli to nie wyłoni nam zwycięscy to:
                if (o1.getBramki_trafione() > o2.getBramki_trafione()) {
                    return 1;
                } else if (o1.getBramki_trafione() < o2.getBramki_trafione()) {
                    return -1;
                }

                // jeżeli to nie wyłoni nam zwycięscy to:
                if (o1.getBramki_stracone() > o2.getBramki_stracone()) {
                    return 1;
                } else if (o1.getBramki_stracone() < o2.getBramki_stracone()) {
                    return -1;
                }

                // jeżeli to nie wyłoni nam zwycięscy to:
                return o1.getNazwa_druzyny().compareTo(o2.getNazwa_druzyny()); // równe == 0
            }

        });

        System.out.println(druzynaPilkarskas);


    }
}

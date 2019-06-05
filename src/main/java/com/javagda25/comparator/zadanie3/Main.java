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
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DruzynaPilkarska> druzynaPilkarskas = new ArrayList<>();

        druzynaPilkarskas.add(new DruzynaPilkarska("AAA", 13, 12,
                4, 2, 6, 50));
        druzynaPilkarskas.add(new DruzynaPilkarska("BBB", 13, 12,
                5, 1, 5, 76));
        druzynaPilkarskas.add(new DruzynaPilkarska("CCC", 13, 12,
                2, 3, 7, 47));
        druzynaPilkarskas.add(new DruzynaPilkarska("DDD", 13, 12,
                5, 2, 1, 67));


    }
}

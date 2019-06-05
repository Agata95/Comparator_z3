package com.javagda25.comparator.zadanie3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class DruzynaPilkarska {
    private String nazwa_druzyny;
    private int bramki_stracone;
    private int bramki_trafione;
    private int mecze_wygrane;
    private int mecze_przegrane;
    private int mecze_zremisowane;
    private int liczba_punktow;
}

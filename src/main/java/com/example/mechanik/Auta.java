package com.example.mechanik;

import org.springframework.web.bind.annotation.RequestParam;

public class Auta {

    public String nazwa;
    public int predkosc;
    private boolean czyZepsute;

    public Auta(String nazwa) {

    }

    public boolean czyZepsute(){
     return czyZepsute;
    }


    public Auta(String nazwa, int predkosc){
        this.nazwa=nazwa;
        this.predkosc=predkosc;
        this.czyZepsute=true;
    }


}

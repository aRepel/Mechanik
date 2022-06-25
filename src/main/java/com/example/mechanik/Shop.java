package com.example.mechanik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.assembler.AutodetectCapableMBeanInfoAssembler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Shop {
    @Autowired
    private AutaLista listaAut;

    @RequestMapping("/ile")
    public int ileMamyAutDoNaprawy(){
        return listaAut.iloscAut();
    }

    @RequestMapping(
            value="/dodajAuto",
            method= RequestMethod.GET)
    public boolean dodajAuto(@RequestParam("n") String nazwa, @RequestParam("p") int predkosc){
        try{
            listaAut.dodawanieAuta(new Auta(nazwa, predkosc));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @RequestMapping(
            value="/usunAuto",
            method= RequestMethod.GET)
    public boolean usunAuto(String nazwa){
        try{
            listaAut.usuwanieAuta(new Auta(nazwa));
            return true;
        }catch (Exception e){
            return false;
        }
    }

}

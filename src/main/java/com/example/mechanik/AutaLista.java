package com.example.mechanik;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Component
public class AutaLista{

    private List<Auta> listaAut;
    public AutaLista(){
        this.listaAut= new ArrayList<>();
    }

    public void dodawanieAuta(Auta a){
        listaAut.add(a);
    }
    public void usuwanieAuta(Auta a){
        listaAut.remove(a);


    }
    @RequestMapping(
            value="/lista",
            method= RequestMethod.GET)
    public int iloscAut(){
        return listaAut.size();
    }

}

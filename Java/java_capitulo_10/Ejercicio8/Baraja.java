package Ejercicio8;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
//! Creo una colección para guardar las cartas en el mazo
    ArrayList<Carta> mazo = new ArrayList<Carta>();
//! Constructor el cual completa el mazo teniendo todas las cartas de cada palo, en total 46
    public Baraja(){
        for(int i = 0; i < Carta.palos.length; i ++){
            for(int j=0; j < Carta.numeros.length; j++){
                mazo.add(new Carta(i, j));
            }
        }
//! Mezcla las cartas del mazo (shuffle)
        Collections.shuffle(mazo);
    }

//! Quita una carta del mazo
    public Carta pop(){
        return mazo.remove(0);
    }
}



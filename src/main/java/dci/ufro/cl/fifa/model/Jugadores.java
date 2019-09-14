package dci.ufro.cl.fifa.model;

import dci.ufro.cl.fifa.services.lista.MyLinkedList;
import java.util.LinkedList;

public class Jugadores {

    private MyLinkedList<Jugador> jugadores;

    public Jugadores(MyLinkedList<Jugador> jugadores){
        this.jugadores =  jugadores;
    }

    public MyLinkedList<Jugador> getJugadores(){
        return this.jugadores;
    }

    public void setJugadores(MyLinkedList<Jugador> jugadores){
        this.jugadores = jugadores;
    }
}

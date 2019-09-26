package dci.ufro.cl.fifa.services;

public class DataClub {

private String nombreClub;
private int nJugadores;

    @Override
    public String toString() {
        return "DataClub{" +
                "nombreClub='" + nombreClub + '\'' +
                ", nJugadores=" + nJugadores +
                '}';
    }

    public DataClub(String k, Integer v) {
        this.nombreClub=k;
        this.nJugadores=v;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public int getnJugadores() {
        return nJugadores;
    }

    public void setnJugadores(int nJugadores) {
        this.nJugadores = nJugadores;
    }
}

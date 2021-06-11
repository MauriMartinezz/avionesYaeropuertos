package domain;

import java.util.List;

public class Viaje {
    private List<Escala> escalas;
    private List<Vuelo> vuelos;

    public List<Escala> getEscalas() {
        return escalas;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void agregarEscala(Escala escala){
        escalas.add(escala);
    }
    public void agregarVuelo(Vuelo vuelo){
        vuelos.add(vuelo);
    }
}

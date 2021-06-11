package domain;

import java.time.LocalDate;
import java.util.List;

public class Aeropuerto {
    private List<Escala> escalas;
    private Integer cantVuelosLlegaron;
    private Integer cantVuelosPartieron;
    private List<LocalDate> fecha;
    private List<Vuelo> vuelos;

    public void agregarEscala(Escala escala){
        this.escalas.add(escala);
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public Integer cantVuelosEnEscalas(){
        return this.escalas.size();
    }

    public Integer cantVuelosQueLlegaronEl(LocalDate dia){

        return 1;
    }
    public Integer cantVuelosQuePartieronEl(LocalDate dia){
        return 10;
    }
}

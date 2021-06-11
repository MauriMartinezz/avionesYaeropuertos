package domain;

import java.util.List;

public class Aerolinea {
    private Integer cantPasajeros;
    private String nombre;

    public Aerolinea(Integer cantPasajeros, String nombre){
        this.cantPasajeros = cantPasajeros;
        this.nombre = nombre;
    }

    public Integer getcantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(Integer cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }
    /*
    public Integer cantPasajeros(Integer mes, Integer year){
        return 5;
    }
*/
}

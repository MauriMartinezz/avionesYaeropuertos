package domain;

import java.util.Hashtable;

public class Pasajero extends Persona{
    public Pasajero(String nombre, String apellido, Integer nroDoc, TipoDeDoc tipoDeDoc, Integer cantVuelos){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroDoc = nroDoc;
        this.tipoDeDoc = tipoDeDoc;
        this.cantVuelos = cantVuelos;
    }
    @Override
    public Integer getCantVuelos() {
        return super.getCantVuelos();
    }
}

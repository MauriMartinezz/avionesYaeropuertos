package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    private List<Aeropuerto> aeropuertos;
    private String nombre;
    public Ciudad(String nombre, ArrayList<Aeropuerto> aeropuertos){
        this.aeropuertos = new ArrayList<Aeropuerto>();
        this.nombre = nombre;
    }
    public void agregarAeropuerto(Aeropuerto aeropuerto){
        this.aeropuertos.add(aeropuerto);
    }
    public Integer cantidadAeropuertos(){
        return this.aeropuertos.size();
    }

    public List<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer cantPasajerosQueLlegaron(LocalDate fecha){
        Integer cantPasajerosQueLlegaron = 0;
        for(int i=0; i<aeropuertos.size(); i++){
            for(int k=0; k<aeropuertos.get(k).getVuelos().size(); k++){
                if(aeropuertos.get(i).getVuelos().get(k).getFechaSalida() == fecha){
                    cantPasajerosQueLlegaron = cantPasajerosQueLlegaron + aeropuertos.get(i).getVuelos().get(k).getPasajeros();
                }
            }
        }
        return cantPasajerosQueLlegaron;
    }
}

package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vuelo {
    private Avion avion;
    private Aeropuerto destino;
    private Aeropuerto inicio;
    private Double duracionAproxEnMins;
    private LocalDate fechaSalida;
    private List<Pasajero> pasajeros;
    private Tripulacion tripulacion;

    public Vuelo(Avion avion, Aeropuerto inicio, LocalDate fechaSalida , Aeropuerto destino, Double duracionAproxEnMins){
        this.avion = avion;
        this.inicio = inicio;
        this.destino = destino;
        this.duracionAproxEnMins = duracionAproxEnMins;
        this.fechaSalida = fechaSalida;
        this.pasajeros = new ArrayList<>();
    }

    public Tripulacion getTripulacion() {
        return tripulacion;
    }
    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    };

    public void agregarPasajero(Pasajero pasajero){
        this.pasajeros.add(pasajero);
    }
    public void agregarPasajeros(Pasajero ... pasajeros){
        Collections.addAll(this.pasajeros, pasajeros);
    }

    public Double capacidadOcupadaPorPasajeros(){
        int pasajerosLength = getPasajeros().size();
        Double cantAsientosParaPasajeros = (this.avion.getCantAsientosTotales() - getTripulacion().cantPersonal().doubleValue());
        Double capacidadOcupadaPasajeros = (pasajerosLength*100)/cantAsientosParaPasajeros;

        return capacidadOcupadaPasajeros;


    }

    public Double duracionAproxEnMins(){
        return this.duracionAproxEnMins;
    }

    public  LocalDateTime fechaHoraAproxLlegada() {
        return fechaSalida.plusMinutes(duracionAproxEnMins);
    }

    public  LocalDate fechaAproxLlegada() {
        LocalDateTime fechaHoraAproxLlegada = fechaHoraAproxLlegada();
        LocalDate fechaAproxLlegada = LocalDate.of(fechaHoraAproxLlegada.getYear(), fechaHoraAproxLlegada.getMonth(), fechaHoraAproxLlegada.getDayOfMonth());
        return fechaAproxLlegada;
    }
}

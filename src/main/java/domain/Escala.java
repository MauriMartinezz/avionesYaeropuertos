package domain;

public class Escala {
    private Aeropuerto aeropuerto;
    private Double duracionAproxMins;
    public Escala(Aeropuerto aeropuerto, Double duracionAproxMins){
        this.aeropuerto = aeropuerto;
        this.duracionAproxMins = duracionAproxMins;
        this.aeropuerto.agregarEscala(this);
    }
    public Double DuracionAproxMins(){
        return this.duracionAproxMins;
    }
    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }
}

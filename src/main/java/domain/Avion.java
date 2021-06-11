package domain;

public class Avion {
    private Aerolinea aerolinea;
    private Integer cantAsientosTotales;

    public Avion(Aerolinea aerolinea, Integer cantAsientosTotales){
        this.aerolinea = aerolinea;
        this.cantAsientosTotales = cantAsientosTotales;
    }
    public Integer getCantAsientosTotales() {
        return cantAsientosTotales;
    }
}

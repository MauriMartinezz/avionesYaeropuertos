package domain;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected Integer nroDoc;
    protected TipoDeDoc tipoDeDoc;
    protected Integer cantVuelos;

    public String getNombre() {
        return nombre;
    }

    public Integer getCantVuelos() {
        return cantVuelos;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNroDoc() {
        return nroDoc;
    }

    public TipoDeDoc getTipoDeDoc() {
        return tipoDeDoc;
    }

    public Integer cantVuelosQueRealizo(Persona persona){
        return persona.getCantVuelos();
    }
}

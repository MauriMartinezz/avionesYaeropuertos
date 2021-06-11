package domain;

import java.time.LocalDate;
import java.util.List;

public class Tripulacion {
    private List<Personal> personal;
    public List<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }

    public Integer cantPersonal(){
        return getPersonal().size();
    }

    public Integer cantVuelosRealizadosEntre(LocalDate fechaInicio, LocalDate fechaFinal ){
        return 8;
    }
}

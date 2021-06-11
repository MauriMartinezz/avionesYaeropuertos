package domain;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VueloTest {
    private Avion boeing888;
    private Vuelo madrid;
    private Aerolinea latam;
    private LocalDate hoy;
    private Aeropuerto eze;
    private Aeropuerto col;
    private Escala escColombia;

    @Before
    public void init(){
        this.latam = new Aerolinea(188, "Latam");
        this.eze = new Aeropuerto();
        this.col = new Aeropuerto();
        this.boeing888 = new Avion(latam, 188);
        this.hoy = LocalDate.now();
        this.escColombia = new Escala(col, 15.0);


//        this.madrid = new Vuelo(boeing888, latam, hoy,)

    }
    @Test
    public void fecha(){
        this.col.agregarEscala(escColombia);
        System.out.println(col.cantVuelosEnEscalas());

//        System.out.println(LocalDate.parse("2019-08-19").getDayOfWeek());
        if(LocalDateTime.now().plusHours(25).isAfter(LocalDateTime.now()) ){
         System.out.println("yes");
        }

        return;
    }
}

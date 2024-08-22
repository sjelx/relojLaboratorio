package relojlaboratorio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reloj {

    private String dia;
    private int hora;
    private String modelo;

    public Reloj(String dia, int hora, String modelo) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Reloj{" +
                "dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public static void seteoHoraDia(Reloj reloj){
        LocalDate fechaAct = LocalDate.now();
        LocalTime horaAct = LocalTime.now();

        reloj.setDia(fechaAct.getDayOfWeek().name());
        reloj.setHora(horaAct.getHour());
    }

    public String mostrarDia(){
        LocalDate hoy = LocalDate.now();
        return dia + " | " + hoy;
    }

    public int mostrarHora(){
        return hora;
    }

    public void incrementarDia(int incrementoDay) {
        LocalDate fechaAct = LocalDate.now();
        System.out.println(fechaAct.plusDays(incrementoDay));
    }
}



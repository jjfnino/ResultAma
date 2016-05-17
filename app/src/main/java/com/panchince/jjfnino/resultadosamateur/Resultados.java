package com.panchince.jjfnino.resultadosamateur;

/**
 * Created by Fran on 16/5/2016.
 */
public class Resultados {

    private String equipo1;
    private String equipo2;
    private String goles1;
    private String goles2;
    private String fecha;
    private String torneo;
    private String hora;

    public Resultados(String equipo1, String equipo2, String goles1, String goles2, String fecha, String torneo, String hora) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.goles1 = goles1;
        this.goles2 = goles2;
        this.fecha = fecha;
        this.torneo = torneo;
        this.hora = hora;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public void setGoles1(String goles1) {
        this.goles1 = goles1;
    }

    public void setGoles2(String goles2) {
        this.goles2 = goles2;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTorneo(String torneo) {
        this.torneo = torneo;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEquipo1() {

        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public String getGoles1() {
        return goles1;
    }

    public String getGoles2() {
        return goles2;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTorneo() {
        return torneo;
    }

    public String getHora() {
        return hora;
    }
}

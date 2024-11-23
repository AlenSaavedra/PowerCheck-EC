package com.alensaavedra.powercheck.energycheck.Model;

import java.util.ArrayList;
import java.util.List;

public class Notificacion {
    private String alimentador;
    private String fechaCorte;
    private String horaDesde;
    private String horaHasta;
    private List<String> horarios = new ArrayList<>(); // Lista para almacenar los horarios

    // Getters y Setters
    public String getAlimentador() {
        return alimentador;
    }

    public void setAlimentador(String alimentador) {
        this.alimentador = alimentador;
    }

    public String getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(String fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public String getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(String horaDesde) {
        this.horaDesde = horaDesde;
    }

    public String getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(String horaHasta) {
        this.horaHasta = horaHasta;
    }

    public List<String> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<String> horarios) {
        this.horarios = horarios;
    }

    // Método para agregar un horario a la lista de horarios
    public void addHorario(String horaDesde, String horaHasta) {
        String horario = horaDesde + " - " + horaHasta;
        this.horarios.add(horario);
    }
}

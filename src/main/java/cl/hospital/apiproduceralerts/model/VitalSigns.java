package cl.hospital.apiproduceralerts.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class VitalSigns implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long pacienteId;
    private double frecuenciaCardiaca;
    private double presionArterial;
    private double nivelOxigeno;

    // Límites configurables
    private static final double MIN_PRESION_ARTERIAL = 50;
    private static final double MAX_PRESION_ARTERIAL = 120;
    private static final double MIN_NIVEL_OXIGENO = 90;


    public boolean isAnomalous() {
        return presionArterial < MIN_PRESION_ARTERIAL || presionArterial > MAX_PRESION_ARTERIAL
                || nivelOxigeno < MIN_NIVEL_OXIGENO;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public double getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(double frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public double getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(double presionArterial) {
        this.presionArterial = presionArterial;
    }

    public double getNivelOxigeno() {
        return nivelOxigeno;
    }

    public void setNivelOxigeno(double nivelOxigeno) {
        this.nivelOxigeno = nivelOxigeno;
    }
}

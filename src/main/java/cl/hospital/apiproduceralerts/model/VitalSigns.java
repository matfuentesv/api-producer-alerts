package cl.hospital.apiproduceralerts.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class VitalSigns implements Serializable {

    private static final long serialVersionUID = 1L;

    private String patientId;
    private double heartRate;
    private double bloodPressure;
    private double oxygenLevel;
    public boolean isAnomalous() {
        return heartRate < 50 || heartRate > 120 || bloodPressure > 140 || oxygenLevel < 90;
    }


}

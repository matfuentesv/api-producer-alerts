package cl.hospital.apiproduceralerts.controller;

import cl.hospital.apiproduceralerts.model.VitalSigns;
import cl.hospital.apiproduceralerts.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private ProducerService producerService;



    @PostMapping("/send")
    public ResponseEntity<String> sendVitalSigns(@RequestBody VitalSigns vitalSigns) {
        if (vitalSigns.isAnomalous()) {
            producerService.sendMessage(vitalSigns);
            return ResponseEntity.ok("Alerta enviada a RabbitMQ.");
        }
        return ResponseEntity.ok("Signos vitales normales.");
    }

}

package cl.hospital.apiproduceralerts.service;

import cl.hospital.apiproduceralerts.model.VitalSigns;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(VitalSigns vitalSigns){
        rabbitTemplate.convertAndSend("alertQueue",vitalSigns);
    }

}

package rabobank.com.springbootkafkapoc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rabobank.com.springbootkafkapoc.kafka.JsonKafkaProducer;
import rabobank.com.springbootkafkapoc.payload.User;

@RestController
@RequestMapping("api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(User user) {
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("JSON message sent to kafka topic");
    }

}

package rabobank.com.springbootkafkapoc.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic POCTopic() {
        return TopicBuilder.name("POCtopic").build();
    }

    @Bean
    public NewTopic POCJSONTopic() {
        return TopicBuilder.name("POCJSONtopic").build();
    }
}

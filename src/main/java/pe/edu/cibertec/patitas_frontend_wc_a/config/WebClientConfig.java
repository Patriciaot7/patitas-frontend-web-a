package pe.edu.cibertec.patitas_frontend_wc_a.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientConfig {

    @Bean
    public WebClient webClientAutenticacion(WebClient.Builder builder){
    return builder.build();
    }

}

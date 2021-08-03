package grayfox1031.demoecspringbootapi;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
@AutoConfigureAfter(RestTemplateAutoConfiguration.class)
public class DemoEcSpringbootApiConfig {

    private final RestTemplateBuilder restTemplateBuilder;

//    @Bean
//    public RestTemplate restTemplate() {
//        return restTemplateBuilder
//                .requestFactory(HttpComponentsClientHttpRequestFactory::new)
//                .build();
//    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
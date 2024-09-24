package dev.calculadora.openapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openApiInformation() {
        Server localServer = new Server().url("https://calculadoraunivesp-latest.onrender.com").description("Calculadora API Application");
        Contact contact = new Contact().email("robson@email.com").name("Robson");
        Info info = new Info().contact(contact).description("The Calculadora Open API")
                .summary("The Calculadora Open API").title("Calculadora API")
                .version("V1.0.0").license(new License().name("Apache 2.0").url("http://springdoc.org"));

        return new OpenAPI().info(info); //.addServersItem(localServer);
    }

}
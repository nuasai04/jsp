package es.etg.daw.dawes.jsp.productos.infraestructure.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

import es.etg.daw.dawes.jsp.productos.application.usecase.CreateProductoUseCase;
import es.etg.daw.dawes.jsp.productos.domain.repository.ProductoRepository;

@Configuration
public class RestClientConfig {

    //Recupero el valor del fichero application.properties
    @Value("${restclient.productos.baseurl}")
    private String productosBaseUrl;
    //private ProductoRepository productoRepository;
    
    @Bean
    public RestClient productoRestClient() {
        return RestClient.builder()
                .baseUrl(productosBaseUrl)
                .build();
    }


}
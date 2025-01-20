package ma.fstt.besoinservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class BesoinServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BesoinServiceApplication.class, args);
    }

}

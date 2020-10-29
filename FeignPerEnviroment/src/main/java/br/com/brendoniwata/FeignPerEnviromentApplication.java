package br.com.brendoniwata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignPerEnviromentApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignPerEnviromentApplication.class, args);
    }

}

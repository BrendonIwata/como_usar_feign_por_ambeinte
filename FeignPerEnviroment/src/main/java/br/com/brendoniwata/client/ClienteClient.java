package br.com.brendoniwata.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "${feign.name.site}", url = "${feign.url.site}")
public interface ClienteClient {

    @GetMapping("/cliente")
    String getCliente();
}

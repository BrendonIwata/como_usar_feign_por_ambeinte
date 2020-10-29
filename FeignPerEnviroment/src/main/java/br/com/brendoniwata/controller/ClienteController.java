package br.com.brendoniwata.controller;

import br.com.brendoniwata.client.ClienteClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    private ClienteClient clienteClient;

    private Logger logger = LoggerFactory.getLogger(ClienteController.class);

    @GetMapping("/cliente")
    public void cliente() {

        String response = clienteClient.getCliente();
        logger.info(response);
    }
}

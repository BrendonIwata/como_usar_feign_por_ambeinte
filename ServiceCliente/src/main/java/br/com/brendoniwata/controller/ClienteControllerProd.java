package br.com.brendoniwata.controller;

import br.com.brendoniwata.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prod")
public class ClienteControllerProd {

    @GetMapping("/cliente")
    public ResponseEntity<Cliente> getCliente() {
        Cliente cliente = Cliente.builder().comNome("José Silveira").comCumprimento("Olá eu sou um cliente de produção").build();
        return ResponseEntity.status(HttpStatus.OK).body(cliente);
    }
}

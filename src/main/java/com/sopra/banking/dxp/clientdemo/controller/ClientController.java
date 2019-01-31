package com.sopra.banking.dxp.clientdemo.controller;

import com.sopra.banking.dxp.clientdemo.mapper.ClientMapper;
import com.sopra.banking.dxp.clientdemo.model.api.ClientDTO;
import com.sopra.banking.dxp.clientdemo.model.entity.Client;
import com.sopra.banking.dxp.clientdemo.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clients")
public class ClientController  {

private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/all")
    public Flux<ClientDTO> getAll(){
        return clientService.getAll().map(client -> ClientMapper.map(client));
    }
    @PostMapping("/client")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ClientDTO> saveClient(@RequestBody Client client){
        return clientService.saveClient(client).map(client1 -> ClientMapper.map(client));
    }

}

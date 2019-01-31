package com.sopra.banking.dxp.clientdemo.service;

import com.sopra.banking.dxp.clientdemo.model.entity.Client;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientService {
    public Flux<Client> getAll();
    public Mono<Client> saveClient(@RequestBody Client client);
}

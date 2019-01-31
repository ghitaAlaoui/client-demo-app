package com.sopra.banking.dxp.clientdemo.service;


import com.sopra.banking.dxp.clientdemo.model.entity.Client;
import com.sopra.banking.dxp.clientdemo.repository.ClientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ClientService implements IClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Ghita";
    }
    @GetMapping("/all")
    public Flux<Client> getAll(){
        return clientRepository.findAll();
    }
    @PostMapping("/client")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Client> saveClient(@RequestBody Client client){
        return clientRepository.save(client);
    }
}

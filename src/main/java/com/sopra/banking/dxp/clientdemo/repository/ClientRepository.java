package com.sopra.banking.dxp.clientdemo.repository;

import com.sopra.banking.dxp.clientdemo.model.entity.Client;
import com.sun.corba.se.spi.ior.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface ClientRepository extends ReactiveMongoRepository<Client, ObjectId> {

}

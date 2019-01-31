package com.sopra.banking.dxp.clientdemo.mapper;

import com.sopra.banking.dxp.clientdemo.model.api.ClientDTO;
import com.sopra.banking.dxp.clientdemo.model.entity.Client;

public final class ClientMapper {
    private ClientMapper() {
    }

  public  static ClientDTO map(Client input) {
        return new ClientDTO()
                .setFirstName(input.getFirstName())
                .setLastName(input.getLastName());
    }
}

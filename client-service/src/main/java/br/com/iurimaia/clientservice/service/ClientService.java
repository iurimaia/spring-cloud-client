package br.com.iurimaia.clientservice.service;

import br.com.iurimaia.clientservice.entity.Client;

import java.util.List;

/**
 * Created by iurimaia on 18/08/17.
 */
public interface ClientService {

    List<Client> getAll();
    Client add(Client client);
    Client update(Client client);
    void delete(Client client);
    Client getById(Long id);
}
